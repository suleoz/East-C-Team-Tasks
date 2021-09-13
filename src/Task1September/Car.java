package Task1September;

public class Car {
    //Create  a  Class  Car  that  would  have  the following  fields:
    // carPrice  and  color  and method calculateSalePrice() which should be returning a price of the car.
    // Create 2 sub classes: Sedan and Truck. The Truck  class  has  field  as  weight  and
    // has  its own implementation of  calculateSalePrice() method in which returned price calculated as following:
    // if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
    //The Sedan class has field as length and also does   it   is   own   implementation   of calculateSalePrice():
    // if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount

    double carPrice;
    String color;

    public double calculateSalePrice() {

        return carPrice;
    }

}

class Sedan extends Car {
    double lenght;

    @Override
    public double calculateSalePrice() {
        if (lenght > 20) {
            return carPrice - (carPrice * 0.05);
        } else {
            return carPrice - (carPrice * 0.1);
        }


    }

}

class Truck extends Car {
    double weight;

    @Override
    public double calculateSalePrice() {
        if (weight > 2000) {
            return carPrice - (carPrice * 0.1);
        } else {
            return carPrice - (carPrice * 0.2);
        }

    }
}

class CarTester {
    public static void main(String[] args) {

        Sedan sedan = new Sedan();
        sedan.lenght = 25;
        sedan.carPrice = 10000;
        sedan.calculateSalePrice();
        System.out.println(sedan.calculateSalePrice());

        Truck truck = new Truck();
        truck.carPrice = 30000;
        truck.weight = 2100;
        truck.calculateSalePrice();
        System.out.println(truck.calculateSalePrice());
    }
}
