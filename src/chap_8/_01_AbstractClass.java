package chap_8;

import chap_8.camera.Camera;
import chap_8.camera.FactoryCam;
import chap_8.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction)

        // abstract
        // 추상 클래스 (아직 완성되지 않은 클래스)
        // 추상 메소드 (추상 클래스에서만 사용 가능한, 껍데기만 있는 메소드)

        // Camera camera = new Camera(); // 추상 클래스 그 자체는 완성되지 않았기 때문에 객체 생성이 불가능

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
