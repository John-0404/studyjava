/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocosneakershop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */

public  class Stuff implements people {
    private String name;
    private String address;
    private int id;
    private int age;

    public Stuff() {
    }

    public Stuff(String name, String address, int id, int age) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.age = age;
    }

    
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public void getInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter adress: ");
        address = sc.next();
    }
    
    @Override
    public String toString() {
        return  "id=" + id +  "| name= " + name.toUpperCase() + "| address= " + address.toUpperCase() +  "| age= " + age + '|';
    }
}
