node{
    stage('SCM checkout'){
      git "https://github.com/Luncedo/javaApp.git"

    }
    stage('Compile-package'){
      sh 'mvn package'
    }
}