import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Sensor implements Observable<Datum>{

    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    private ArrayList<Observer<Datum>> observers = new ArrayList ();
    private int speed = 0;

    public Sensor(){}

    public Sensor(int speed) {
        this.speed = speed;
    }

    public void start()
    {
        new Thread(() -> {
            for(Datum datum: data)
            {
                notifyObservers(datum);
                try {
                    Thread.sleep((3 - speed) * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

    public Sensor(List<Datum> data) {
        super();
        this.data = data;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public List<Datum> getData() {
        return data;
    }

    public void registerObserver(Observer<Datum> observer) {
        observers.add(observer);
    }

    public void unregisterObserver(Observer<Datum> observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Datum data) {
        for (Observer<Datum> observer: observers) {
            observer.update(data);
        }
    }
}