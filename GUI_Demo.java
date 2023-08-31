
import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import java.awt.Font;

//event handling packaging
import java.awt.event.*;

/**
 *
 * @author (Pukar Krishna Karmacharya)
 * @2.5 (4/21/2022)
 */

public class GUI_Demo{
    //--------------------------- UI components as instance variables --------------------------------//
    private JFrame frame;
    
    private ArrayList<Car> cars = new ArrayList<Car>();

    final static String EMPTY = "";
    
    private JTextArea txtArea;

    private JPanel cardPanel = new JPanel();

    private JPanel mainPanel = new JPanel();
    private JPanel mainTitlePanel= new JPanel();
    private JPanel mainContentPanel= new JPanel();
    private JPanel mainMenuPanel= new JPanel();
    private JPanel mainSideContent = new JPanel();

    private JPanel fcarPanel = new JPanel();
    private JPanel fcarTitlePanel= new JPanel();
    private JPanel fcarContentPanel= new JPanel();
    private JPanel fcarMenuPanel= new JPanel();

    private JPanel ecarPanel = new JPanel();
    private JPanel ecarTitlePanel= new JPanel();
    private JPanel ecarContentPanel= new JPanel();
    private JPanel ecarMenuPanel= new JPanel();

    String[] year = {"2016","2017","2018","2019","2020","2021","2022"};
    String[] month = {"Jan","Feb","Mar","Apr","May", "Jun", "July", "Aug", "Sept", "Oct", "Nov", "Dec"};
    String[] day ={"01","02","03","04","05","06","07", "08", "09", "10"};

    //public JTabbedPane tab = new JTabbedPane();
    private JButton ecarBtn;
    private JButton fcarBtn;
    private JButton fcarClearBtn;
    private JButton ecarClearBtn;

    private JLabel mainTitle;
    private JLabel fcarTitle;
    private JLabel ecarTitle;

    //////////////////////////////////////////////////////////////////////////////////////////////
    private JLabel fcarId,fcarBrand,fcarName,fcarPrice,fcarMileage,fcarNoOfSeats,fcarTransmissionType,fcarDistName,fcarFuelType,fcarBookDate,fcarPurchaseDate,fcarColor; 
    private JTextField fcarIdTxt,fcarBrandTxt,fcarNameTxt,fcarPriceTxt,fcarMileageTxt,fcarNoOfSeatsTxt,fcarTransmissionTxt,fcarDistNameTxt,fcarFuelTypeTxt,fcarColorTxt;
    private JComboBox fcarPurYearCombo,fcarPurMonthCombo,fcarPurDayCombo;
    private JComboBox fcarBookYearCombo,fcarBookMonthCombo,fcarBookDayCombo;
    private JButton fcarAddBtn,fcarPurchaseBtn,fcarDisplayBtn;
    ///////////////////////////////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////Electric Car/////////////////////////////////
    private JLabel ecarName,ecarId,ecarBrand,ecarPrice,ecarCustomerName,ecarBatteryCapacity,ecarBatteryWarranty,ecarRange,ecarColor,ecarRechargeTime,ecarPurchaseDate;
    private JTextField ecarNameTxt,ecarIdTxt,ecarBrandTxt,ecarPriceTxt,ecarCustomerNameTxt,ecarBatteryCapacityTxt,ecarBatteryWarrantyTxt,ecarColorTxt,ecarRangeTxt,ecarRechargeTimeTxt,ecarPurcahseDateTxt;
    private JComboBox ecarPurYearCombo,ecarPurMonthCombo,ecarPurDayCombo;
    private JComboBox ecarBookYearCombo,ecarBookMonthCombo,ecarBookDayCombo;
    private JButton ecarAddBtn,ecarBuyBtn,ecarDisplayBtn,ecarSellBtn;
    ///////////////////////////////////////////////////////////////////////////////////////////////

    GridBagConstraints gbc = new GridBagConstraints();

    public GUI_Demo(){
        createGUI();
    }

