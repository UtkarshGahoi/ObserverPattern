package org.example;

public class Display implements Observer{
    private double temperature;
    private double humidity;

    public void update(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    private void display() {
        System.out.println("Temperature: " + temperature + " Humidity: " + humidity);
    }
}
