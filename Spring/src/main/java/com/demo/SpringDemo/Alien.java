package com.demo.SpringDemo;

public class Alien {
    int age ;

    private Computer com ;

    //private Laptop laptop;

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    /*public Laptop getLaptop() {
        return laptop;
    } */

    public Alien() {
        System.out.println("Alien created");
    }
/*public Alien(int age) {
        this.age = age;
    }*/

    /*public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }*/



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void Code(){
        System.out.println("HI, this is Alien");
        com.compile();
    }
}
