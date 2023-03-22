package com.classAndObjects;

import java.sql.SQLOutput;

class pen {
    String color;
    String type;// ballpoint and gel

    public void write() {
        System.out.println("Writing something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}
    class Students {
        String name;
        int age;
        int rollNo;
        int mobileNo;


        public void info() {
            System.out.println(this.name);
            System.out.println(this.age);
            System.out.println(this.rollNo);
            System.out.println(this.mobileNo);
        }
        Students (Students s1){
            this.name=s1.name;
            this.age=s1.age;
        }
Students(){

}



    }



public class Main {

    public static void main(String[] args) {
        pen pen1=new pen();
        pen1.color="blue";
        pen1.type="gel";
        pen1.write();
        pen1.printColor();
        pen pen2= new pen();
        pen2.color="green";
        pen2.printColor();



        Students s1= new Students();
        s1.name="krsihna";
      s1.age=23;
        s1.rollNo=140;
        s1.mobileNo=9123;
       s1.info();

        Students s2=new Students(s1);
            s2.info();
    }
}
