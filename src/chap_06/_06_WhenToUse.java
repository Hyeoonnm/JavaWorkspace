package chap_06;

public class _06_WhenToUse {

    public static int getPower(int number, int exponent) {
        int result = 1;

        for (int i = 0; i < number; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드가 필요한 이유

        // 1. 코드의 중복을 줄일 수 있다.

        System.out.println(getPower(5,2));
    }
}
