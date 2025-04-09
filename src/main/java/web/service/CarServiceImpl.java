package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private final List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Audi", "Q7", "Gasoline"));
        carList.add(new Car("BMW", "I7", "Electric"));
        carList.add(new Car("Li", "L7", "Hybrid"));
        carList.add(new Car("Volkswagen", "Passat", "Diesel"));
        carList.add(new Car("KIA", "Sorento", "Gasoline"));
    }

    @Override
    public List<Car> getCarList(int count) {
        if (count == 0 || count >= 5) {
            return carList;
        } else {
            return carList.stream().limit(count).toList();
        }
    }
}
