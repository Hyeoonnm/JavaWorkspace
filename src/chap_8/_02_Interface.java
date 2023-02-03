package chap_8;

import chap_8.camera.FactoryCam;
import chap_8.detector.AdvancedFireDetector;
import chap_8.detector.Detectable;
import chap_8.detector.FireDetector;
import chap_8.reporter.NormalReporter;
import chap_8.reporter.Reportable;
import chap_8.reporter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스

        Reportable normalReporter = new NormalReporter();
        normalReporter.report();

        Reportable videoReporter = new VideoReporter();
        videoReporter.report();

        System.out.println("---------------------------------");

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advencedFireDetector = new AdvancedFireDetector();
        advencedFireDetector.detect();

        System.out.println("---------------------------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetectable(advencedFireDetector);
        factoryCam.setReportable(videoReporter);

        factoryCam.detect();
        factoryCam.report();
    }
}
