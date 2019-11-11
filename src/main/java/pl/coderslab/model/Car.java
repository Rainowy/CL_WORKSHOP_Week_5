package pl.coderslab.model;

public class Car {
    //working
    private String name;
    private String model;

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public Car(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
