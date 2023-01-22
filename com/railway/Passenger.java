package com.railway;
import com.entities.Human;
import com.entities.RailwayCarriage;

public class Passenger extends Human
{
    private int id;
    protected int place;
    protected Train train;
    protected int carriageNumber;
    public Passenger()
    {
        super();
    }
    public Passenger(String name, int age, boolean disability, int id)
    {
        super(name, age, disability);
        this.id = id;
    }
    public void setTrain(Train train)
    {
        this.train = train;
    }
    public Train getTrain()
    {
        return this.train;
    }
    public int getId()
    {
        return this.id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public int getCarriageNumber()
    {
        return this.carriageNumber;
    }
    public void setCarriageNumber(int carriageNumber)
    {
        this.carriageNumber = carriageNumber;
    }
    @Override
    public String toString()
    {
        return this.name + ". Train num: " + this.train.getTrainNumber() + ". Carriage num: " + this.carriageNumber;
    }
}
