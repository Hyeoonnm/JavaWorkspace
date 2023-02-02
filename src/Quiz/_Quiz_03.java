package Quiz;

public class _Quiz_03 {
    public static void main(String[] args) {
        String s1 = "901231-1234567";
        String s2 = "030708-4567890";

        System.out.println(s1.substring(0, 8)); // 0 위치부터 8 위치 직전까지
        System.out.println(s2.substring(0, s2.indexOf("-") + 2)); // 0 위치부터  - 위치 + 2 직전까지
    }
}
