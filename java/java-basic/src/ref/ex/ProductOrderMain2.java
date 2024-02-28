package ref.ex;

//class1.ex.ProductOrderMain을 리팩토링 해보자.
//productName, price, quantity를 포함하는 ProductOrder 클래스를 사용하시오.
public class ProductOrderMain2 {

    public static void main(String[] args) {
        ProductOrder order1 = createOrder("두부", 2000, 2);
        ProductOrder order2 = createOrder("김치", 5000, 1);
        ProductOrder order3 = createOrder("콜라", 1500, 2);

        ProductOrder[] orders = {
            order1, order2, order3
        };

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        //getTotalAmount(orders); 까지 치고 ctrl+alt+v하면 타입, 변수명 자동생성
        System.out.println("총 결제 금액: " + totalAmount);

    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
