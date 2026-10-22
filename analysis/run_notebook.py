"""Execute all analysis cells without a Jupyter installation.

Run from anywhere. Add --write-outputs to refresh the saved notebook output.
No participant identity mapping or private data is required.
"""
from pathlib import Path
import argparse
import contextlib
import io
import json
import os
import platform

parser = argparse.ArgumentParser(description=__doc__)
parser.add_argument('--write-outputs', action='store_true')
args = parser.parse_args()
path = Path(__file__).resolve().with_name('study_analysis.ipynb')
notebook = json.loads(path.read_text())
os.chdir(path.parent)
namespace = {'__name__': '__main__'}
count = 0
for cell in notebook['cells']:
    if cell['cell_type'] != 'code':
        continue
    count += 1
    source = cell['source']
    if isinstance(source, list):
        source = ''.join(source)
    output = io.StringIO()
    with contextlib.redirect_stdout(output):
        exec(compile(source, f'notebook-cell-{count}', 'exec'), namespace)
    text = output.getvalue()
    print(text, end='')
    cell['execution_count'] = count
    cell['outputs'] = [{'output_type': 'stream', 'name': 'stdout', 'text': text}] if text else []
if args.write_outputs:
    notebook['metadata']['language_info']['version'] = platform.python_version()
    path.write_text(json.dumps(notebook, indent=1) + '\n')
print(f'Executed {count} code cells successfully.')
