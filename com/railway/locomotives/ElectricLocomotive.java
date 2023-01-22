package com.railway.locomotives;
import com.entities.Locomotive;

public class ElectricLocomotive extends Locomotive
{
    public ElectricLocomotive()
    {
        super();
    }
    public ElectricLocomotive(int maxSpeed, int maxThrust)
    {
        super(maxSpeed, maxThrust);
        this.type = "Electric";
    }
}
