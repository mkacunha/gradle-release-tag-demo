pipeline {
  agent any
//   stages {
//     stage('clean') {
//       steps {
//         sh './gradlew clean'
//       }
//     }
//
//     stage('build') {
//       steps {
//         sh './gradlew build -x Test'
//       }
//     }
//
//     stage('test') {
//       steps {
//         sh './gradlew unitTest'
//         sh './gradlew integrationTest'
//         sh './gradlew componentTest'
//         sh './gradlew mutationTest'
//       }
//     }

    stage('tag') {
      steps {
        withCredentials([usernamePassword(credentialsId: 'github-mkacunha-ssh', passwordVariable: 'PASSWORD', usernameVariable: 'USERNAME')]) {
            echo credentialsId
            echo passwordVariable
            echo usernameVariable
            echo 'oiiiiiiiiiiiiiiiiiiiiiiii'
            sh './gradlew release -Prelease.useAutomaticVersion=true'
        }
      }
    }

  }
}