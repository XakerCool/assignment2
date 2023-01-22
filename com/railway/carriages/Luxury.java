package com.railway.carriages;
import com.entities.RailwayCarriage;

public class Luxury extends RailwayCarriage
{
    public Luxury()
    {
        super();
    }
    public Luxury(int placesCount)
    {
        this.type = "Luxury Carriage";
        this.placesCount = placesCount;
    }
}
