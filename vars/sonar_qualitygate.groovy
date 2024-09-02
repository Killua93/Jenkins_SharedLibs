def call() {
    timeout(time: 1, Unit: "MINUTES") {
        waitForQuaityGate  abortPipeline: false
    }
}
