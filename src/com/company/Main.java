package com.company;
import java.util.Scanner;

class Car {

    private int cylinder;
    private int wheels ;
    private boolean engine;
    private String name;

    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }

    public Car(int cylinder, int wheels, boolean engine, String name) {
        this.cylinder = cylinder;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }
        public  String Move(){
            return "the car moves";
    }
    public String Brakes(){
        return " the car has brakes";
    }

}
class Ferrari extends Car {

    public Ferrari(){
        super(1,4,true,"buggati");
    }

    @Override
    public String Move() {
        return " the car moves";
    }

}
class Benz extends Car{

    public Benz(){
        super(5,4,true,"mercedez");
    }

    @Override
    public String Brakes() {
        return " no brakes";
    }

    @Override
    public String Move() {
        return " it flies";

    }}
    class Toyota extends Car{
        public Toyota(){
            super(7,4,true,"latest");
        }

    }






public class Main {

    public static void main(String[] args) {
        for(int i=1;i<5;i++){
        Car car= pickCar();
        System.out.println(" the car is number" + i + " and is called " + car.getName() + " and the car" + car.Move());
    }}

    public static Car pickCar() {

        Scanner input= new Scanner( System.in);
            int carNumber ;

        System.out.println(" pick a car and the characteristics will be deployed");
            carNumber=input.nextInt();
            switch (carNumber) {

                case 1:
                    return new Ferrari();
                case 2:
                    return new Benz();
                case 3:
                    return new Toyota();
            }
            return null;
        }

    }















