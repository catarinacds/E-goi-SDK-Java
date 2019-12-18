import groovy.json.JsonSlurperClassic

timeout(time: 15, unit: 'MINUTES') {
    node {
       stage('Git SCM') {
           checkout scm
       }
       stage('Build') {
           // Clean previously built sdks
           cleanWs deleteDirs: true, patterns: [[pattern: '*-sdk*', type: 'INCLUDE']]
           copyArtifacts filter: 'java-sdk.zip', fingerprintArtifacts: true, projectName: 'SDK Configs/master', selector: lastWithArtifacts(), target: './'
           sh "unzip java-sdk.zip -d java-sdk"
       }
       //stage('Test'){
       //     sh "/usr/local/bin/mvn clean install"
       //}
       stage('Deploy') {
           def json = readFile(file:'java-sdk/configJava.json')
           def data = new JsonSlurperClassic().parseText(json)
           def version = data.artifactVersion

           sh "git commit -am \"Version:  ${version}\""
           sh 'git push'
           sh "git tag ${version}"
           sh 'git push --tags'
       }
       stage('SonarQube analysis') {
           withSonarQubeEnv('E-Goi SonarQube') {
             sh "/usr/bin/sonar-scanner"
           }
       }
   }
}
