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
        sh 'git remote -v'

//         withCredentials([[$class: 'SSHUserPrivateKeyBinding', credentialsId: "github-mkacunha-ssh", keyFileVariable: 'SSH_PRIVATE_KEY', passphraseVariable: '', usernameVariable: 'SSH_USERNAME']]){
//             sh 'git remote -v'
//             echo 'oiiiiiiiiiiiiiiiiiiiiiiii'
//             echo "keyy ->  ${SSH_PRIVATE_KEY} "
//             echo "user ->  ${SSH_USERNAME} "
//             sh 'mkdir -p ~/.ssh'
//             sh 'echo "$SSH_PRIVATE_KEY" > ~/.ssh/id_rsa'
//             sh 'cat ~/.ssh/id_rsa'
//
//             sh './gradlew release -Prelease.useAutomaticVersion=true'
//         }
      }
    }
  }
}