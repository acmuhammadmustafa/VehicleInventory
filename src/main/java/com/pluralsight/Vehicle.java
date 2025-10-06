package com.pluralsight;

public class Vehicle {
    private long vehicleID;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;



    public Vehicle(long vehicleID, String makeModel, String color, int odometerReading, float price){
        this.vehicleID = vehicleID;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }


    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public void setColor(String color) {
        this.color = color;
    }

// --------
    public long getVehicleID(){
        return this.vehicleID;
    }

    public void setVehicleID(long newVehicleID){
        this.vehicleID = newVehicleID;
    }
// -------
    public String getMakeModel(){
        return this.makeModel;
    }

    public void setMakeModel(){
        this.makeModel = makeModel;
    }
// --------
    public String getColor(){
        return this.color;
    }

    public void setColor(){
        this.color = color;
    }
// --------
    public int getOdometerReading(){
        return this.odometerReading;
    }

    public void setOdometerReading(int newOdometerReading){
        this.odometerReading=newOdometerReading;
    }
// ----------
    public float getPrice(){
        return this.price;
    }

    public void setPrice(float newPrice){
        this.price = newPrice;
    }








}
