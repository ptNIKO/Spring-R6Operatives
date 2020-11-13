package com.operatorsInfo.springR6S.repos;

import com.operatorsInfo.springR6S.model.Operative;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperativeRepo extends CrudRepository<Operative, Integer> {
}
