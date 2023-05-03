def call (String region, String imagename, String version) {
    sh 'podman login -u "{$user}" -p "$pass" jed.ocir.io
    sh "podman build -t $region/$imagename:$version ."

}
