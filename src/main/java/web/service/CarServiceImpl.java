package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCar(int count) {
        List<Car> arrayCar = new ArrayList<>();

        arrayCar.add(new Car("BMV", "X5", 111));
        arrayCar.add(new Car("Lada", "Kalina", 222));
        arrayCar.add(new Car("Skoda", "Octavia", 333));
        arrayCar.add(new Car("KIA", "RIO", 444));
        arrayCar.add(new Car("YAZ", "PATRIOT", 555));

        if (count < 0) {
            return new ArrayList<>();
        }
        return arrayCar.stream().limit(count).collect(Collectors.toList());
    }
}
