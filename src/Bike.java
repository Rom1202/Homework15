public class Bike extends WheeledTransport{
    public Bike(String modelName) {
        super(modelName, 2);
    }

    public Bike(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}
