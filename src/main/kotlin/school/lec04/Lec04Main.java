package school.lec04;

public class Lec04Main {
    public static void main(String[] args) {

        JavaMoney money1 = new JavaMoney(200L);
        JavaMoney money2 = new JavaMoney(100L);
        if(money1.compareTo(money2)>0){
            System.out.println("Java money 1이 money2보다 금액이 큽니다");
        }
    }
}
