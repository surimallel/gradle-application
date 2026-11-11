pipeline {
    agent any

    tools {
        jdk 'JDK 21'
        gradle 'Gradle 8.14.3'
    }

    stages {
        stage('Build and test') {
            steps {
                sh 'gradle clean test build'
            }
        }

        stage('Run application') {
            steps {
                sh 'gradle run'
            }
        }
    }

    post {
        success {
            archiveArtifacts artifacts: 'build/libs/*.jar', fingerprint: true
        }
    }
}
