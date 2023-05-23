package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public String showCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {

        List<Car> listCars = carService.getCar(count);
        model.addAttribute("cars", listCars);
        return "cars/showAllCars";
    }
}
