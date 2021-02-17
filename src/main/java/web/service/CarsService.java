package web.service;

import org.springframework.ui.Model;
import web.model.Car;

import java.util.List;

public interface CarsService {
    List<Car> getCars(Integer count);
    void setCars(List<Car> cars);
}
