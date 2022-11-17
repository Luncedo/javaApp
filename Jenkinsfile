node{
    stage('SCM checkout'){ 
      git "https://github.com/Luncedo/javaApp.git"
    }
    stage('Compile-package'){
      def mvnHome = tool name: 'marven-3', type: 'maven'
      sh "${mvnHome}/bin/mvn package"
    }
}