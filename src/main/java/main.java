import java.io.FileNotFoundException;

class Main {
    public static void main(String[] args) throws FileNotFoundException {
        AbstractSensorFactory philipsFactory = new PhilipsFactory();
        AbstractSensorFactory generalElectricFactory = new PhilipsFactory();

        Sensor slowPhilipsSensor = philipsFactory.createSlowCensor();
        System.out.println(slowPhilipsSensor.getData());
        Sensor fastGeSensor = generalElectricFactory.createFastCensor();

        Display display = new Display();
        slowPhilipsSensor.registerObserver(display);
        fastGeSensor.registerObserver(display);

        slowPhilipsSensor.start();
        fastGeSensor.start();

        while(true);
    }
}
