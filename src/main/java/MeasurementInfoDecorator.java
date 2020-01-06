public abstract class MeasurementInfoDecorator implements MeasurementInfo{
    @Override
    public String getInfo() {
        return super.toString().toUpperCase();
    }
}
