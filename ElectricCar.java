
/**
 * @author (21039647 Pukar Krishna Karmacharya)
 * @version (1.0.0)
 */

//Inherit the properties of super class Car
public class ElectricCar extends Car{
    //attributes
    private String customerName;
    private int batteryCapacity;
    private int batteryWarranty;
    private String purchaseDate;
    private String range;
    private int rechargeTime;
    private boolean isBought;
    private boolean isSold;
    
    //Constructor
    public ElectricCar(int carId, String carName, String carBrand, String carPrice, int batteryCapacity){
        //calling immediate parent class constructor
        super(carId,carName,carBrand,carPrice);
        
        //Initialize the value
        this.batteryCapacity  = batteryCapacity;
        this.customerName = "";
        this.batteryWarranty = 0;
        this.purchaseDate = "";
        this.range = "";
        this.rechargeTime =0;
        this.isBought = false;
        this.isSold = false;
    }
    
    //getter
    public String getCustomerName(){
        return this.customerName;
    }
    public int getBatteryCapacity(){
        return this.batteryCapacity;
    }
    public int getBatteryWarranty(){
        return this.batteryWarranty;
    }
    public String getPurchaseDate(){
        return this.purchaseDate;
    }
    public String getRange(){
        return this.range;
    }
    public int getRechargeTime(){
        return this.rechargeTime;
    }
    public boolean getIsBought(){
        return this.isBought;
    }
    public boolean getIsSold(){
        return this.isSold;
    }
    
    //setter
    public void setCustomerName(String customerName){
        if(!isBought){
            this.customerName = customerName;
        }
    }
    
    // Buy method
    public void buy(String customerName ,int batteryWarranty, String purchaseDate, String range, int rechargeTime){
        if(!isBought){
            this.setCustomerName(customerName);
            this.purchaseDate = purchaseDate;
            this.batteryWarranty = batteryWarranty;
            this.range = range;
            this.rechargeTime = rechargeTime;
            this.isBought = true;
        }else{
            System.out.println("------------------------------");
            System.out.println("Electric car is already bought");
            System.out.println("------------------------------");
        }
    }
    
    //sell method
     public void sell(String newCustomerName){
        if(!isSold){
            this.setCustomerName(newCustomerName);
            this.batteryCapacity = 0;
            this.batteryWarranty = 0;
            this.purchaseDate = "";
            this.range = "";
            this.rechargeTime = 0;
            this.isSold = true;
            this.isBought = false;
        }else{
            System.out.println("The car is already sold.");
        }
    }
    
    //this method overrides display() of super class
    @Override
    public void display(){
        
        super.display();
        
        if(isBought){
            System.out.println("---------------------------------------------");
            System.out.println("Customer name:\t\t" + this.customerName);
            System.out.println("Batttery capacity:\t" + this.batteryCapacity + "mah");
            System.out.println("Battery warranty:\t" + this.batteryWarranty + "years");
            System.out.println("purchase Date:\t\t" + this.purchaseDate);
            System.out.println("Range:\t\t\t" + this.range);
            System.out.println("Recharge time:\t\t" + this.rechargeTime + "hours");
            System.out.println("---------------------------------------------");
        }
    }
    
}