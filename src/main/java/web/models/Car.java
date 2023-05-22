package web.models;

public class Car {
    private String marka;
    private String model;
    private int nomer;

    public Car() {
    }

    public Car(String marka, String model, int nomer) {
        this.marka = marka;
        this.model = model;
        this.nomer = nomer;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }
}
