def call(Map config) {
    def target = config.target
    def arch = config.arch
    def type = config.type

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
