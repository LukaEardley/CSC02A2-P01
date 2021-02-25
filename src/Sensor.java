/**
 * Sensor class that inherits from the Drone class
 */
public class Sensor extends Drones {
//Variables
private String sensorID;
private String orientation;

//Functions
    //generates a new sensor for the drone
    static void GenerateSensors() {
        Sensor newSensor = new Sensor();
        newSensor.sensorID = getAlphaNumericString(4);
        newSensor.orientation = getSensorDirection();
    }

    //Generates a random number between 1 and 4, each number having a corresponding direction in-which the drone will face
    static String getSensorDirection()
    {
        java.util.Random random = new java.util.Random();
        int tmp = random.nextInt(4) + 1;
        if(tmp == 1) {
            return "North";
        }
        else if(tmp == 2) {
            return "East";
        }
        else if (tmp ==3) {
            return "South";
        }
        else {
            return "West";
        }
    }


    //end of class code
    public static void Main(String[] args) {
        GenerateSensors();
    }
}
