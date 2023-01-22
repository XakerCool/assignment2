package com.railway.carriages;

import com.entities.RailwayCarriage;

public class RestaurantCarriage extends RailwayCarriage
{
    public RestaurantCarriage()
    {
        super();
    }
    public RestaurantCarriage(int placesCount)
    {
        this.type = "Restaurant Carriage";
        this.placesCount = placesCount;
    }
}
