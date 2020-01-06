import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class Measurement implements MeasurementInfo{

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

    public Measurement() {
    }

    public Measurement(Vital vital, Integer digestive, Integer nervous, Integer immune) {
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

    public boolean isOutsideOfRange() {
        return vital.getRespiratory() > 500 || vital.getRespiratory()  < 100 ||
                vital.getCardiovascular() > 500 || vital.getCardiovascular() < 100 ||
                digestive > 500 || digestive < 100 ||
                nervous > 500 || nervous < 100 ||
                immune > 500 || immune < 100;
    }

    @Override
    public String getInfo() {
        return "Measurement{" +
                "cardiovascular =" + vital.getCardiovascular() +
                ", respiratory=" + vital.getRespiratory() +
                ", digestive=" + digestive +
                ", nervous=" + nervous +
                ", immune=" + immune +
                '}';
    }

}