/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author etc-1
 */
public abstract class User {
    int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
       if(phoneNumber.length() > 8){
           System.out.println("El nnumero de telefono debe ser de 8 digitos maximo");
       }else if(phoneNumber.length() == 8){
        this.phoneNumber = phoneNumber;   
       } 
    }
    
    @Override
    public String toString(){
        return "model.User" + name + ", Email: " + email
               + "\nAddress: "+ address + ". Phone: "+ phoneNumber;
    }
    
    public abstract void showDataUser();
}

