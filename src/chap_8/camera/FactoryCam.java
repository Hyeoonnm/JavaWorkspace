package chap_8.camera;

import chap_8.detector.Detectable;
import chap_8.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {
    public Detectable detectable;
    public Reportable reportable;

    public void setDetectable(Detectable detectable) {
        this.detectable = detectable;
    }

    public void setReportable(Reportable reportable) {
        this.reportable = reportable;
    }

    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");
    }

    public void detect() {
        detectable.detect();
    }

    public void report() {
        reportable.report();
    }
}
