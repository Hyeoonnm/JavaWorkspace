package Quiz;

import chap_8.camera.SpeedCam;
import chap_8.detector.AccidentDetector;
import chap_8.reporter.VideoReporter;

public class _Quiz_08 {
    public static void main(String[] args) {
        SpeedCam speedCam = new SpeedCam();
        speedCam.setDetectable(new AccidentDetector());
        speedCam.setReportable(new VideoReporter());
        speedCam.detect();
        speedCam.report();
    }
}
