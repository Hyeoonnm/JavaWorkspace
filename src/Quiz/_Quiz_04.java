package Quiz;

public class _Quiz_04 {
    public static void main(String[] args) {

        String car = "일반";
        int hour = 10;
        int price = 4000;
        int 주차요금 = price * hour;


        if(car == "경차" || car == "장애인") {
            if (주차요금 > 30000) {
            주차요금 = 30000 / 2;
                System.out.println("주차 요금 : " + 주차요금);
            }
            else {
                System.out.println("주차 요금 : " + 주차요금);
            }
        } else if (car == "일반") {
            if (주차요금 > 30000)
                주차요금 = 30000;
            System.out.println("주차 요금 : " + 주차요금);
        }
    }
}
