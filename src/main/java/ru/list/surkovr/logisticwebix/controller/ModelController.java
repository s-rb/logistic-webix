package ru.list.surkovr.logisticwebix.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.list.surkovr.logisticwebix.domain.Model;
import ru.list.surkovr.logisticwebix.repo.ModelRepo;

@RestController
@RequestMapping("/api/model")
public class ModelController extends AbstractRestController<Model, ModelRepo>{
    public ModelController(ModelRepo repo) {
        super(repo);
    }
}
