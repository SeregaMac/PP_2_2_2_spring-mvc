package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/cars")
public class CarController {

    private List<Car> arrayCar;

    {
        arrayCar = new ArrayList<>();
        arrayCar.add(new Car("BMV", "X5", 111));
        arrayCar.add(new Car("Lada", "Kalina", 222));
        arrayCar.add(new Car("Skoda", "Octavia", 333));
        arrayCar.add(new Car("KIA", "RIO", 444));
        arrayCar.add(new Car("YAZ", "PATRIOT", 555));
    }

    @GetMapping
    public String showCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        if (count < 5) {
            List<Car> listCars = arrayCar.stream().limit(count).collect(Collectors.toList());
            model.addAttribute("cars", listCars);
        } else {
            model.addAttribute("cars", arrayCar);
        }
        return "cars/showAllCars";
    }
}
