package chap_07.camera;

public final class ActionCam extends Camera{
    public final String lens; // = "광각 렌즈";

    public ActionCam() {
        super("액션 카메라");
        lens = "광각 렌즈"; // 생성자는 선언과 동시에 만들어지기 때문에 가능하다
    }

    public final void makeVideo() {
        System.out.println(this.name + " : " + this.lens + "로 멋진 비디오를 제작합니다.");
    }
}
