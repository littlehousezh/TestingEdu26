# TestingEdu26

- **`plugin/`** — TestCompass IntelliJ plugin source, build configuration, and tests.
  See its README for build and API configuration instructions.
- **`analysis/study_analysis.ipynb`** — readable, executed analysis of activity allocation,
  test-suite quality, survey ratings, and redundant test methods.
- **`analysis/data/`** — de-identified numerical analysis inputs. Demographics are aggregated.

Open the notebook in Jupyter and choose **Restart Kernel and Run All**. Its analysis cells
use only the Python 3.10+ standard library. Alternatively, run
`python analysis/run_notebook.py` from this directory to verify every code cell.
The notebook explains denominators, scoring decisions, statistical tests, and limitations.

Raw submissions, recordings, survey free text, participant identity mappings, credentials,
and original Git history are not included. Participant labels are newly assigned codes.
The repository owner and commit author remain visible as the requested GitHub handle;
this repository is not an anonymous submission URL.
