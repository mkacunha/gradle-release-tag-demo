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
        stage('unit test') {
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
        withCredentials(bindings: [gitUsernamePassword(credentialsId: 'github-mkacunha', gitToolName: 'git-tool')]) {
          sh './gradlew release -Prelease.useAutomaticVersion=true'
        }

      }
    }

  }
}