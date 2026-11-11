pipeline {
    agent any

    stages {
        stage('Build and test') {
            steps {
                sh 'bash gradlew clean test build'
            }
        }

        stage('Run application') {
            steps {
                sh 'bash gradlew run'
            }
        }
    }

    post {
        success {
            archiveArtifacts artifacts: 'build/libs/*.jar', fingerprint: true
        }
    }
}
