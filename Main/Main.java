package Main;
import Car.Car;

public class Main {
    public static void main(String[] args) {
        Car[] cars = setArray();

        System.out.println("Searching for model:"+args[0]+"\n");
        Main.findModel(args[0],cars);

        System.out.println("\nSearching cars exploited more than "+ args[1]+ " years."+"\n");
        Main.exploitedMoreThan(Integer.parseInt(args[1]),cars);

        System.out.println("\nSearching cars made "+ args[2]+ " year more expensive than "+ args[3]+"\n");
        Main.exactYearExpensivePrice(Integer.parseInt(args[2]),Integer.parseInt(args[3]),cars);

    }

    static Car[] setArray(){

        Car [] arr = new Car[7];
        arr[0]=new Car(12,"Golf 5",2005,5400,1523);
        arr[1]=new Car(51,"Avensis",2008,7600,4312);
        arr[2]=new Car(73,"Passat B6",2005,5200,1654);
        arr[3]=new Car(35,"Jetta",2010,9000,9432);
        arr[4]=new Car(49,"ML 270",2000,6600,1924);
        arr[5]=new Car(32,"X5 M",2003,9300,9442);
        arr[6]=new Car(94,"Punto",2008,4900,7321);

        return arr;
    }

    static void findModel(String model,Car arr[]){
        for(Car temp:arr){
            if(temp.sameModel(model))
                System.out.println(temp);
        }
    }

    static void exploitedMoreThan(int n,Car arr[]){
        for(Car temp:arr){
            if(temp.exploitsMore(n))
                System.out.println(temp);
        }
    }

    static void exactYearExpensivePrice(int year,int price,Car arr[]){
        for(Car temp:arr){
            if(temp.yearAndPrice(year,price))
                System.out.println(temp);
        }
    }

}