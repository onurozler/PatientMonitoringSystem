public class TargetAlarm implements ITargetAlarm {
    @Override
    public void ding() {
        System.out.println("ALERT! ALERT! ALERT!");
    }

    @Override
    public void close() {
        System.out.println("Alarm is turning off.");
    }
}
