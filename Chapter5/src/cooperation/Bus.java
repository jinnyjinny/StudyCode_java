package cooperation;

public class Bus {
    private int busNumber;
    private int passengerCount;
    private int money;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
        //this.money = money; // 나중에 값을 안넣어줄거니까 여기에서 초기화하면 안됨
    }

    public void take(int money) {
        this.money += money; //money += money 와 차이가 뭐지?
        passengerCount++; // 여기는 생성자 초기화 안해줘도 되는 건가?? 그리고 멤버변수로 안받아도 되나?

    }

    public void showBusInfo() {
        System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다");
    }




}
