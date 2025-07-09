def call(Map config = [:]) {
    def target = config.target ?: 'linux64'
    def arch = config.arch ?: 'x86_64'
    def type = config.type ?: 'Release'

    script {
        def dynamicStage = "${target} setup build"

        stage(dynamicStage) {
            echo "Building for ${target}"
            echo "Architecture: ${arch}"
            echo "Build Type: ${type}"
            // ممكن تحط هنا build steps زي sh أو bat أو أي حاجة
        }
    }
}
