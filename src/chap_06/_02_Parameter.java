package chap_06;

public class _02_Parameter {

    public static void power(int x) { // int x = Parameter (전달값)
        // 전달값이 있는 메소드
        int result = x * x;
        System.out.println(x + "의 2승은 " + result);
    }

    public static void powerByExp(int x, int y) {
        int result = 1;

        for (int i = 0; i < y; i++) {
            result *= x;
        }
        System.out.println(x + "의 " + y + "승은 " + result);

    }

    public static void main(String[] args) {
        // 전달값 , Parameter
        // 2 -> 2 * 2 = 4
        // 3 -> 3 * 3 = 9

        // Argument, 인수
        power(2); // 2 * 2 = 4
        power(3); // 3 * 3 = 9

        powerByExp(2, 3); // 2 * 2 * 2 = 8
        powerByExp(3, 3); // 3 * 3 * 3 = 27
        powerByExp(10, 0); // 1
    }
}