    public void createGUI(){
        frame = new JFrame("CourseWork");
        gbc.insets = new Insets(10,10,10,10);

        ////////////////////////CardLayout/////////////////
        CardLayout cl = new CardLayout();
        cardPanel.setLayout(cl);
        cl.show(cardPanel,"2");
        ///////////////////////////////////////////////////

        ////////////////////////Layout/////////////////////
        mainPanel.setLayout(new GridBagLayout());
        mainTitlePanel.setLayout(new FlowLayout());
        mainContentPanel.setLayout(new FlowLayout());
        mainSideContent.setLayout(new FlowLayout());
        
        mainMenuPanel.setLayout(new GridBagLayout());
        
        ecarPanel.setLayout(new BorderLayout());
        ecarTitlePanel.setLayout(new FlowLayout());
        ecarContentPanel.setLayout(new GridBagLayout());
        ecarMenuPanel.setLayout(new FlowLayout());
        
        fcarPanel.setLayout(new BorderLayout());
        fcarTitlePanel.setLayout(new FlowLayout());
        fcarContentPanel.setLayout(new GridBagLayout());
        fcarMenuPanel.setLayout(new FlowLayout());
        //////////////////////////////////////////////////
        
        ///////////////Record//////////////
        txtArea = new JTextArea(35,20);
        txtArea.append("Electric Car\n");
        txtArea.setEditable(false);
        ///////////////////////////////////

        mainPanel.setBorder(BorderFactory.createTitledBorder(EMPTY));
        mainTitlePanel.setBorder(BorderFactory.createTitledBorder("Pukar Krishna Karmacharya"));
        mainContentPanel.setBorder(BorderFactory.createTitledBorder(EMPTY));
        mainMenuPanel.setBorder(BorderFactory.createTitledBorder("Choose car"));
        mainSideContent.setBorder(BorderFactory.createTitledBorder("Records"));
        
        ecarContentPanel.setBorder(BorderFactory.createRaisedBevelBorder());
        fcarContentPanel.setBorder(BorderFactory.createRaisedBevelBorder());
        ecarMenuPanel.setBorder(BorderFactory.createRaisedBevelBorder());
        fcarMenuPanel.setBorder(BorderFactory.createRaisedBevelBorder());
        fcarTitlePanel.setBorder(BorderFactory.createRaisedBevelBorder());
        ecarTitlePanel.setBorder(BorderFactory.createRaisedBevelBorder());
        
        fcarPanel.setBorder(BorderFactory.createLoweredBevelBorder());
        ecarPanel.setBorder(BorderFactory.createLoweredBevelBorder());

        mainTitle = new JLabel("COURSEWORK 2");
        mainTitle.setFont(new Font("Serif",Font.BOLD,24));
        
        fcarTitle = new JLabel("Fuel Car");
        fcarTitle.setFont(new Font("Serif",Font.BOLD,16));
        
        ecarTitle = new JLabel("Electric Car");
        ecarTitle.setFont(new Font("Serif",Font.BOLD,16));

        fcarClearBtn=new JButton("CLEAR");
        fcarClearBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    fcarIdTxt.setText(EMPTY);
                    fcarNameTxt.setText(EMPTY);
                    fcarBrandTxt.setText(EMPTY);
                    fcarPriceTxt.setText(EMPTY);
                    fcarMileageTxt.setText(EMPTY);
                    fcarMileageTxt.setText(EMPTY);
                    fcarNoOfSeatsTxt.setText(EMPTY);
                    fcarTransmissionTxt.setText(EMPTY);
                    fcarDistNameTxt.setText(EMPTY);
                    fcarFuelTypeTxt.setText(EMPTY);
                    fcarColorTxt.setText(EMPTY);
                }
            }); 

        ecarClearBtn=new JButton("CLEAR");
        ecarClearBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    ecarIdTxt.setText(EMPTY);
                    ecarNameTxt.setText(EMPTY);
                    ecarBrandTxt.setText(EMPTY);
                    ecarPriceTxt.setText(EMPTY);
                    ecarCustomerNameTxt.setText(EMPTY);
                    ecarBatteryWarrantyTxt.setText(EMPTY);
                    ecarBatteryCapacityTxt.setText(EMPTY);
                    ecarRangeTxt.setText(EMPTY);
                    ecarRechargeTimeTxt.setText(EMPTY);
                    ecarColorTxt.setText(EMPTY);
                }
            });

        ////////////////////////////////////////FuelCar////////////////////////////////////////
        fcarId = new JLabel("Car ID");
        fcarBrand = new JLabel("Car Brand");
        fcarName=new JLabel("Car Name");
        fcarPrice= new JLabel("Car Price");
        fcarColor = new JLabel("Car Color");
        fcarMileage= new JLabel("Mileage");
        fcarNoOfSeats= new JLabel(" Number of Seats");
        fcarTransmissionType= new JLabel("Transmission Type");
        fcarDistName= new JLabel("Distributor Name");
        fcarFuelType= new JLabel(" Fuel Type");
        fcarBookDate= new JLabel("Book Date ");
        fcarPurchaseDate= new JLabel("Purchase Date");

        fcarIdTxt = new JTextField();
        fcarBrandTxt = new JTextField();
        fcarNameTxt = new JTextField();
        fcarPriceTxt = new JTextField();
        fcarColorTxt = new JTextField();
        fcarMileageTxt = new JTextField();
        fcarNoOfSeatsTxt = new JTextField();
        fcarTransmissionTxt = new JTextField();
        fcarDistNameTxt = new JTextField();
        fcarFuelTypeTxt = new JTextField();

        fcarBookYearCombo= new JComboBox(year);
        fcarBookMonthCombo=new JComboBox(month);
        fcarBookDayCombo=new JComboBox(day);

        fcarPurYearCombo= new JComboBox(year);
        fcarPurMonthCombo=new JComboBox(month);
        fcarPurDayCombo=new JComboBox(day);

        fcarAddBtn=new JButton("Add");
        fcarAddBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String[] fcarAdd ={gtxt(fcarIdTxt), gtxt(fcarNameTxt), gtxt(fcarBrandTxt),
                            gtxt(fcarPriceTxt),gtxt(fcarFuelTypeTxt),gtxt(fcarNoOfSeatsTxt),
                            gtxt(fcarMileageTxt)}; 

                    int id = 0;
                    float fnumOfSeats = 0;
                    float fmileage = 0;
                    int numOfSeats = 0;
                    int mileage = 0;
                    boolean flag = true;
                    boolean valid = false;

                    if(flag){
                        try{
                            id = Integer.parseInt(fcarAdd[0]);
                        } catch(NumberFormatException ex){
                            JOptionPane.showMessageDialog(frame, "Invalid Car ID.", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                            valid = false;
                            flag = false;
                        }
                    }

                    if(flag){
                        try{
                            fnumOfSeats = Float.parseFloat(fcarAdd[5]);
                        } catch(NumberFormatException ex){
                            JOptionPane.showMessageDialog(frame, "There is no seats in car.", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                            valid = false;
                            flag = false;
                        }
                    }

                    if(flag){
                        try{   
                            fmileage = Float.parseFloat(fcarAdd[6]);
                        } catch(NumberFormatException cept){
                            JOptionPane.showMessageDialog(frame, "Please enter a valid mileage.", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                            valid = false;
                            flag = false;
                        } 
                    }

                    if(flag){
                        numOfSeats = wholeNumber(fnumOfSeats);
                        mileage = wholeNumber(fmileage);
                        if(id <= 0 || numOfSeats <= 0 || mileage <= 0){
                            JOptionPane.showMessageDialog(frame, "Car ID/number of Seats/mileage is invalid.", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                            valid = false;
                            flag = false;
                        }
                    }

                    if(flag){
                        if(fcarAdd[1].equals(EMPTY) || fcarAdd[2].equals(EMPTY) || fcarAdd[3].equals(EMPTY) || fcarAdd[4].equals(EMPTY)){
                            JOptionPane.showMessageDialog(frame, "Please Input text.", "Empty textfields", JOptionPane.ERROR_MESSAGE);
                            valid = false;
                            flag = false;
                        }
                        else{
                            valid = true;
                        }
                    }

                    if(flag){    
                        if(!cars.isEmpty()){
                            for(Car fuelCar: cars){
                                if(fuelCar instanceof FuelCar){
                                    if(fuelCar.getCarId() == id){
                                        txtArea.append("Car id "+fcarAdd[0]+" already exists.\n");
                                        JOptionPane.showMessageDialog(frame, "Fuel car ID "+id+" already exists.", "Error !", JOptionPane.ERROR_MESSAGE);
                                        valid = false;
                                        flag = false;
                                    }
                                }
                            }
                        }
                    }

                    if(valid){
                        //Upcasting
                        Car newFuelCar = new FuelCar(id, fcarAdd[1], fcarAdd[2], fcarAdd[3], fcarAdd[4], numOfSeats, mileage);
                        cars.add(newFuelCar);
                        txtArea.append("Car id "+fcarAdd[0]+" is added.\n");
                        JOptionPane.showMessageDialog(frame, "Fuel car ID "+id+" added.", "Info", JOptionPane.INFORMATION_MESSAGE);
                        valid = false;
                    }
                    flag = true;
                }

            }); 
            
        fcarPurchaseBtn=new JButton("Purchase");
        fcarPurchaseBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String[] fcarPurchase ={gtxt(fcarIdTxt), gtxt(fcarNameTxt), gtxt(fcarBrandTxt),
                                        gtxt(fcarColorTxt), gtxt(fcarDistNameTxt), gtxt(fcarTransmissionTxt)};
                                        
                    String purchaseyear = (String)fcarPurYearCombo.getSelectedItem();
                    String purchasemonth = (String)fcarPurMonthCombo.getSelectedItem();
                    String purchaseday = (String)fcarPurDayCombo.getSelectedItem();
                    String purchaseDate = purchaseday + " " + purchasemonth + " " + purchaseyear; 

                    String bookedyear = (String)fcarBookYearCombo.getSelectedItem();
                    String bookedmonth = (String)fcarBookMonthCombo.getSelectedItem();
                    String bookedday = (String)fcarBookDayCombo.getSelectedItem();
                    String bookedDate = bookedday + " " + bookedmonth + " " + bookedyear; 
                    int id = 0;
                    boolean noId = true;
                    boolean valid = false;
                    boolean flag = true;

                    if(flag){
                        try{
                            id = Integer.parseInt(fcarPurchase[0]);
                        } catch(NumberFormatException ex){
                            JOptionPane.showMessageDialog(frame, "Please enter valid car ID.", "Invalid entry.", JOptionPane.ERROR_MESSAGE);
                            valid = false;
                            flag = false;
                        }
                    }

                    if(flag){
                        if(id <= 0){
                            JOptionPane.showMessageDialog(frame, "Car ID is not logical", "Invalid entry.", JOptionPane.ERROR_MESSAGE);
                            valid = false;
                            flag = false;
                        }
                    }

                    if(flag){
                        if(fcarPurchase[1].equals(EMPTY) || fcarPurchase[2].equals(EMPTY) || fcarPurchase[3].equals(EMPTY) || fcarPurchase[4].equals(EMPTY) || fcarPurchase[5].equals(EMPTY)){
                            JOptionPane.showMessageDialog(frame, "Please input TextFields", "Empty TextFields.", JOptionPane.ERROR_MESSAGE);
                            valid = false;
                            flag = false;
                        }
                        else{
                            valid = true;
                        }

                    }
                    
                    if(flag){
                        if(cars.isEmpty()){
                            JOptionPane.showMessageDialog(frame, "The ArrayList is empty.", "Empty ArrayList", JOptionPane.INFORMATION_MESSAGE);
                            valid = false;
                            flag = false;
                        }
                    }
                    
                    if(valid){
                        if(!cars.isEmpty()){
                            for(Car fuelCar: cars){
                                if (fuelCar instanceof FuelCar){
                                    if(fuelCar.getCarId() == id){
                                        if(((FuelCar)fuelCar).getIsPurchased() == false){
                                            ((FuelCar)fuelCar).purchase(purchaseDate, bookedDate);
                                            txtArea.append("Car id "+fcarPurchase[0]+"is bought.\n");
                                            txtArea.append("--> Car Name: "+fcarPurchase[1]+"\n");
                                            txtArea.append("--> Car Brand: "+fcarPurchase[2]+"\n");
                                            JOptionPane.showMessageDialog(frame, "Fuel car id "+id+" is purchase.", "Info", JOptionPane.INFORMATION_MESSAGE);
                                            noId = false;
                                            valid = false;
                                        }
                                        else{
                                            ((FuelCar)fuelCar).purchase(purchaseDate, bookedDate);
                                            txtArea.append("Car id "+fcarPurchase[0]+" is already purchased.\n");
                                            JOptionPane.showMessageDialog(frame, "The Fuel car ID "+id+" has been already purchased.", "Info", JOptionPane.INFORMATION_MESSAGE);
                                            noId = false;
                                        }
                                    }
                                }
                            }
                        }
                        if(noId){
                            txtArea.append("Car id "+fcarPurchase[0]+" is not found.\n");
                            JOptionPane.showMessageDialog(frame, "The Fuel car is not available.", "Not Found", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    flag = true;
                }
            }); 

        fcarDisplayBtn=new JButton("Display");
        fcarDisplayBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    for(Car car: cars){
                        if(car instanceof FuelCar){
                            System.out.println("Fuel car: ");
                            ((FuelCar)car).display();
                            System.out.println("\n");
                        }
                    }
                }
            }); 
        ///////////////////////////////////////////////////////////////////////////////////////

        ////////////////////////////////////////ElectricCar////////////////////////////////////
        ecarId = new JLabel("Car ID");
        ecarBrand = new JLabel("Car Brand");
        ecarName=new JLabel("Car Name");
        ecarPrice= new JLabel("Car Price");
        ecarCustomerName= new JLabel("Customer Name");
        ecarBatteryCapacity= new JLabel("Battery Capacity");
        ecarBatteryWarranty= new JLabel("Battery Warranty");
        ecarRange= new JLabel("Range");
        ecarRechargeTime= new JLabel(" Recharge Time");
        ecarColor= new JLabel("Car Color ");
        ecarPurchaseDate= new JLabel("Purchase Date");

        ecarIdTxt = new JTextField();
        ecarBrandTxt = new JTextField();
        ecarNameTxt = new JTextField();
        ecarCustomerNameTxt=new JTextField();
        ecarPriceTxt = new JTextField();
        ecarBatteryCapacityTxt = new JTextField();
        ecarBatteryWarrantyTxt = new JTextField();
        ecarRangeTxt = new JTextField();
        ecarRechargeTimeTxt = new JTextField();
        ecarColorTxt = new JTextField();
        ecarPurcahseDateTxt=new JTextField();

        ecarPurYearCombo= new JComboBox(year);
        ecarPurMonthCombo=new JComboBox(month);
        ecarPurDayCombo=new JComboBox(day);

        ecarAddBtn=new JButton("Add");
        ecarAddBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String[] ecarAdd ={gtxt(ecarIdTxt),gtxt(ecarNameTxt),gtxt(ecarBrandTxt),gtxt(ecarPriceTxt),gtxt(ecarBatteryCapacityTxt)};
                    int id = 0;
                    float fbatteryCapacity = 0;
                    int batteryCapacity = 0;
                    boolean flag = true;                
                    boolean valid = false;

                    if(flag){
                        try{
                            id = Integer.parseInt(ecarAdd[0]);
                        } catch(NumberFormatException ex){
                            JOptionPane.showMessageDialog(frame, "Invalid Car ID.", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                            valid = false;
                            flag = false;
                        }
                    }

                    if(flag){
                        try{
                            fbatteryCapacity = Float.parseFloat(ecarAdd[4]);
                        } catch(NumberFormatException ex){
                            JOptionPane.showMessageDialog(frame, "Invalid battery capacity.", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                            valid = false;
                            flag = false;
                        }
                    }

                    if(flag){
                        batteryCapacity = wholeNumber(fbatteryCapacity);
                        if(id <= 0 || batteryCapacity <= 0){
                            JOptionPane.showMessageDialog(frame, "Invalid car ID or battery capacity.", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                            valid = false;
                            flag = false;
                        }
                    }

                    if(flag){
                        if(ecarAdd[1].equals(EMPTY) || ecarAdd[2].equals(EMPTY) || ecarAdd[3].equals(EMPTY)){
                            JOptionPane.showMessageDialog(frame, "Please Input .", "Empty TextFields.", JOptionPane.ERROR_MESSAGE);
                            valid = false;
                            flag = false;
                        }
                        else{
                            valid = true;
                        }
                    }

                    if(flag){
                        if(!cars.isEmpty()){
                            for(Car electricCar: cars){
                                if(electricCar instanceof ElectricCar){
                                    if(electricCar.getCarId() == id){
                                        txtArea.append("Car id "+ecarAdd[0]+"already exists.\n");
                                        JOptionPane.showMessageDialog(frame, "Electric car already exists.", "Error !", JOptionPane.ERROR_MESSAGE);
                                        valid = false;
                                        flag = false;
                                    } 
                                }
                            }
                        }
                    }

                    if(valid){
                        //Upcasting
                        Car newElectricCar = new ElectricCar(id, ecarAdd[1], ecarAdd[2], ecarAdd[3], batteryCapacity);
                        cars.add(newElectricCar);
                        JOptionPane.showMessageDialog(frame, "Electric car is added.", "Info", JOptionPane.INFORMATION_MESSAGE);
                        txtArea.append("Car id "+ecarAdd[0]+" is added.\n");
                        valid = false;
                    }
                    flag = true;
                }
            }); 

        ecarBuyBtn=new JButton("Buy");
        ecarBuyBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String[] ecarBuy = { gtxt(ecarIdTxt), gtxt(ecarNameTxt), gtxt(ecarBrandTxt),
                            gtxt(ecarPriceTxt), gtxt(ecarColorTxt), gtxt(ecarCustomerNameTxt),
                            gtxt(ecarBatteryWarrantyTxt), gtxt(ecarRangeTxt), gtxt(ecarRechargeTimeTxt)};
                    int id = 0;
                    float frechargeTime = 0;
                    float fbatteryWarranty = 0;
                    int rechargeTime = 0;
                    int batteryWarranty = 0;
                    //typeCasting
                    String purchaseyear = (String)ecarPurYearCombo.getSelectedItem();
                    String purchasemonth = (String)ecarPurMonthCombo.getSelectedItem();
                    String purchaseday = (String)ecarPurDayCombo.getSelectedItem();
                    String purchaseDate = purchaseday + " " + purchasemonth + " " + purchaseyear;
                    boolean valid = false;
                    boolean flag = true;
                    boolean noId = true;
                    
                    if(flag){
                        try{
                            id = Integer.parseInt(ecarBuy[0]);
                        }catch(NumberFormatException ex){
                            JOptionPane.showMessageDialog(frame, "Please enter valid Car ID.", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                            valid = false;
                            flag = false;
                        }
                    }

                    if(flag){
                        try{
                            frechargeTime = Float.parseFloat(ecarBuy[8]);
                        } catch(NumberFormatException ex){
                            JOptionPane.showMessageDialog(frame, "Please enter valid input.", "Invalid entry", JOptionPane.ERROR_MESSAGE);   
                            valid = false;
                            flag = false;
                        }
                    }

                    if(flag){
                        try{
                            fbatteryWarranty = Float.parseFloat(ecarBuy[6]);
                        } catch(NumberFormatException ex){
                            JOptionPane.showMessageDialog(frame, "Invalid battery warranty.", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                            valid = false;
                            flag = false;
                        }
                    }

                    if(flag){    
                        batteryWarranty = wholeNumber(fbatteryWarranty);
                        rechargeTime = wholeNumber(frechargeTime);
                        if(id <= 0 || batteryWarranty <= 0 || rechargeTime <= 0){
                            JOptionPane.showMessageDialog(frame, "Invalid car ID/battery capacity/recharge time.", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                            valid = false;
                            flag = false;
                        }
                    }

                    if(flag){    
                        if(ecarBuy[1].equals(EMPTY) || ecarBuy[2].equals(EMPTY) || ecarBuy[3].equals(EMPTY) || ecarBuy[4].equals(EMPTY) || ecarBuy[5].equals(EMPTY) || ecarBuy[7].equals(EMPTY) ){
                            JOptionPane.showMessageDialog(frame, "Please Input TextFields.", "Empty TextFields.", JOptionPane.ERROR_MESSAGE);
                            valid = false;
                            flag = false;
                        }
                        else{
                            valid= true;
                        }
                    }

                    if(flag){
                        if(cars.isEmpty()){
                            JOptionPane.showMessageDialog(frame, "The ArrayList is empty.", "Empty ArrayList", JOptionPane.INFORMATION_MESSAGE);
                            valid = false;
                            flag = false;
                        }
                    }
                    
                    if(valid){
                        if(!cars.isEmpty()){
                            for(Car electricCar: cars){
                                if (electricCar instanceof ElectricCar){
                                    if(electricCar.getCarId() == id){
                                        //DownCasting
                                        if(((ElectricCar)electricCar).getIsBought()== false){
                                            ((ElectricCar)electricCar).buy(ecarBuy[5], batteryWarranty, purchaseDate, ecarBuy[7], rechargeTime);
                                            txtArea.append("Car id "+ecarBuy[0]+"is bought.\n");
                                            txtArea.append("--> Custumer Name =  "+ecarBuy[5]+"\n");
                                            JOptionPane.showMessageDialog(frame, "The Electric car ID "+id+" is bought.", "Info", JOptionPane.INFORMATION_MESSAGE);
                                            valid = false;
                                            noId = false;
                                        }
                                        else{
                                            //DownCasting
                                            ((ElectricCar)electricCar).buy(ecarBuy[5], batteryWarranty, purchaseDate, ecarBuy[7], rechargeTime);
                                            txtArea.append("Car id "+ecarBuy[0]+"is already bought.\n");
                                            JOptionPane.showMessageDialog(frame, "Electric car ID "+id+" is already bought.", "Info", JOptionPane.INFORMATION_MESSAGE);
                                            noId = false;
                                        }
                                    }
                                }
                            }
                        }
                        if(noId){
                            txtArea.append("Car id "+ecarBuy[0]+" isn't available.\n");
                            JOptionPane.showMessageDialog(frame,"The Electric car is not available!","Not Found!",JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    flag = true;
                }
            }); 
        ecarSellBtn=new JButton("Sell");
        ecarSellBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    int id = 0;
                    String customerName = gtxt(ecarCustomerNameTxt);
                    String strId = gtxt(ecarIdTxt);
                    boolean flag = true;
                    boolean valid = true;

                    if(flag){
                        try{
                            id = Integer.parseInt(strId);
                        }catch(NumberFormatException ex){
                            JOptionPane.showMessageDialog(frame, "Please enter valid Car ID.", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                            valid = false;
                            flag = false;
                        }
                    }

                    if(flag){
                        if(id <= 0){
                            JOptionPane.showMessageDialog(frame, "Please enter valid car he ID.", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                            valid = false;
                            flag = false;
                        }
                    }

                    if(flag){
                        if(cars.isEmpty()){
                            JOptionPane.showMessageDialog(frame, "The ArrayList is empty.", "Empty ArrayList", JOptionPane.INFORMATION_MESSAGE);
                            valid = false;
                            flag = false;
                        }
                    }

                    if(flag){
                        if(customerName.equals(EMPTY) || id == 0){
                            JOptionPane.showMessageDialog(frame, "The text fields need to be filled.", "Empty text fields.", JOptionPane.ERROR_MESSAGE);
                            valid = false;
                            flag = false;
                        }
                        else{
                            valid = true;
                        }
                    }

                    if(valid){
                        for(Car electricCar: cars){
                            if(electricCar instanceof ElectricCar){
                                if(electricCar.getCarId() == id){
                                    if(((ElectricCar)electricCar).getIsSold()== false){
                                        ((ElectricCar)electricCar).sell(customerName);
                                        txtArea.append("Car id "+strId+"is sold.\n");
                                        JOptionPane.showMessageDialog(frame, "The preferred electric car is sold.", "Info", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    else{
                                        txtArea.append("Car id "+strId+"isn't available.\n");
                                        JOptionPane.showMessageDialog(frame,"The Electric car you want to purchase isn't available, it has been sold!","Already Sold!",JOptionPane.INFORMATION_MESSAGE);  
                                    }
                                }  
                            }    
                        }
                    }
                    flag = true;
                }
            }); 
            
        ecarDisplayBtn=new JButton("Display");
        ecarDisplayBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    for(Car car: cars){
                        if(car instanceof ElectricCar){
                            System.out.println("Electric car: ");
                            ((ElectricCar)car).display();
                            System.out.println("\n");
                        }
                    }
                }
            }); 

        ///////////////////////////////////////////////////////////////////////////////////////
        ecarBtn = new JButton("Electric Car");
        ecarBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    txtArea.append("Electric Car\n");
                    cl.show(cardPanel,"1");
                }
            });    

        fcarBtn = new JButton("Fuel Car");
        fcarBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    txtArea.append("Fuel Car\n");
                    cl.show(cardPanel,"2");
                }
            }); 
        //////////////////////////////////////////////////////////////////////////////////////////

        //-------------------------------------- UI code begins ----------------------------------------//
        /////////////////////////////FuelPanel//////////////////////////////
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        fcarContentPanel.add(fcarId,gbc);
        gbc.gridy++;
        fcarContentPanel.add(fcarName,gbc);
        gbc.gridy++;
        fcarContentPanel.add(fcarPrice,gbc);
        gbc.gridy++;
        fcarContentPanel.add(fcarBrand,gbc);
        gbc.gridy++;
        fcarContentPanel.add(fcarColor,gbc);
        gbc.gridy++;
        fcarContentPanel.add(fcarMileage,gbc);
        gbc.gridy++;
        fcarContentPanel.add(fcarNoOfSeats,gbc);
        gbc.gridy++;
        fcarContentPanel.add(fcarTransmissionType,gbc);
        gbc.gridy++;
        fcarContentPanel.add(fcarDistName,gbc);
        gbc.gridy++;
        fcarContentPanel.add(fcarFuelType,gbc);
        gbc.gridy++;
        fcarContentPanel.add(fcarBookDate,gbc);
        gbc.gridy++;
        fcarContentPanel.add(fcarPurchaseDate,gbc);

        gbc.gridx = 5;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        fcarContentPanel.add(fcarIdTxt,gbc);
        gbc.gridy++;
        fcarContentPanel.add(fcarNameTxt,gbc);
        gbc.gridy++;
        fcarContentPanel.add(fcarPriceTxt,gbc);
        gbc.gridy++;
        fcarContentPanel.add(fcarBrandTxt,gbc);
        gbc.gridy++;
        fcarContentPanel.add(fcarColorTxt,gbc);
        gbc.gridy++;
        fcarContentPanel.add(fcarMileageTxt,gbc);
        gbc.gridy++;
        fcarContentPanel.add(fcarNoOfSeatsTxt,gbc);
        gbc.gridy++;
        fcarContentPanel.add(fcarTransmissionTxt,gbc);
        gbc.gridy++;
        fcarContentPanel.add(fcarDistNameTxt,gbc);
        gbc.gridy++;
        fcarContentPanel.add(fcarFuelTypeTxt,gbc);
        gbc.gridwidth = 1;
        gbc.gridy++;
        fcarContentPanel.add(fcarBookYearCombo,gbc);
        gbc.gridx=6;
        fcarContentPanel.add(fcarBookMonthCombo,gbc);
        gbc.gridx=7;
        fcarContentPanel.add(fcarBookDayCombo,gbc);
        gbc.gridy++;
        gbc.gridx=5;
        fcarContentPanel.add(fcarPurYearCombo,gbc);
        gbc.gridx=6;
        fcarContentPanel.add(fcarPurMonthCombo,gbc);
        gbc.gridx=7;
        fcarContentPanel.add(fcarPurDayCombo,gbc);

        fcarMenuPanel.add(fcarAddBtn);
        fcarMenuPanel.add(fcarPurchaseBtn);
        fcarMenuPanel.add(fcarDisplayBtn);
        fcarMenuPanel.add(fcarClearBtn);
        
        fcarTitlePanel.add(fcarTitle);
        
        fcarPanel.add(fcarTitlePanel,BorderLayout.NORTH);
        fcarPanel.add(fcarMenuPanel,BorderLayout.SOUTH);
        fcarPanel.add(fcarContentPanel,BorderLayout.CENTER);

        ////////////////////////////////////////////////////////////////////////

        /////////////////////////////ElectricCar Panel////////////////////////////////////
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        ecarContentPanel.add(ecarId,gbc);
        gbc.gridy++;
        ecarContentPanel.add(ecarBrand,gbc);
        gbc.gridy++;
        ecarContentPanel.add(ecarName,gbc);
        gbc.gridy++;
        ecarContentPanel.add(ecarPrice,gbc);
        gbc.gridy++;
        ecarContentPanel.add(ecarColor,gbc);
        gbc.gridy++;
        ecarContentPanel.add(ecarCustomerName,gbc);
        gbc.gridy++;
        ecarContentPanel.add(ecarBatteryCapacity,gbc);
        gbc.gridy++;
        ecarContentPanel.add(ecarBatteryWarranty,gbc);
        gbc.gridy++;
        ecarContentPanel.add(ecarRange,gbc);
        gbc.gridy++;
        ecarContentPanel.add(ecarRechargeTime,gbc);
        gbc.gridy++;
        ecarContentPanel.add(ecarPurchaseDate,gbc);

        gbc.gridx = 5;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        ecarContentPanel.add(ecarIdTxt,gbc);
        gbc.gridy++;
        ecarContentPanel.add(ecarBrandTxt,gbc);
        gbc.gridy++;
        ecarContentPanel.add(ecarNameTxt,gbc);
        gbc.gridy++;
        ecarContentPanel.add(ecarPriceTxt,gbc);
        gbc.gridy++;
        ecarContentPanel.add(ecarColorTxt,gbc);
        gbc.gridy++;
        ecarContentPanel.add(ecarCustomerNameTxt,gbc);
        gbc.gridy++;
        ecarContentPanel.add(ecarBatteryCapacityTxt,gbc);
        gbc.gridy++;
        ecarContentPanel.add(ecarBatteryWarrantyTxt,gbc);
        gbc.gridy++;
        ecarContentPanel.add(ecarRangeTxt,gbc);
        gbc.gridy++;
        ecarContentPanel.add(ecarRechargeTimeTxt,gbc);
        gbc.gridwidth = 1;
        gbc.gridy++;
        ecarContentPanel.add(ecarPurYearCombo,gbc);
        gbc.gridx=6;
        ecarContentPanel.add(ecarPurMonthCombo,gbc);
        gbc.gridx=7;
        ecarContentPanel.add(ecarPurDayCombo,gbc);

        ecarMenuPanel.add(ecarAddBtn);
        ecarMenuPanel.add(ecarBuyBtn);
        ecarMenuPanel.add(ecarSellBtn);
        ecarMenuPanel.add(ecarDisplayBtn);
        ecarMenuPanel.add(ecarClearBtn);

        ecarTitlePanel.add(ecarTitle);

        ecarPanel.add(ecarTitlePanel,BorderLayout.NORTH);
        ecarPanel.add(ecarMenuPanel,BorderLayout.SOUTH);
        ecarPanel.add(ecarContentPanel,BorderLayout.CENTER);

        ////////////////////////////////////////////////////////////////////////
        
        //////////////////////////CardPanel///////////////////////////
        cardPanel.add(ecarPanel,"1");
        cardPanel.add(fcarPanel,"2"); 

        /////////////////////////////////////////////////////////////
        
        /////////////////////////////MainPanel/////////////////////////////////////

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        gbc.gridwidth = 2;
        mainMenuPanel.add(ecarBtn,gbc);

        gbc.gridy=4;
        gbc.gridheight = 2;
        gbc.gridwidth = 2;
        mainMenuPanel.add(fcarBtn,gbc);

        mainContentPanel.add(cardPanel);
        mainSideContent.add(txtArea);

        //////////////////
        mainTitlePanel.add(mainTitle);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        gbc.gridwidth = 10;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(mainTitlePanel,gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridheight = 5;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.VERTICAL;
        mainPanel.add(mainMenuPanel,gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridheight = 5;
        gbc.gridwidth = 3;
        mainPanel.add(mainContentPanel,gbc);

        gbc.gridx = 6;
        gbc.gridy = 2;
        gbc.gridheight = 5;
        gbc.gridwidth = 3;
        mainPanel.add(mainSideContent,gbc);

        ////////////////////////////////////////////////////////////////////////
        
        frame.add(mainPanel);
        frame.pack();
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public int wholeNumber(float fnum){
        int num = Math.round(fnum);
        return num;
    }
        
    public String gtxt(JTextField txt){
        String rtxt = txt.getText();
        return rtxt;
    }
    
    public static void main(String[] args){
        new GUI_Demo();
    }
}
