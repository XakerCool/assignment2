package com.entities;

public class RailwayCarriage
{
    private int id;
    protected String type;
    protected int placesCount;
    public RailwayCarriage()
    {
        this.id = -1;
        this.type = "";
        this.placesCount = -1;
    }
    public RailwayCarriage(int id, String type, int placesCount)
    {
        this.id = id;
        this.type = type;
        this.placesCount = placesCount;
    }

    public String getType() {
        return this.type;
    }

    public int getPlacesCount() {
        return this.placesCount;
    }

    public void getRailwayCarriageInfo()
    {
        System.out.println("Railway Carriage type: " + this.type + ". Places count: " + this.placesCount);
    }
}
