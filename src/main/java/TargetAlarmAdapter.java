public class TargetAlarmAdapter implements IAlarm {

    private ITargetAlarm alarm;

    public TargetAlarmAdapter(ITargetAlarm alarm) {
        this.alarm = alarm;
    }

    public void activate()
    {
        alarm.ding();
    }
    public void deactivate()
    {
        alarm.close();
    }
}
