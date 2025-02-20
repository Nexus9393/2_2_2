package web.service;

import web.model.Car;
import java.util.List;

public interface CarService {
    List<Car> getAllCars();
    List<Car> getCars(int count);
    List<Car> getCarsLogic(Integer count);
}