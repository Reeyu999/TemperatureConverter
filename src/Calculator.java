import java.util.Scanner;

public class Calculator {

    private double temperature;


    public double getTemperature() {
        return temperature;
    }


    public void countInFahrenheit(double temperature){
        double temperatureInFahrenheit;
        temperatureInFahrenheit = (temperature * 1.8) + 32;
        System.out.println(temperature + " degrees in Celsjusz = " +
                temperatureInFahrenheit + " in Fahrenheit");
    }

}
