public class Display implements Observer<Datum> {

    private static Display instance = null;

    public static synchronized Display getInstance()
    {
        if (instance == null)
            instance = new Display();

        return instance;
    }

    @Override
    public void update(Datum measurement) {
        System.out.println(measurement);
    }
}
