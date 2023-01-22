package com.railway;
import com.entities.*;
import java.util.ArrayList;

public class Train
{
    private int trainNumber;
    private String type;
    private String departurePoint;
    private String destinationPoint;
    private Locomotive locomotive;
    private ArrayList<RailwayCarriage> carriages;
    private ArrayList<Passenger> passengers;
    public Train()
    {
        this.trainNumber = -1;
        this.type = "none";
        this.departurePoint = "none";
        this.destinationPoint = "none";
        this.locomotive = new Locomotive();
        this.carriages = new ArrayList<RailwayCarriage>();
        this.passengers = new ArrayList<Passenger>();
    }
    public Train(int trainNumber, String type, String departurePoint, String destinationPoint, Locomotive locomotive, ArrayList<RailwayCarriage> carriages, ArrayList<Passenger> passengers)
    {
        this.trainNumber = trainNumber;
        this.type = type;
        this.departurePoint = departurePoint;
        this.destinationPoint = destinationPoint;
        this.locomotive = locomotive;
        this.carriages = carriages;
        this.passengers = passengers;
    }
    public int getTrainNumber() {
        return this.trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getType() {
        return this.type;
    }


    public void setType(String type) {
        this.type = type;
    }

    public String getDeparturePoint() {
        return this.departurePoint;
    }

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }

    public String getDestinationPoint() {
        return this.destinationPoint;
    }

    public void setDestinationPoint(String destinationPoint) {
        this.destinationPoint = destinationPoint;
    }
    public Locomotive getLocomotive() {
        return this.locomotive;
    }

    public void setLocomotive(Locomotive locomotive) {
        this.locomotive = locomotive;
    }

    public ArrayList<RailwayCarriage> getCarriages() {
        return this.carriages;
    }

    public ArrayList<Passenger> getPassengers() {
        return this.passengers;
    }

    public void addCarriage(RailwayCarriage carriage)
    {
        this.carriages.add(carriage);
    }

    public void removeCarriage(int carriageNumber)
    {
        try
        {
            this.carriages.remove(carriageNumber);
        }
        catch (IndexOutOfBoundsException exception)
        {
            System.out.println("You inputted wrong carriage number!");
        }
    }

    public void addPassenger(Passenger passenger)
    {
        this.passengers.add(passenger);
    }

    public void removePassenger(int passengerNumber)
    {
        try
        {
            this.passengers.remove(passengerNumber);
        }
        catch (IndexOutOfBoundsException exception)
        {
            System.out.println("You inputted wrong passenger number!");
        }
    }
}
