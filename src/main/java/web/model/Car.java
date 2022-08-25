package web.model;


public class Car {
    private String model;
    private String vendor;
    private int vin;

    public Car(String model, String vendor, int vin) {
        this.model = model;
        this.vendor = vendor;
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", vendor='" + vendor + '\'' +
                ", vin=" + vin +
                '}';
    }
}
