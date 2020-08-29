# android-screenshot-testing

Android screenshot testing example using https://github.com/Karumi/Shot.

## Idea

The sample shows a (hypothetical) migration from classic Android radial gradient implementation to Jetpack Compose one.
Screenshot testing helps prevent regressions in this and similar situations.

## Recording and comparing screenshots

Recording screenshots:
```bash
./gradlew debugExecuteScreenshotTests -Precord
```

Comparing screenshots with previously recorded ones:
```bash
./gradlew debugExecuteScreenshotTests
```

License
=======

    Copyright 2020 Alexander Krupa

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
