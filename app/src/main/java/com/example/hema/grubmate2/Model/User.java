package com.example.hema.grubmate2.Model;

/**
 * Created by Hema on 2/21/2018.
 */

public class User {
    private  String ID;
    private  String Name;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public User(String ID, String name, String password, String phone, String email) {
        this.ID = ID;

        Name = name;
        Password = password;
        Phone = phone;
        Email = email;
    }

    private  String Password;
    private  String Phone;
    private  String Email;


    public String getName() {
        return Name;
    }


    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }




    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public User() {
     }

}
