pipeline {
  agent any
  stages {
    stage('clean') {
      steps {
        sh './gradlew clean'
      }
    }

    stage('build') {
      steps {
        sh './gradlew build -x Test'
      }
    }

    stage('test') {
      parallel {
        stage('unit-test') {
          steps {
            sh './gradlew unitTest'
          }
        }

        stage('integration-test') {
          steps {
            sh './gradlew integrationTest'
          }
        }

        stage('component-test') {
          steps {
            sh './gradlew componentTest'
          }
        }

        stage('mutation-test') {
          steps {
            sh './gradlew mutationTest'
          }
        }

      }
    }

    stage('tag') {
      steps {
        withCredentials(
               [string(credentialsId: 'git-email', variable: 'GIT_COMMITTER_EMAIL'),
                string(credentialsId: 'git-account', variable: 'GIT_COMMITTER_ACCOUNT'),
                string(credentialsId: 'git-name', variable: 'GIT_COMMITTER_NAME'),
                string(credentialsId: 'github-token', variable: 'GITHUB_API_TOKEN')]) {
                   sh echo '${GIT_COMMITTER_EMAIL}'
                   sh 'git config user.email "${GIT_COMMITTER_EMAIL}"'
                   sh 'git config user.name "${GIT_COMMITTER_NAME}"'
                   sh './gradlew release -Prelease.useAutomaticVersion=true'
                }
      }
    }

  }
}