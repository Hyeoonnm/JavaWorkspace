package chap_8.camera;

import chap_8.detector.Detectable;
import chap_8.reporter.Reportable;

public class SpeedCam extends Camera implements Detectable, Reportable {
    private Detectable detectable;
    private Reportable reportable;

    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호 인식");
    }

    public void detect() {
        this.detectable.detect();
    }

    public void report() {
        this.reportable.report();
    }

    public void setDetectable(Detectable detectable) {
        this.detectable = detectable;
    }

    public void setReportable(Reportable reportable) {
        this.reportable = reportable;
    }
}
