package Quiz;

public class _Quiz_05 {
    public static void main(String[] args) {

        String[] size = {
                "사이즈 250", "사이즈 255", "사이즈 260", "사이즈 265", "사이즈 270", "사이즈 275", "사이즈 280", "사이즈 285", "사이즈 290", "사이즈 295"
        };
        for (int i = 0; i < size.length; i++) {
            System.out.println(size[i] + "재고 있음");
        }

        System.out.println("-----------------------");
        
        int[] sizeArray = new int[10];
        for (int i = 0; i < size.length; i++) {
            sizeArray[i] = 250 + (5 * i);
            System.out.println("사이즈 " + sizeArray[i] + " 재고있음");
        }
        System.out.println("-----------------------");

        for (int size2 :
                sizeArray) {
            System.out.println("사이즈 " + size2 + " 재고있음");
        }
        
    }
}
