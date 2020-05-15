package cooperation;

public class TakeTransTest {
    public static void main(String[] args) {
        Student studentKim = new Student("효진", 10000);
        Student studentPark = new Student("막례", 10000);
        Student studentEdward = new Student("Edward", 20000);

        Bus bus500 = new Bus(500);
        Bus bus200 = new Bus(200);
        Subway subway2 = new Subway(2); // subway number를 받고 지하철로 번돈 계산과 승객 수를 카운트해줌
        Subway subway1 = new Subway(1);
        Taxi taxi = new Taxi(30000); //30000 += 오늘 번 돈 계산

        studentKim.takeSubway(subway2); // subway2를 탔을때, 학생이 쓴 돈을 계산해줌
        studentPark.takeBus(bus500);
        studentEdward.takeTaxi(taxi); // 택시를 탔을 때, 얼마를 썼는지 계산해줌


        studentKim.showInfo(); // 계산값을 토대로 문자열을 반환
        studentPark.showInfo();
        studentEdward.showInfo();

        bus200.showBusInfo();
        bus500.showBusInfo();
        subway1.showSubwayInfo();
        subway2.showSubwayInfo();
        taxi.showTaxiInfo();





    }
}
