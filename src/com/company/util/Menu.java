package com.company.util;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.jar.JarOutputStream;

public class Menu {
    public void showFirstMenu(){
        System.out.println("welcome to online shop");
        System.out.println("enter your number");
        System.out.println("1.login");
        System.out.println("2.sign up");
        System.out.println("3.exit");

    }
    public  void showInformationLoginUsername(){
        System.out.println("enter your username:");
    }
    public  void  showInformationLoginPassword(){
        System.out.println("enter your password:");
    }
    public void showSuccessfulLogin(){
        System.out.println("Successful login");
    }
    public void showLoginFail() {
        System.out.println("username or password is incorrect");
    }
    public  void getName(){
        System.out.println("plz enter your name");
    }
    public  void getFamily(){
        System.out.println("plz enter your family");
    }
    public void getMobileNumber(){
        System.out.println("plz enter your mobile number");
    }
    public void getEmail(){
        System.out.println("plz enter your email");
    }
    public void getHomeAddress(){
        System.out.println("enter your address");
    }
    public  void getState(){
        System.out.println("plz write your state");
    }
    public void getCity(){
        System.out.println("plz write your city");
    }
    public void getStreetName(){
        System.out.println("plz write your street name");
    }
    public void getPostalCode(){
        System.out.println("enter your postal code ");
    }
    public  void showAllProduct() {
        System.out.println("all of products");
    }

}
