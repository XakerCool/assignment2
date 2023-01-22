package com.railway.carriages;
import com.entities.RailwayCarriage;

public class ReservedSeat extends RailwayCarriage
{
    public ReservedSeat()
    {
        super();
    }
    public ReservedSeat(int placesCount)
    {
        this.type = "Reserved Carriage";
        this.placesCount = placesCount;
    }
}
