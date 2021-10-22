package lambda;

import java.util.function.Predicate;

public class question2 {
    public static void main(String[] args) {
        Predicate<order> statuscheck=(order)->(order.orderStatus.equals("ACCEPTED") ||order.orderStatus.equals("COMPLETED"));
        Predicate<order> pricecheck=(order)->(order.orderprice>10000);
        order order1=new order(11000,"COMPLETED");
        
        boolean result=statuscheck.and(pricecheck).test(order1);
        if(result)
            System.out.println(order1 +" is ACCEPTED");
        else
            System.out.println(order1+" is REJECTED");



    }

}


class order {
    int orderprice;
    String orderStatus;

    public order(int orderprice, String orderStatus) {
        this.orderprice = orderprice;
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "order{" +
                "orderprice=" + orderprice +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }
}