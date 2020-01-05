import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("vital")
    @Expose
    private Vital vital;
    @SerializedName("digestive")
    @Expose
    private Integer digestive;
    @SerializedName("nervous")
    @Expose
    private Integer nervous;
    @SerializedName("immune")
    @Expose
    private Integer immune;

    public Datum() {
    }

    public Datum(Vital vital, Integer digestive, Integer nervous, Integer immune) {
        super();
        this.vital = vital;
        this.digestive = digestive;
        this.nervous = nervous;
        this.immune = immune;
    }

    public Vital getVital() {
        return vital;
    }

    public void setVital(Vital vital) {
        this.vital = vital;
    }

    public Integer getDigestive() {
        return digestive;
    }

    public void setDigestive(Integer digestive) {
        this.digestive = digestive;
    }

    public Integer getNervous() {
        return nervous;
    }

    public void setNervous(Integer nervous) {
        this.nervous = nervous;
    }

    public Integer getImmune() {
        return immune;
    }

    public void setImmune(Integer immune) {
        this.immune = immune;
    }
    @Override
    public String toString() {
        return "Datum{" +
                "vital=" + vital +
                ", digestive=" + digestive +
                ", nervous=" + nervous +
                ", immune=" + immune +
                '}';
    }
}