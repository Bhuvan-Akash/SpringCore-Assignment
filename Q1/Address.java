package Q1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
public class Address {
	String country;
    String state;
    String city;
    int zip;
    int street;

    public Address(String country, String state, String city, int zip, int street) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.zip = zip;
        this.street = street;
    }

    public String getCountry() {
        return country;
    }
    public String getState() {
        return state;
    }
    public String getCity() {
        return city;
    }
    public int getZip() {
        return zip;
    }
    public int getStreet() {
        return street;
    }

    @Override
    public String toString() {
        return "{Country:- "+getCountry()+", City:-"+getCity()+", State:-"+getState()+", Zipcode:-"+getZip()+", Street:-"+getStreet()+"}";
    }
}
class Customer{
    private int customerId;
    private String customerName;
    private long customerContact;
    private Address customerAddress;

    public Customer(int customerId, String customerName, long customerContact, Address customerAddress) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerContact = customerContact;
        this.customerAddress = customerAddress;
    }
    public void showDetails(){
        System.out.println("Name:-"+getCustomerName()+" ID:-"+getCustomerId()+" Contact:-"+getCustomerContact()+" Address:-"+getCustomerAddress());
    }

    public int getCustomerId() {
        return customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public long getCustomerContact() {
        return customerContact;
    }
    public Address getCustomerAddress() {
        return customerAddress;
    }
}

 

 



 