package oopproject;

public class ShoppingMall {
    public static void main(String[] args) {                                            // main method
    
      Cab uber = new Cab("izhan", "maymar", "KU", 2.0f, 200);
        System.out.println(uber.getFare());
        System.out.println(uber.toString());
    
    }
    
    String ShoppingMallName;
    String ShoppingMallAddress;
    short rating;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    public ShoppingMall() {                                                             // no arg constructor 
    }

    public ShoppingMall(String ShoppingMallName, String ShoppingMallAddress) {           // arg constructor
        this.ShoppingMallName = ShoppingMallName;
        this.ShoppingMallAddress = ShoppingMallAddress;
    }

    public void setShoppingMallName(String ShoppingMallName) {                          // sets name of shopping mall
        this.ShoppingMallName = ShoppingMallName;
    }

    public String getShoppingMallName() {                                              // gets name of shopping mall
        return ShoppingMallName;
    }
    
    public void setShoppingMallAddress(String ShoppingMallAddress) {                    // sets address of shopping mall
        this.ShoppingMallAddress = ShoppingMallAddress;
    }

    public String getShoppingMallAddress() {                                            // gets address of shopping mall
        return ShoppingMallAddress;
    }
    
    public void RemoveShoppingMallName(){                                               // removes the name of Shopping mall
        ShoppingMallName = null;
    }
    public void RemoveShoppingMallAddress(){                                            // removes the address of the shopping mall 
        ShoppingMallAddress = null;
    }

    public void setRating(short rating){
        this.rating = rating;    
    }
    
     public short getRating(){
        return rating; 
     }
    @Override
    public String toString() {                                                                                  // prints the current info 
        return "ShoppingMall{" + "name = " + ShoppingMallName + ", address = " + ShoppingMallAddress + ", rating = "+ rating +'}';
    }
        
}



class Cab{
    
    String name;
    String pickUp;
    String destination;
    float peakFactor;
    double fare;
    short rating;

    public Cab(String name, String pickUp, String destination, float peakFactor, double fare) {
        this.name = name;
        this.pickUp = pickUp;
        this.destination = destination;
        this.peakFactor = peakFactor;
        this.fare = fare;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPickUp(String pickUp) {
        this.pickUp = pickUp;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setPeakFactor(float peakFactor) {
        this.peakFactor = peakFactor;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public String getName() {
        return name;
    }

    public String getPickUp() {
        return pickUp;
    }

    public String getDestination() {
        return destination;
    }

    public float getPeakFactor() {
        return peakFactor;
    }

    public double getFare() {
        return fare * peakFactor;
    }

      public void setRating(short rating){
        this.rating = rating;    
    }
    
     public short getRating(){
        return rating; 
     }
    @Override
    public String toString() {
        return "Cab{" + "name = " + name + ", pick up point = " + pickUp + ", drop off = "+ destination + ", fare = "+ (fare * peakFactor) + ", rating = "+ rating +'}';
    }
    
}