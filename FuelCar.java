
/**
 * @author (21039647 Pukar Krishna Karmacharya)
 * @version (1.0.0)
 */

//Inherit the properties of super class Car
//FuelCar IS-A Car
public class FuelCar extends Car{
    //attributes
    private String distributorName;
    private String fuelType;
    private int  numberOfSeats;
    private String bookedDate;
    private String purchaseDate;
    private int mileage;
    private String transmissionType;
    private boolean isPurchased;
    
    //constructor
    public FuelCar(int carId, String carName, String carBrand, String carPrice, String fuelType, int numberOfSeats, int mileage){
        //calling immediate parent class constructor
        super(carId,carName,carBrand,carPrice);
        
        //Initialize the value
        this.distributorName = "";
        this.bookedDate = "";
        this.purchaseDate = "";
        this.transmissionType = "";
        this.isPurchased = false;
        this.fuelType = fuelType;
        this.numberOfSeats = numberOfSeats;
        this.mileage = mileage;
    }
    
    //getters
    public String getDistributorName(){
        return this.distributorName;
    }
        
    public String getFuelType(){
        return this.fuelType;
    }
    
    public int getNumberOfSeats(){
        return this.numberOfSeats;
    }
    
    public String getBookedDate(){
        return this.bookedDate;
    }
    
    public String getPurchaseDate(){
        return this.purchaseDate;
    }
    
    public int getMileage(){
        return this.mileage;
    }
    
    public String getTransmissionType(){
        return this.transmissionType;
    }
    
    public Boolean getIsPurchased(){
        return this.isPurchased;
    }
    
    //setter
    public void setDistributorName(String distributorName){
        this.distributorName = distributorName;
    }
    
    public void setTransmissionType(String transmissionType){
        this.transmissionType = transmissionType; 
    }
    
    public void purchase(String purchaseDate, String bookingDate){
        if(!isPurchased){
            this.setDistributorName("BlueJ Automobile");
            this.setTransmissionType("Manual Transmission");
            this.purchaseDate = purchaseDate;
            this.bookedDate = bookingDate;
            
            //After initializing and setting value
            isPurchased = true;
        }
        else{
            //calling immediate parent class method
            super.setCarColor("Silver");
            
            //getting private values from immediate parent class
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("The car id is " + super.getCarId() + ".");
            System.out.println("The car name is " + super.getCarName() + ".");
            System.out.println("The car brand is " + super.getCarBrand() + ".");
            System.out.println("The car color is " + super.getCarColor() + ".");
            System.out.println("The car price is " + super.getCarPrice() + ".");
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("The Fuelcar with "+this.transmissionType+" is purchased from " + this.distributorName + ".");
            System.out.println("------------------------------------------------------------------------------------------");
        }
    }
    
    //this method overrides display() of super class
    @Override
    public void display(){
        //calling immediate parent class method
        super.display();
        
        if(isPurchased){
            System.out.println("---------------------------------------------");
            System.out.println("Distributor Name:\t" + this.distributorName);
            System.out.println("Fuel Type:\t\t" + this.fuelType);
            System.out.println("Purchase Date:\t\t" + this.purchaseDate);
            System.out.println("Booked Date:\t\t" + this.bookedDate);
            System.out.println("Mileage:\t\t" + this.mileage + "km/litre");
            System.out.println("Number of Seats:\t" + this.numberOfSeats);
            System.out.println("Transmission type:\t" + this.transmissionType);
            System.out.println("---------------------------------------------");
        }
    }
}
