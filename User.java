import java.io.*;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.*;
import com.google.gson.annotations.*;
import com.railway.Passenger;
import com.railway.Train;
import org.json.simple.JSONObject;

import java.lang.reflect.Array;
import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class User
{
    private Scanner scanner;
    private File file;
    private Gson gson;
    public User() {
        scanner = new Scanner(System.in);
    }
    public void sellTicket()
    {
        Passenger passenger = new Passenger();
        System.out.println("Input passenger full name: ");
        passenger.setName(scanner.nextLine());
        System.out.println("Input passenger age: ");
        passenger.setAge(scanner.nextInt());
        System.out.println("Is passenger disabled (1 - yes, 0 - no): ");
        passenger.setDisability(scanner.nextInt() == 1);
        System.out.println("Input train number: ");
        Train train = new Train();
        train.setTrainNumber(scanner.nextInt());
        passenger.setTrain(train);
        System.out.println("Input carriage number: ");
        passenger.setCarriageNumber(scanner.nextInt());
        scanner.nextLine();
        try
        {
            gson = new Gson();
            file = new File("tickets.json");
            FileReader reader = new FileReader(file);
            ArrayList<Passenger> passengers = gson.fromJson(reader, new TypeToken<ArrayList<Passenger>>() {}.getType());
            reader.close();
            FileWriter fileWriter = new FileWriter(file);
            if (passengers == null)
            {
                passengers = new ArrayList<Passenger>();
            }
            passenger.setId(passengers.size());
            passengers.add(passenger);
            gson.toJson(passengers, fileWriter);
            fileWriter.close();
            System.out.println("Ticket was added successfully");
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    public Passenger getPassenger()
    {
        System.out.println();
        System.out.print("Input passenger full name: ");
        String passengerFullName = scanner.nextLine();
        System.out.print("Input passenger's train number: ");
        int passengerTrainNumber = scanner.nextInt();
        System.out.print("Input passenger's carriage number: ");
        int carriageNumber = scanner.nextInt();
        Passenger passenger = new Passenger();
        passenger.setName(passengerFullName);
        Train train = new Train();
        train.setTrainNumber(passengerTrainNumber);
        passenger.setTrain(train);
        passenger.setCarriageNumber(carriageNumber);
        // запрос в бд на информацию о пассажире, поезде и вагоне
        try
        {
            gson = new Gson();
            file = new File("tickets.json");
            FileReader reader = new FileReader(file);
            ArrayList<Passenger> passengers = new Gson().fromJson(reader, new TypeToken<ArrayList<Passenger>>() {}.getType());
            reader.close();
            if (passengers == null)
            {
                passengers = new ArrayList<Passenger>();
            }
            passenger = passengers.get(passengers.indexOf(passenger));
        }
        catch (Exception ex)
        {}
        return passenger;
    }
    public void returnTicket()
    {
        Passenger passenger = getPassenger();
        try
        {
            gson = new Gson();
            file = new File("tickets.json");
            FileReader reader = new FileReader(file);
            ArrayList<Passenger> passengers = gson.fromJson(reader, new TypeToken<ArrayList<Passenger>>() {}.getType());
            reader.close();
            FileWriter fileWriter = new FileWriter(file);
            if (passengers == null)
            {
                passengers = new ArrayList<Passenger>();
            }
            passengers.remove(passenger);
            gson.toJson(passengers, fileWriter);
            fileWriter.close();
        }
        catch (Exception ex)
        {}
    }
    public void getTrainInfo()
    {
        System.out.print("Input train number: ");
        int trainNumber = scanner.nextInt();
        //обращение к бд, чтобы вытащить данные о поезде
        //Train train = train from db
        Train train = new Train();
        System.out.println("Train number: " + train.getTrainNumber());
        System.out.println("Train type: " + train.getType());
        System.out.println("Departure point: " + train.getDeparturePoint());
        System.out.println("Destination number: " + train.getDestinationPoint());
        System.out.println("Locomotive type: " + train.getLocomotive().getType());
        System.out.println("Carriages count: " + Array.getLength(train.getCarriages()));
        System.out.println("Passengers count: " + Array.getLength(train.getPassengers()));
    }
    public boolean updateTicket()
    {
        System.out.print("Choose option:\n1) Change passenger's carriage\n2) Change passenger's train\n3) Change passenger ticket\n0) Cancel (exit)");
        String updateType = scanner.nextLine();
        if (updateType == "0")
        {
            return false;
        }
        else
        {
            Passenger passenger = getPassenger();
            switch (updateType)
            {
                case "1":
                    System.out.print("Input new carriage number: ");
                    passenger.setCarriageNumber(scanner.nextInt());
                    break;
                case "2":
                    System.out.print("Input new train number: ");
                    Train train = new Train();
                    //обращение к бд, чтобы получить поезд по номеру
                    passenger.setTrain(train);
                    break;
                case "3":
                    this.returnTicket();
                    scanner.nextLine();
                    this.sellTicket(); // создание нового билета вместо старого
                    break;
                default:
                    System.out.println("Incorrect option!");
                    return false;
            }
            return true;
        }
        //Обращение к бд, чтобы обновить данные пользователя
    }
}
