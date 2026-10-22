# TestCompass plugin

<!-- Plugin description -->
TestCompass is an IntelliJ IDEA plugin that uses coverage information, source code,
and existing tests to suggest behaviors to test and expected outcomes.
<!-- Plugin description end -->

Build and run tests with JDK 21: `./gradlew test buildPlugin`.
The installable archive is written to `build/distributions/`.
Use `./gradlew runIde` to launch a development IDE.

Configure `AMPLIFY_BASE` with your own Amplify-compatible API service URL.
Provide a bearer token through the plugin settings or `AMPLIFY_BEARER`.
An optional `AMPLIFY_MODEL_ID` selects a model; otherwise the service default is used.
Environment variables or an untracked `plugin.env` in the working directory are supported.
No service endpoint or credentials are bundled. This protocol is not a generic OpenAI API client.

This source distribution uses the neutral package and plugin ID `org.testcompass.plugin`;
IntelliJ therefore treats it as a separate installation from a differently identified release.
Runtime interaction logs may contain source code and prompts. Keep generated `.testcompass/`
directories private. The study analysis is in the repository's `analysis/` folder.
