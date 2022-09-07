package Car;

import java.util.Objects;
import java.util.Scanner;

public class Car {
    private int id;
    private String model;
    private int year;
    private int price;
    private int number;

    public Car(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter id:");
        id=scanner.nextInt();
        System.out.print("Enter model:");
        model=scanner.nextLine();
        System.out.print("Enter year :");
        year=scanner.nextInt();
        System.out.print("Enter price:");
        price=scanner.nextInt();
        System.out.print("Enter serial number:");
        number=scanner.nextInt();
    }

    public Car(int id, String model, int year, int price, int number) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.price = price;
        this.number = number;
    }



    public boolean sameModel(String model) {
        if(Objects.equals(this.model, model))
            return true;
        return false;
    }

    public boolean exploitsMore(int n){
        if(2022-year>=n)
            return true;
        return false;
    }

    public boolean yearAndPrice(int year, int price){
        if(this.year!=year||this.price<price)
            return false;
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public String toString() {
        return "Car {" +
                "id = " + id +
                ", model = " + model + '\'' +
                ", year = " + year +
                ", price = " + price +
                ", number = " + number +
                '}';
    }
}
