package works.weave.socks.orders.resources;

import works.weave.socks.orders.entities.Address;
import works.weave.socks.orders.entities.Card;
import works.weave.socks.orders.entities.Customer;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PaymentRequest {
    private Address address;
    private Card card;
    private Customer customer;
    private float amount;
    private String fake;

    // For jackson
    public PaymentRequest() {
    }

    public PaymentRequest(Address address, Card card, Customer customer, float amount) {
        this.address = address;
        this.customer = customer;
        this.card = card;
        this.amount = amount;
        try (InputStream input = new FileInputStream("src/main/resources/config.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            this.fake = prop.getProperty("stringtoolong");
        }catch(Exception e){

        }
    }

    @Override
    public String toString() {
        return "PaymentRequest{" +
                "address=" + address +
                ", card=" + card +
                ", customer=" + customer +
                ", fake=" + fake +
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

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getFake() {
        return fake;
    }

    public void setFake(String fake) {
        this.fake = fake;
    }
}
