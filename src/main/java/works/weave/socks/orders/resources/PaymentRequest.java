package works.weave.socks.orders.resources;

import works.weave.socks.orders.entities.Address;
import works.weave.socks.orders.entities.Card;
import works.weave.socks.orders.entities.Customer;

public class PaymentRequest {
    private Address address;
    private Card card;
    private Customer customer;
    private float total;

    // For jackson
    public PaymentRequest() {
    }

    public PaymentRequest(Address address, Card card, Customer customer, float total) {
        this.address = address;
        this.customer = customer;
        this.card = card;
        this.total = total;
    }

    @Override
    public String toString() {
        return "PaymentRequest{" +
                "address=" + address +
                ", card=" + card +
                ", customer=" + customer +
                '}';
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
