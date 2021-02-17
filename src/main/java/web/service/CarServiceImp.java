package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarsService{

    private List<Car> cars;

    public CarServiceImp() {
        cars = new ArrayList<>();
        cars.add(new Car("Mercdes-Benz", "e280", "333"));
        cars.add(new Car("Gaz", "234", "101"));
        cars.add(new Car("Honda", "Accord", "555"));
        cars.add(new Car("Shkoda", "Fabia", "007"));
        cars.add(new Car("Lada", "2101", "001"));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if ((count == null) || (count >=5) || (count < 0)) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }

    @Override
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
