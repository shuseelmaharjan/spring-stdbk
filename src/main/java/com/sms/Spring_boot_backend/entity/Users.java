package com.sms.Spring_boot_backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long usreId;
    private String name;
    private String address;
    private Long phone;
    private String password;

    public Long getUsreId() {
        return usreId;
    }

    public void setUsreId(Long usreId) {
        this.usreId = usreId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public Users(Long usreId, String name, String address, Long phone, String password) {
        this.usreId = usreId;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.password = password;
    }
    public Users() {
    }

    @Override
    public String toString() {
        return "Users{" +
                "usreId=" + usreId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", password='" + password + '\'' +
                '}';
    }
}
