package unit9.day4;

/**
 * Created by rebeccaxu on 4/18/17.
 */
public class Vehicle {
    private String make;
    private String model;
    private double fuelCapacity;
    private double fuelLevel;
    private double mpg;
    private double totalMiles = 0;

    public Vehicle(String make, String model, double fuelCapacity, double fuelLevel, double mpg) {
        super();
        this.make = make;
        this.model = model;
        this.fuelCapacity = fuelCapacity;
        this.fuelLevel = fuelLevel;
        this.mpg = mpg;
    }

    public Vehicle(String make, String model, double fuelCapacity, double mpg) {
        this (make, model, fuelCapacity, fuelCapacity, mpg);
    }

    public void addGas (double gallons)
    {
        fuelLevel += gallons;
        if (fuelLevel > fuelCapacity)
            fuelLevel = fuelCapacity;
    }

    public void drive (double miles)
    {
        totalMiles += miles;
        fuelLevel -= miles / mpg;
    }

    public double getRange ()
    {
        return mpg * fuelLevel;
    }

    public String toString()
    {
        return String.format("%s %s (%.1f mpg);  %.1f / %.1f gallons in tank;  Range = %.1f miles" ,
                make, model, mpg, fuelLevel, fuelCapacity, getRange());
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public double getTotalMiles() {
        return totalMiles;
    }


}
