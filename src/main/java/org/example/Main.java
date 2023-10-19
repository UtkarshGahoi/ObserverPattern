package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Display display1 = new Display();
        Display display2 = new Display();
        weatherStation.registerObserver(display1);
        weatherStation.registerObserver(display2);
        weatherStation.setTemperature(25.5);
        weatherStation.setHumidity(70);
//        weatherStation.notifyObservers();

    }
}