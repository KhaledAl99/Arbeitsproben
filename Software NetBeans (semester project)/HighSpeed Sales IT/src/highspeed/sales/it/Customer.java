/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package highspeed.sales.it;

/**
 *
 * @author Tolga
 */
public class Customer {

    private String name;
    private String mobileNumber;
    private String email;
    private String customerPk;

    public Customer(String customerPk, String name, String mobileNumber, String email) {
        this.customerPk = customerPk;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }

    public String getCustomerPk() {
        return customerPk;
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmail() {
        return email;
    }

}
