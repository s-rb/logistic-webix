package ru.list.surkovr.logisticwebix.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.list.surkovr.logisticwebix.domain.Car;

public interface CarRepo extends JpaRepository<Car, Long> {
}
