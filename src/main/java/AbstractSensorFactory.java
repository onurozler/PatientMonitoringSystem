import java.io.FileNotFoundException;

public abstract class AbstractSensorFactory {
    public abstract Sensor createSlowCensor() throws FileNotFoundException;
    public abstract Sensor createNormalCensor() throws FileNotFoundException ;
    public abstract Sensor createFastCensor() throws FileNotFoundException;
}
