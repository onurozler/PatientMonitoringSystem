public class AlarmDeactivateCommand implements Command {
    private TargetAlarmAdapter alarm;

    public AlarmDeactivateCommand(TargetAlarmAdapter alarm)
    {
        this.alarm = alarm;
    }

    @Override
    public void execute() {
        alarm.activate();
    }

    @Override
    public void undo() {
        alarm.deactivate();
    }
}
