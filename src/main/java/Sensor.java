import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Sensor implements Observable<MeasurementInfo>{

    @SerializedName("data")
    @Expose
    private List<Measurement> data = null;
    private ArrayList<Observer<MeasurementInfo>> observers = new ArrayList ();
    private int speed = 0;

    public Sensor(){}

    public Sensor(int speed) {
        this.speed = speed;
    }

    public void start(AlarmDevice alarmDevice)
    {
        new Thread(() -> {
            for(Measurement datum: data)
            {
                if(datum.isOutsideOfRange())
                {
                    MeasurementInfo measurementInfo = datum;
                    measurementInfo = new ExtremeMeasurement(measurementInfo);
                    notifyObservers(measurementInfo);
                    alarmDevice.OnAlarmTriggered();
                }
                else
                    notifyObservers(datum);


                try {
                    Thread.sleep((3 - speed) * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

    public Sensor(List<Measurement> data) {
        super();
        this.data = data;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public List<Measurement> getData() {
        return data;
    }

    public void registerObserver(Observer<MeasurementInfo> observer) {
        observers.add(observer);
    }

    public void unregisterObserver(Observer<MeasurementInfo> observer) {
        observers.remove(observer);
    }

    public void notifyObservers(MeasurementInfo data) {
        for (Observer<MeasurementInfo> observer: observers) {
            observer.update(data);
        }
    }
}