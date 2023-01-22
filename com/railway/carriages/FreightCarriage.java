package com.railway.carriages;
import com.entities.RailwayCarriage;

public class FreightCarriage extends RailwayCarriage
{
    public FreightCarriage()
    {
        super();
    }
    public FreightCarriage(int placesCount)
    {
        this.type = "Freight Carriage";
        this.placesCount = placesCount;
    }
}
