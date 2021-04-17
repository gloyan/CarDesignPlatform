package SEN2212_Project;

public class Wheel {
    private Rim rim;
    private String modelOfWheel;

    public Wheel(Rim rim, String brandOfWheel){
        this.rim = rim;
        this.modelOfWheel = brandOfWheel;
    }

    public void setRim(Rim rim){
        this.rim = rim;
    }

    public Rim getRim(){
        return rim;
    }

    public void setModelOfWheel(String setBrandOfWheel){
        this.modelOfWheel = modelOfWheel;
    }

    public String getModelOfWheel(){
        return modelOfWheel;
    }

    public String changeModelOfWheel(){
        return modelOfWheel;
    }

}
