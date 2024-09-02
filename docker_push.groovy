def call(String dockerhubusr, String Docker_Image, String Docker_Tag) {
   withCreadentials([usernamePassword(credentialsId: "docker_creds" , passwordVariables: "dockerhubpass", usernameVariable: "dockerhubusr" )]) {
       sh " docker login -u ${dockerhubusr} -p ${dockerhubpass}"
                                      }
   sh "docker push ${dockerhubusr}/${Docker_Image}:${Docker_Tag}"
}
