# Java Gradle application for Jenkins

A small Java 21 application built with Gradle and exercised by a Jenkins
declarative pipeline.

## Run locally

Install JDK 21 and Gradle 8.14.3 or newer, then run:

```shell
gradle clean test run
```

The application prints `Hello from Gradle!`; the test checks that message.
Gradle writes the runnable JAR to `build/libs/`.

## Run in Jenkins

1. Configure a JDK installation named **JDK 21** and a Gradle installation
   named **Gradle 8.14.3** in **Manage Jenkins → Tools**. Use Gradle 8.14.3
   or newer.
2. Create a Pipeline job pointing at this repository (or a Multibranch
   Pipeline job).
3. Ensure the job can check out its source, then run the pipeline. Jenkins
   reads the [`Jenkinsfile`](./Jenkinsfile) from the repository root.

The pipeline runs the tests and build, launches the application, and archives
the generated JAR as a build artifact.