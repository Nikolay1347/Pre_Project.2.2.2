package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.service.CarService;


@Controller
public class CarController {

    private final CarService CARSERVICE;

    public CarController(CarService carService) {
        this.CARSERVICE = carService;
    }

    @GetMapping("/cars")
    public String sendToWeb(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("list", CARSERVICE.getCarList(count));
        return "cars";
    }
}
