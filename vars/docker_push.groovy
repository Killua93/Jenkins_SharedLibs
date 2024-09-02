def call(String dockerhubusr, String Docker_Image, String Docker_Tag) {
   withCredentials([usernamePassword(credentialsId: "docker_creds" , passwordVariable: "dockerhubpass", usernameVariable: "dockerhubusr" )]) {
       sh "docker login -u ${dockerhubusr} -p ${dockerhubpass}"
                                      }
   sh "docker push ${dockerhubusr}/${Docker_Image}:${Docker_Tag}"
}
