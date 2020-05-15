package chapter5;

import chapter5.Order;

public class OrderTest {
    public static void main(String[] args) {
        Order orderHong = new Order();

        orderHong.orderNumber = 20190721001L; //20190721001 이 아니다
        orderHong.orderId = "abc123";
        orderHong.orderDate = "2019년 7월 21일";
        orderHong.orderName = "홍길순";
        orderHong.packageNumber = "PD0345-12";
        orderHong.orderAddress = "서울시 영등포구 여의도동 20번지";

        System.out.println("주문 번호: " + orderHong.orderNumber);
        System.out.println("주문자 아이소: " + orderHong.orderId);
        System.out.println("주문 날짜: " + orderHong.orderDate);
        System.out.println("주문자 이름: " + orderHong.orderName);
        System.out.println("주문 상품 번호: " + orderHong.packageNumber);
        System.out.println("배송 주소: " + orderHong.orderAddress);

    }
}
