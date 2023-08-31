
/**
 * @author (21039647 Pukar Krishna Karmacharya)
 * @version (1.0.0)
 */
public class Car
{
    private int carId;
    private String carName;
    private String carBrand;
    private String carColor;
    private String carPrice;

    //constructor
    public Car(int carId, String carName, String carBrand, String carPrice){
        //Initialize the value
        this.carId = carId;
        this.carName = carName;
        this.carBrand = carBrand;
        this.carColor = carColor;
        this.carPrice = carPrice;
        this.carColor = "";
    }

    //accessor
    //getters
    public int getCarId(){
        return this.carId;
    }

    public String getCarName(){
        return this.carName;
    }

    public String getCarBrand(){
        return this.carBrand;
    }

    public String getCarPrice(){
        return this.carPrice;
    }

    public String getCarColor(){
        return this.carColor;
    }

    //setter
    //mutator
    public void setCarColor(String carColor){
        this.carColor = carColor;
    }

    public void display(){
        System.out.println("---------------------------------------------");
        System.out.println("Car details:-");
        System.out.println("Car id:\t\t"+this.carId);
        System.out.println("Car name:\t"+this.carName);
        System.out.println("Car Brand:\t"+this.carBrand);
        System.out.println("Car Price:\t"+this.carPrice);

        if(this.carColor.equals("")){
            System.out.println("Car Color:\tPick your car color ");
        }
        else{
            System.out.println("Car Color:\t"+this.carColor);
        }
        System.out.println("---------------------------------------------");
    }

}
