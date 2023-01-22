package com.railway.locomotives;
import com.entities.Locomotive;
public class DieselLocomotive extends Locomotive
{
    public DieselLocomotive()
    {
        super();
    }
    public DieselLocomotive(int maxSpeed, int maxThrust)
    {
        super(maxSpeed, maxThrust);
        this.type = "Diesel";
    }
    @Override
    public int getMaxSpeed()
    {
        super.getMaxSpeed();
        System.out.println("I got max speed");
        return 0;
    }
}
