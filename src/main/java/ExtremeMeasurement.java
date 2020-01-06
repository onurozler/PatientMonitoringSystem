public class ExtremeMeasurement extends MeasurementInfoDecorator {
    private static int extremeCount = 0;
    private MeasurementInfo measurementInfo;

    public ExtremeMeasurement(MeasurementInfo measurementInfo)
    {
        this.measurementInfo = measurementInfo;
    }

    @Override
    public String getInfo() {
        return measurementInfo.getInfo().toUpperCase() + " Extreme count : " + (++extremeCount);
    }
}
