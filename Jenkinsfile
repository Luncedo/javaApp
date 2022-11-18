pipeline{
  tools {
    maven 'marven-3'
  }
    agent any
    stages{
        stage("compile stage"){
            steps{
             sh 'mvn clean compile'
            }
        }
    stage ('Deployment Stage') {
            steps{
             sh 'mvn deploy'
            }
        }
    }
}

