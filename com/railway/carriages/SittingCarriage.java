package com.railway.carriages;
import com.entities.RailwayCarriage;

public class SittingCarriage extends RailwayCarriage
{
    public SittingCarriage()
    {
        super();
    }
    public SittingCarriage(int placesCount)
    {
        this.type = "Sitting Carriage";
        this.placesCount = placesCount;
    }
}
