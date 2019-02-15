pipeline {
    agent any
    stages {
        stage('developStage') {
            steps {
                sh 'git checkout develop'
                sh './gradlew test --stacktrace'
            }
        }
        stage('masterStage') {
          when {
            branch 'master'
          }
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
    }
}
