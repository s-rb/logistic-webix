package ru.list.surkovr.logisticwebix.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import ru.list.surkovr.logisticwebix.domain.ComboListItem;
import ru.list.surkovr.logisticwebix.dto.ListItemDto;

import java.util.List;
import java.util.stream.Collectors;

// Класс абстрактный для работы с любыми сущностями
// CRUD действия
// Мэппинги у потомков
// Дженерик - Т - тип параметра с которым работаем (Mark/User etc), R - репозиторий
// @PageableDefault - на случай если не передали параметр
public abstract class AbstractRestController<T extends ComboListItem, R extends JpaRepository<T, ?>> {

    protected R repo;

    public AbstractRestController(R repo) {
        this.repo = repo;
    }

    @GetMapping
    public Page<T> list(@PageableDefault Pageable pageable) {
        return repo.findAll(pageable);
    }

    // Спринг умеет инжектить в контроллере по id готовые объекты, потому можно в параметре указать ожидаемый тип
    @GetMapping("{id}")
    public T getOne(@PathVariable("id") T obj) {
        return obj;
    }

    @PostMapping
    public T add(@RequestBody T obj) {
        return repo.save(obj);
    }

    @PutMapping("{id}")
    public T update(@PathVariable("id") T dbObj, @RequestBody T obj) {
        BeanUtils.copyProperties(obj, dbObj, "id");
        return repo.save(dbObj);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") T dbObj) {
        repo.delete(dbObj);
    }

    @GetMapping("list")
    public List<ListItemDto> list() {
        return repo.findAll().stream()
                .map(entity -> new ListItemDto(entity.getId(), entity.getName()))
                .collect(Collectors.toList());
    }
}
