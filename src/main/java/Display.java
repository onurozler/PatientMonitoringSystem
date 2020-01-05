public class Display implements Observer<Datum> {
    @Override
    public void update(Datum measurement) {
        System.out.println(measurement);
    }
}
