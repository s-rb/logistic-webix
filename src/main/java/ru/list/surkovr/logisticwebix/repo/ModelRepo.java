package ru.list.surkovr.logisticwebix.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.list.surkovr.logisticwebix.domain.Model;

public interface ModelRepo extends JpaRepository<Model, Long> {
}
