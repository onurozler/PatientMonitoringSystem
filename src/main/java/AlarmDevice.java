public class AlarmDevice {
    Command activateCommand;

    public void SetActivateCommand(Command command)
    {
        activateCommand = command;
    }

    public void OnAlarmTriggered()
    {
        activateCommand.execute();
    }
}
