package ru.list.surkovr.logisticwebix.util;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class EntityIdResolver implements ObjectIdResolver {

    private EntityManager entityManager;

    @Autowired
    public EntityIdResolver(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void bindItem(ObjectIdGenerator.IdKey idKey, Object o) {

    }

    @Override
    public Object resolveId(ObjectIdGenerator.IdKey idKey) {
        return entityManager.find(idKey.scope, Long.parseLong(idKey.key.toString()));
    }

    @Override
    public ObjectIdResolver newForDeserialization(Object o) {
        return this;
    }

    @Override
    public boolean canUseFor(ObjectIdResolver objectIdResolver) {
        return false;
    }
}
