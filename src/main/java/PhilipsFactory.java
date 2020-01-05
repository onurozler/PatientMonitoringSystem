import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class PhilipsFactory extends AbstractSensorFactory {

    @Override
    public Sensor createSlowCensor() throws FileNotFoundException {
        Sensor slowCensor = new Gson().fromJson(new FileReader("src/measurements.json"), Sensor.class);
        slowCensor.setSpeed(0);
        return slowCensor;
    }

    @Override
    public Sensor createNormalCensor() throws FileNotFoundException {
        Sensor normalCensor = new Gson().fromJson(new FileReader("src/measurements.json"), Sensor.class);
        normalCensor.setSpeed(1);
        return normalCensor;
    }

    @Override
    public Sensor createFastCensor() throws FileNotFoundException {
        Sensor fastCensor = new Gson().fromJson(new FileReader("src/measurements.json"), Sensor.class);
        fastCensor.setSpeed(2);
        return fastCensor;
    }
}
