#!groovy

def createTag() {
    withCredentials([gitUsernamePassword(credentialsId: 'github-mkacunha', gitToolName: 'git-tool')]) {
        dir(env.PWD) {
             sh "./gradlew release -Prelease.useAutomaticVersion=true"
        }
    }

    return getCurrentVersion()
}

def buildDockerImage(version) {
    def newDockerImage = "mkacunha/gradle-release:$version"
    dir(env.PWD) {
         sh "./gradlew clean build -x Test"
    }
    return newDockerImage
}

def runAcceptanceTest(environment) {
    dir(env.PWD) {
        sh './gradlew unitTest'
        sh './gradlew integrationTest'
        sh './gradlew componentTest'
        sh './gradlew mutationTest'
    }

    return true
}

private def getCurrentVersion() {
    def lines = readFile("${env.PWD}/gradle.properties").split("\n")
    def result = "latest"

    for (line in lines) {
        if (line.contains("version")) {
            result = line.split("=")[1].trim()
        }
    }
    return result
}

return this