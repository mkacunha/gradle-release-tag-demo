#!groovy

def createTag() {
    withCredentials([gitUsernamePassword(credentialsId: 'github-mkacunha', gitToolName: 'git-tool')]) {
        dir(env.PWD) {
             sh "./gradlew release -Prelease.useAutomaticVersion=true"
        }
    }

    return '1.0.0'
}

def buildDockerImage(version) {
    def newDockerImage = "mkacunha/gradle-release:$version"
    dir(env.PWD) {
         sh "./gradlew clean build -x Test"
         sh "ls"
         sh "ls ./build/libs"
         //sh "docker build --pull -t ${newDockerImage} ."
    }
    return newImage
}

return this