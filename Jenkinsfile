pipeline {
    agent any
    stages {
        }
        stage('develop') {
          when {
              branch 'develop'
          }
            steps {
                echo 'develop'
                sh './gradlew test --stacktrace'
            }
        }
        stage('master') {
          when {
            branch 'master'
          }
            steps {
                echo 'master'
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
