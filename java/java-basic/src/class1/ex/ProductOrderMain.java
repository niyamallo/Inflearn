package class1.ex;

//상품 주문 정보를 담을 수 있는 ProductOrder 클래스를 만들자.
//ProductOrder 클래스는 productName, price, quantity를 멤버 변수로 한다.
//ProductOrderMain 클래스 안에 main() 메서드를 포함하여, 여러 상품의 주문 정보를 배열로 관리하고,
//그 정보들을 출력하고, 최종 결제 금액을 계산하여 출력하자.
public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "김치";
        order2.price = 5000;
        order2.quantity = 1;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 2;

        ProductOrder[] orders = {
                order1, order2, order3
        };

        int totalAmount = 0;
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
            totalAmount += order.price * order.quantity;
        }
        System.out.println("총 결제 금액: " + totalAmount);
    }
}
