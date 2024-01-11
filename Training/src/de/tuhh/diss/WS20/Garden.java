package de.tuhh.diss.WS20;

//The Garden class contains an array of Plant objects
public class Garden {
 private Plant[] plants;

 public Garden(Plant[] plants) {
     this.plants = plants;
 }

 public void addSeeds(String plantType, String name) {
     // The code for adding seeds based on the type and name would go here
 }

 public void maintain() {
     for (Plant plant : plants) {
         plant.cut();
         plant.water();
     }
 }
}