package de.tuhh.diss.WS21;

import de.tuhh.diss.io.SimpleIO;

public class City {
private int population;
private double north;
private double east;
private String name; //[ADDED]

public City(String name, int population) {
this.name = name;
this.population = population;
}

//convention, should be setCoordinates
public void set_coordinates(double latitude, double longitude) {
// north = ... assume implemented
// east = ... assume implemented
this.north = north;
this.east = east;
}

//public double getDistance(City city1, City city2) //[ORIGINAL]
public static double getDistance(City city1, City city2) {
double distanceNorth = city1.north - city2.north;
double distanceEast = city1.east - city2.east;
//return Math.sqrt(distanceNorth^2 + distanceEast^2);
return Math.sqrt(Math.pow(distanceNorth,2) + Math.pow(distanceEast, 2));

}

public void display() {
SimpleIO.println("City name: " + name);
SimpleIO.println("Population: " + population);
}

//java convention, should be in another class example: CompareCity.java
public static void main(String args[]) {
final double HAMBURG_LONGITUDE = 9.993333;
final double HAMBURG_LATITUDE = 53.550556;
final int HAMBURG_POPULATION = 1841000;
final double BERLIN_LONGITUDE = 13.408333;
final double BERLIN_LATITUDE = 52.518611;
final int BERLIN_POPULATION = 3664088;

City hamburg = new City("Hamburg", HAMBURG_POPULATION);
hamburg.set_coordinates(HAMBURG_LONGITUDE, HAMBURG_LATITUDE); //Semantic error, longitute and latitude wrong way round
SimpleIO.println("Details of city 1:");
hamburg.display();

City berlin = new City("Berlin", BERLIN_POPULATION);
berlin.set_coordinates(BERLIN_LONGITUDE, BERLIN_LATITUDE);
SimpleIO.println("Details of city 2:");
berlin.display();

double distance = getDistance(hamburg, berlin);
SimpleIO.println("Distance: " + distance);
}
}