def call() {
    timeout(time: 1, unit: "MINUTES") {
        waitForQuaityGate  abortPipeline: false
    }
}
