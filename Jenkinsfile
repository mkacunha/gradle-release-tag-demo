pipeline {
  agent any
  stages {
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
        echo 'oiiiiiiiiiiiiiiiiiiiiiiii'
        withCredentials([[$class: 'SSHUserPrivateKeyBinding', credentialsId: "github-mkacunha-ssh", keyFileVariable: 'SSH_PRIVATE_KEY', passphraseVariable: '', usernameVariable: 'SSH_USERNAME']]){
            echo 'oiiiiiiiiiiiiiiiiiiiiiiii333333333'
            echo "keyy ->  $SSH_PRIVATE_KEY "
            echo "user ->  $SSH_USERNAME "

            //sh './gradlew release -Prelease.useAutomaticVersion=true'
        }
      }
    }
  }
}