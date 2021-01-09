package ru.list.surkovr.logisticwebix.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.list.surkovr.logisticwebix.domain.Mark;

public interface MarkRepo extends JpaRepository<Mark, Long> {
}
