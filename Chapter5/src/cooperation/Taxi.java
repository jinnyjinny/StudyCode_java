package cooperation;

public class Taxi {
    private int passengerCount;
    private int money;

    public Taxi(int money) {
        this.money = money;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;

    }

    public void showTaxiInfo() {
        System.out.println("택시의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다");
    }

}
