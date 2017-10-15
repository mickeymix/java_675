/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author INT675
 */
public class Customer extends CustomerDao {
    private int customerId ;
    private String discountCode ;
    private String zip;
    private String name ;
    private String adddressLine1 ;
    private String adddressLine2 ;
    private String city ;
    private String state ;
    private String phone ;
    private String fax ;
    private String email ;
    private int creditLimit ;
    
    public Customer() {
    }
    
    Customer(ResultSet rs) throws SQLException {
        this.customerId = rs.getInt("customer_id") ;
        this.discountCode = rs.getString("discount_code") ;
        this.zip = rs.getString("zip");
        this.name = rs.getString("name");
        this.adddressLine1 = rs.getString("addressline1");
        this.adddressLine2 = rs.getString("addressline2");
        this.city = rs.getString("city");
        this.state = rs.getString("state");
        this.phone = rs.getString("phone");
        this.fax = rs.getString("fax");
        this.email = rs.getString("email");
        this.creditLimit = rs.getInt("credit_limit") ;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdddressLine1() {
        return adddressLine1;
    }

    public void setAdddressLine1(String adddressLine1) {
        this.adddressLine1 = adddressLine1;
    }

    public String getAdddressLine2() {
        return adddressLine2;
    }

    public void setAdddressLine2(String adddressLine2) {
        this.adddressLine2 = adddressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }
    
    public boolean update() throws SQLException{
        return update(this);
    }
    
}
