package ru.list.surkovr.logisticwebix.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.list.surkovr.logisticwebix.domain.Car;
import ru.list.surkovr.logisticwebix.repo.CarRepo;

@RestController
@RequestMapping("/api/car")
public class CarController extends AbstractRestController<Car, CarRepo> {

    public CarController(CarRepo repo) {
        super(repo);
    }
}
