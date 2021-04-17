package SEN2212_Project;

public class Car {
    private String typeOfVehicle;
    private String brand;
    private String model;
    private CarBody carBody;
    private Wheel wheel;
    private Spoiler spoiler;

    public Car(String typeOfVehicle, String brand, String model, CarBody carBody, Wheel wheel, Spoiler spoiler) {
        this.typeOfVehicle = typeOfVehicle;
        this.brand = brand;
        this.model = model;
        this.carBody = carBody;
        this.wheel = wheel;
        this.spoiler = spoiler;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }

    public CarBody getCarBody() {
        return carBody;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setSpoiler(Spoiler spoiler) {
        this.spoiler = spoiler;
    }

    public Spoiler getSpoiler() {
        return spoiler;
    }

}
