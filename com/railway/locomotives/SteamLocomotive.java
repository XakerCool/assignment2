package com.railway.locomotives;
import com.entities.Locomotive;

public class SteamLocomotive extends Locomotive
{
    public SteamLocomotive()
    {
        super();
    }
    public SteamLocomotive(int maxSpeed, int maxThrust)
    {
        super(maxSpeed, maxThrust);
        this.type = "Steam";
    }
}
