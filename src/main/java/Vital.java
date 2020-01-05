
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Vital {

    @SerializedName("respiratory")
    @Expose
    private Integer respiratory;
    @SerializedName("cardiovascular")
    @Expose
    private Integer cardiovascular;

    public Vital() {
    }

    public Vital(Integer respiratory, Integer cardiovascular) {
        super();
        this.respiratory = respiratory;
        this.cardiovascular = cardiovascular;
    }

    public Integer getRespiratory() {
        return respiratory;
    }

    public void setRespiratory(Integer respiratory) {
        this.respiratory = respiratory;
    }

    public Integer getCardiovascular() {
        return cardiovascular;
    }

    public void setCardiovascular(Integer cardiovascular) {
        this.cardiovascular = cardiovascular;
    }
}