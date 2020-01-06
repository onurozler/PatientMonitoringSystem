public class AlarmActivateCommand implements Command {
    private IAlarm alarm;

    public AlarmActivateCommand(IAlarm alarm)
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
