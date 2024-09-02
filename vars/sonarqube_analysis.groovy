def call (String SonarQubeAPI, String ProjectName, String ProjectKey) {
    withSonarQubeEnv ("${SonarQubeAPI}") {
        sh " $SONAR_HOME/bin/sonar-scanner -Dsonar.ProjectName= ${ProjectName} -Dsonar.ProjectKey= ${ProjectKey} -X"
    }
}
