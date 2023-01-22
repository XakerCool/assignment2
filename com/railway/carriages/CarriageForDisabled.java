package com.railway.carriages;
import com.entities.RailwayCarriage;

public class CarriageForDisabled  extends RailwayCarriage
{
    public CarriageForDisabled()
    {
        super();
    }
    public CarriageForDisabled(int placesCount)
    {
        this.type = "Carriage for disabled";
        this.placesCount = placesCount;
    }
}
