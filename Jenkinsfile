pipeline{
  tools {
    maven 'marven-3'
  }
    agent any
    stages{
        stage("git checkout"){
            steps{
                git branch: 'main', url: 'https://github.com/Luncedo/javaApp.git'
            }
        }
        stage("maven build"){
            steps{
             sh "mvn clean package"
            }
        }
    }
}