package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order(){}
    public Order(Date moment, OrderStatus status, Client client){
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public Double total(){
        double sum = 0;
        for(OrderItem item: items){
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nORDER SUMMARY: \n");
        sb.append("Order moment: " + sdf.format(moment));
        sb.append("\nOrder status: " + status);
        sb.append("\nClient: " + client.getName() +
                  " (" + sdf2.format(client.getBirthDate()) +
                  ") - " + client.getEmail());
        sb.append("\nOrder items:\n");
        for(OrderItem item: items){
            sb.append(item.getProduct().getName() +
                    ", $" + String.format("%.2f", item.getProduct().getPrice()) +
                    ", Quantity: " + item.getQuantity() +
                    ", Subtotal: $" + String.format("%.2f", item.getPrice()) + "\n");

        }
        sb.append("Total price: $" + String.format("%.2f", total()));
        return sb.toString();
    }
}