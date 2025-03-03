class Car{
  String Car_color, Car_brand, fuel_type, mileage ;

  Car(String Car_color,String Car_brand,String fuel_type,String mileage){
    this.Car_color = Car_color;this.Car_brand = Car_brand ;this.fuel_type = fuel_type ;this.mileage = mileage;
  }

  Car(){
    this(null,null,null,null);
  }

  Car(String Car_color){
    this(Car_color,null,null,null);
  }

  public void start(){
    System.out.println("The car is started");
  }

  public void stop(){
    System.out.println("The car is stopped");
  }

  public void service(){
    System.out.println("The car is serviced");
  }
}

class Example1{
  public static void main(String[] args){
    
    Car car1 = new Car("black","maruti","petrol","10000km");
    Car car2 = new Car("white");
    Car car3 = new Car();
 
   car1.start();
   car2.start();
   car3.start();

   car1.stop();
   car2.stop();
   car3.stop();

   System.out.println("The color of the three cars are: ");
   System.out.println(car1.Car_color);
   System.out.println(car2.Car_color);
   System.out.println(car3.Car_color);

   System.out.println("The brand of the three cars are: ");
   System.out.println(car1.Car_brand);
   System.out.println(car2.Car_brand);
   System.out.println(car3.Car_brand);

   System.out.println("The fuel type of the three cars are: ");
   System.out.println(car1.fuel_type);
   System.out.println(car2.fuel_type);
   System.out.println(car3.fuel_type);

   System.out.println("The mileage of the three cars are: ");
   System.out.println(car1.mileage);
   System.out.println(car2.mileage);
   System.out.println(car3.mileage);
    }
}