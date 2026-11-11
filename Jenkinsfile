pipeline {
    agent any

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
