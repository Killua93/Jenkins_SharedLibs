def call(String DockerHub_User, String Docker_Image, String Docker_Tag) {
    sh "docker build -t ${DockerHub_User}/${Docker_Image}:${Docker_Tag} . "
}
