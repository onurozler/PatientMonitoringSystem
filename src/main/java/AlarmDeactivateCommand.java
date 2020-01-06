public class AlarmDeactivateCommand implements Command {
    private Alarm alarm;

    public AlarmDeactivateCommand(Alarm alarm)
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
