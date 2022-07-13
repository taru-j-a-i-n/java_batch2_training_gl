
public class CarMethod{
        private int wheels;
		private String ownerFirstName;
		private int productionYear;
		private String color;
		private double engineVolume;
		private int maxSpeed;
		private String model;
		private String ownerLastName;
		private long price;
		private boolean isNew;
		private int seatsInTheCar;
		private String cabinMaterial;
		private boolean insurance;
		private String manufacturerCountry;
		private int trunkVolume;
		private int accelerationTo100km;



		public CarMethod(String model)
{

    this.model=model;// model
   this.maxSpeed=maxSpeed;// maximum speed
   this.wheels=wheels;// wheel width
   this.engineVolume=engineVolume;// engine volume
   this.color=color;// color
   this.productionYear=productionYear;// production year
   this.ownerFirstName=ownerFirstName;// first name of owner
   this.ownerLastName=ownerLastName;// last name of owner
   this.price=price;// price
   this.isNew=isNew;// flag indicating whether car is new
   this.seatsInTheCar=seatsInTheCar;// number of seats in the car
   this.cabinMaterial=cabinMaterial;// interior material
   this.insurance=insurance ;
   this.manufacturerCountry=manufacturerCountry;
   this.trunkVolume=trunkVolume;
   this.accelerationTo100km= accelerationTo100km;// flag indicating whether car is insured
}
   


public static void main(String[] args) {
       CarMethod bugatti = new CarMethod("Model: Bugatti Veyron. Engine volume: " + bugatti.engineVolume + ". Trunk volume: " + bugatti.trunkVolume + ". Cabin material: " + bugatti.cabinMaterial +
    	       ". Wheel width: " + bugatti.wheels + ". Purchased in 2018 by Mr. " + bugatti.ownerLastName );

   }

}