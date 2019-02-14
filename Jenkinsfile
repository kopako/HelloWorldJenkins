pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh './gradlew build --stacktrace'
            }
        }
    }
    post {
        always {
          cleanWs()
        }
        failure {
          slackSend (
            channel: '#rueppellii-jenkins',
            color: 'danger',
            message: "${currentBuild.fullDisplayName} has failed. (<${env.BUILD_URL}|Open>)"
           )
        }
        success {
          slackSend (
            channel: '#rueppellii-jenkins',
            color: 'good',
            message: "${currentBuild.fullDisplayName} has build. (<${env.BUILD_URL}|Open>)"
           )
        }
    }
}
