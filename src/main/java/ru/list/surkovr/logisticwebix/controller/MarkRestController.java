package ru.list.surkovr.logisticwebix.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.list.surkovr.logisticwebix.domain.Mark;
import ru.list.surkovr.logisticwebix.repo.MarkRepo;

@RestController
@RequestMapping("/api/mark")
public class MarkRestController extends AbstractRestController<Mark, MarkRepo> {
    public MarkRestController(MarkRepo repo) {
        super(repo);
    }
}
