package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {

        // 반복문 DoWhile

        // 수영장에서 수영을 하는 모습
        int distance = 25; // 전체 거리 25m
        int move = 0; // 현재 이동 거리 0m
        int height = 2; // 키 2m

        /*
        while (조건) {
            .. 수행 명령 ..
        }
        */

        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리 : " + move);
            System.out.println();
            move += 3; // 3m 이동
        }
        System.out.println("도착");

        System.out.println(" --- 반복문 #1 --- ");

        // 키가 매우 큰 사람
        move = 0;
        height = 25;

        while(move + height < distance) {
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리 : " + move);
            System.out.println();
            move += 3; // 3m 이동
        }
        System.out.println("도착");

        System.out.println(" --- 반복문 #2 --- ");

        // Do While 반복문
        do {
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리 : " + move);
            System.out.println();
            move += 3; // 3m 이동
        }
        while (move + height < distance);
        System.out.println("도착");

        System.out.println(" --- 반복문 #3 --- ");
    }

}
