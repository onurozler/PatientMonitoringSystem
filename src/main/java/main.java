import java.io.FileNotFoundException;

class Main {
    public static void main(String[] args) throws FileNotFoundException {
        AbstractSensorFactory philipsFactory = new PhilipsFactory();
        AbstractSensorFactory generalElectricFactory = new PhilipsFactory();

        Sensor slowPhilipsSensor = philipsFactory.createSlowCensor();
        Sensor fastGeSensor = generalElectricFactory.createFastCensor();

        slowPhilipsSensor.registerObserver(Display.getInstance());
        fastGeSensor.registerObserver(Display.getInstance());

        slowPhilipsSensor.start();
        fastGeSensor.start();

        while(true);
    }
}
