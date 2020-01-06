public class Display implements Observer<MeasurementInfo> {

    private static Display instance = null;

    public static synchronized Display getInstance()
    {
        if (instance == null)
            instance = new Display();

        return instance;
    }

    @Override
    public void update(MeasurementInfo measurement) {
        System.out.println(measurement.getInfo());
    }
}
