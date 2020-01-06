import java.io.FileNotFoundException;

class Main {
    public static void main(String[] args) throws FileNotFoundException {
        AbstractSensorFactory philipsFactory = new PhilipsFactory();
        AbstractSensorFactory generalElectricFactory = new PhilipsFactory();

        Sensor slowPhilipsSensor = philipsFactory.createSlowCensor();
        Sensor fastGeSensor = generalElectricFactory.createFastCensor();

        slowPhilipsSensor.registerObserver(Display.getInstance());
        fastGeSensor.registerObserver(Display.getInstance());

        AlarmDevice alarmDevice = new AlarmDevice();
        IAlarm alarm = new TargetAlarmAdapter(new TargetAlarm());
        alarmDevice.SetActivateCommand(new AlarmActivateCommand(alarm));

        slowPhilipsSensor.start(alarmDevice);
        fastGeSensor.start(alarmDevice);

        while(true);
    }
}
