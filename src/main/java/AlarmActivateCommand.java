public class AlarmActivateCommand implements Command {
    private Alarm alarm;

    public AlarmActivateCommand(Alarm alarm)
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
