package chap_10;



public class _02_AnonymousClass2 {
    public static void main(String[] args) {

        HomeMadeBurger momMadeBurger = new HomeMadeBurger() {
            @Override
            public void cook() {
            }
        };
    }

    public static HomeMadeBurger getMomMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 엄마표 수제버거");
                System.out.println("재료 : 빵, 소고기 패티, 해시브라운, 양상추, 마요네즈, 피클");
            }
        };
    }
}

abstract class HomeMadeBurger {
    public abstract void cook();

    }
