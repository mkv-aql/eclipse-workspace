package de.tuhh.diss.SS19;

public class Task_4 {
	

	public static void main(String[] args) {
		//Create sensors
		Sensor tempSensor = new TempSensor("Temp Sensor brand");
		Sensor co2Sensor = new CO2Sensor("CO2 Sensor brand");
		Sensor lightSensor = new LightSensor("Light Sensor brand");
		
		//Put sensors into an array (collect sensors), can put only 1 or 2 sensors too.
		Sensor[] sensors = new Sensor[] {tempSensor, co2Sensor, lightSensor};
		
		//Create a device with the collected sensors
		Device device = new Device(sensors, "Device that has 3 sensors", 150);
		
		 // Start the device
        if (device.start()) {
            System.out.println("Device started successfully");
        } else {
            System.out.println("Failed to start device");
        }

        // Read from the sensors
        for (Sensor sensor : sensors) {
            System.out.println("Sensor reading from " +sensor.getBrand() +" : "  + sensor.readSensor());
        }

        // Stop the device
        if (device.stop()) {
            System.out.println("Device stopped successfully");
        } else {
            System.out.println("Failed to stop device");
        }
		

	}

}




