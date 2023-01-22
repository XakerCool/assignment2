package com.entities;

public class Locomotive
{
    private int id;
    protected String type;
    protected int maxSpeed;
    protected int maxThrust;

    public Locomotive()
    {
        this.id = -1;
        this.type = "";
        this.maxSpeed = -1;
        this.maxThrust = -1;
    }
    public Locomotive(int maxSpeed, int maxThrust)
    {
        this.maxSpeed = maxSpeed;
        this.maxThrust = maxThrust;
    }
    public int getMaxSpeed()
    {
        return this.maxSpeed;
    }
    public int getMaxThrust()
    {
        return this.maxThrust;
    }
    public String getType()
    {
        return this.type;
    }
    public void getLocomotiveInfo()
    {
        System.out.println("Locomotive type: " + this.type + "max speed: " + this.maxSpeed + ". Max thrust (max carriages count): " + this.maxThrust);
    }
}
