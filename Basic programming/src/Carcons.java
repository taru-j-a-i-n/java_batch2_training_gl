
class Car {

                    String brand;
                    String color;
                    void getBrand() {

                         System.out.println("Ford "); 

                    }
                    void color() {

                         System.out.println("Car is of Blue color...");

                    }
                    void manufacturin_year() {

                        System.out.println("Car is manufactured in 2022...");
                   }                   
                
}

 

public class Carcons {

                    public static void main(String[] args) {

                                        Car ford = new Car();  

                                         ford.color();
                                         ford.getBrand();
                                         ford.manufacturin_year();
                                         

                    }

}