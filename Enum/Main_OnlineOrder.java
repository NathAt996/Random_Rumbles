package Enum;

public class Main_OnlineOrder {

    public static void displayStatusMessage(OnlineOrder order) {

        System.out.print("Current status message for Order " + order.getOrderId() + ": ");

        switch (order.getStatus()) {

            case PENDING:
                System.out.println("Your order is awaiting confirmation.");
                break;
            case PROCESSING:
                System.out.println("We are actively preparing your items for shipment.");
                break;
            case SHIPPED:
                System.out.println("Your package has left the warehouse and is on its way!");
                break;
            case OUT_FOR_DELIVERY:
                System.out.println("Your package is with the local carrier for delivery today.");
                break;
            case DELIVERED:
                System.out.println("Your order has been successfully delivered. Enjoy!");
                break;
            case CANCELLED:
                System.out.println("Your order was cancelled.");
                break;
            case RETURNED:
                System.out.println("Your return has been processed.");
                break;
        }

        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {

        OnlineOrder customerOrder = new OnlineOrder("John Frum", 515251);

        displayStatusMessage(customerOrder);

        customerOrder.setStatus(OnlineOrderStatus.PROCESSING);
        displayStatusMessage(customerOrder);

        customerOrder.setStatus(OnlineOrderStatus.SHIPPED);
        displayStatusMessage(customerOrder);

        customerOrder.setStatus(OnlineOrderStatus.DELIVERED);
        displayStatusMessage(customerOrder);

        OnlineOrder cancelledOrder = new OnlineOrder("Jane Doe", 672335);
        displayStatusMessage(cancelledOrder);
        cancelledOrder.setStatus(OnlineOrderStatus.CANCELLED);
        displayStatusMessage(cancelledOrder);
    }
}
