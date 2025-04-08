package web.model;

import org.springframework.stereotype.Component;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.Objects;


public class Car {

    private String model;
    private String serial;
    private String engineType;

    public Car(String model, String serial, String engineType) {
        this.model = model;
        this.serial = serial;
        this.engineType = engineType;
    }

    public String getModel() {
        return model;
    }

    public String getSerial() {
        return serial;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(serial, car.serial) && Objects.equals(engineType, car.engineType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, serial, engineType);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", serial='" + serial + '\'' +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
