# Java Gradle application for Jenkins

A small Java 21 application built with Gradle and exercised by a Jenkins
declarative pipeline.

## Run locally

Install JDK 21, then use the Gradle Wrapper to run:

```shell
# Windows
.\gradlew.bat clean test run

# Linux/macOS
bash gradlew clean test run
```

The application prints `Hello from Gradle!`; the test checks that message.
Gradle writes the runnable JAR to `build/libs/`.

## Run in Jenkins

1. Make JDK 21 available on the Jenkins agent (and set `JAVA_HOME` if needed).
   The checked-in Gradle Wrapper downloads and uses Gradle 8.14.3, so Gradle
   does not need to be separately installed or configured in Jenkins.
2. Create a Pipeline job pointing at this repository (or a Multibranch
   Pipeline job).
3. Ensure the job can check out its source, then run the pipeline. Jenkins
   reads the [`Jenkinsfile`](./Jenkinsfile) from the repository root.

The pipeline runs the tests and build, launches the application, and archives
the generated JAR as a build artifact.