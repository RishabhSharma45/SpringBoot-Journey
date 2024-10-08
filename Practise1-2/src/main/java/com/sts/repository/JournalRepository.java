package com.sts.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.sts.entity.Journal;

public interface JournalRepository extends CrudRepository<Journal , Integer>{

}
