package com.tomas.Unimanager_db.Repositories;



import com.tomas.Unimanager_db.Models.Unit;

import org.springframework.data.repository.CrudRepository;

public interface UnitRepository extends CrudRepository<Unit, Integer> {
    Iterable<Unit> findByName(String name);
    Iterable<Unit> findByNameLike(String name);
    Iterable<Unit> findByCreditsBetween(int min,int max);
    Iterable<Unit> findByNameLikeAndCreditsBetween(String name,int min,int max);
}
