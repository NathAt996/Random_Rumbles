package Enum;

public class OnlineOrder {

    private final String customerName;
    private final int orderID;
    private OnlineOrderStatus status;

    public OnlineOrder(String customerName, int orderID) {
        this.customerName = customerName;
        this.orderID = orderID;
        this.status = OnlineOrderStatus.PENDING;
    }

    public OnlineOrderStatus getStatus() {
        return this.status;
    }

    public void setStatus(OnlineOrderStatus newStatus) {
        System.out.println("Updating Order " + orderID + " from " + this.status + " to " + newStatus);
        this.status = newStatus;
    }

    public int getOrderId() {
        return orderID;
    }

    public String getCustomerName() {
        return customerName;
    }
}
