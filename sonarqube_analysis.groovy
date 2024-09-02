def call (string SonarQubeAPI, string ProjectName, string ProjectKey) {
    withSonarQubeEnv ("${SonarQubeAPI}") {
        sh " $SONAR_HOME/bin/sonar-scanner -Dsonar.ProjectName= "${ProjectName} -Dsonar.ProjectKey= "${ProjectKey} -X"
    }
}
