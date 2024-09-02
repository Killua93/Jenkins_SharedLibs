def call(String GitBranch, String GitUrl) {
    git branch: "${GitBranch}", 
        url: "${GitUrl}"
}
