package chap_04;

public class _06_While {
    public static void main(String[] args) {

        // 반복문 While

        // 수영장에서 수영을 하는 모습
        int distance = 25; // 전체 거리 25m
        int move = 0; // 현재 이동 거리 0m

        /*
        while (조건) {
            .. 수행 명령 ..
        }
        */

        while(move < distance) { // 현재 이동 거리가 전체 거리보다 작다는 조건이 참인 동안 수행
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리 : " + move);
            System.out.println();
            move += 3; // 3m 이동
        }
        System.out.println("도착");
    }
}
