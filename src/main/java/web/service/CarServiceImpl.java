package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> CARLIST;

    {
        CARLIST = new ArrayList<>();
        CARLIST.add(new Car("Audi", "Q7", "Gasoline"));
        CARLIST.add(new Car("BMW", "I7", "Electric"));
        CARLIST.add(new Car("Li", "L7", "Hybrid"));
        CARLIST.add(new Car("Volkswagen", "Passat", "Diesel"));
        CARLIST.add(new Car("KIA", "Sorento", "Gasoline"));
    }

    @Override
    public List<Car> getCarList(int count) {
        if (count == 0 || count >= 5) {
            return CARLIST;
        } else {
            return CARLIST.stream().limit(count).toList();
        }
    }
}
