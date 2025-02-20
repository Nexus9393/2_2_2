package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car(1, "Toyota", "Corolla"));
        cars.add(new Car(2, "Honda", "Civic"));
        cars.add(new Car(3, "Ford", "Mustang"));
        cars.add(new Car(4, "BMW", "X5"));
        cars.add(new Car(5, "Mercedes", "S-Class"));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }

    @Override
    public List<Car> getCarsLogic(Integer count) {
        if (count != null && count > 0 && count < 5) {
            return getCars(count);
        } else {
            return getAllCars();
        }
    }


}