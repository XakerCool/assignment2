package com.railway.carriages;
import com.entities.RailwayCarriage;

public class Compartment  extends RailwayCarriage
{
    public Compartment()
    {
        super();
    }
    public Compartment(int placesCount)
    {
        this.type = "Compartment Carriage";
        this.placesCount = placesCount;
    }
}
