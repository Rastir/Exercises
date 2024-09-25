package com.liveaqua.cala.repository;

import com.liveaqua.cala.model.Aqualover;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAqualoverRepository extends JpaRepository<Aqualover, Long>{
    
}
