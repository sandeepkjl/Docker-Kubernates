package com.example.limit.limitapi.repository;

import com.example.limit.limitapi.dto.LimitDTO;
import com.example.limit.limitapi.model.LimitModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface LimitRepository extends JpaRepository<LimitDTO, Integer> {

    @Override
    LimitDTO save(LimitDTO limidto);

    Optional<LimitDTO> findByAccountId(Integer accountId);

    @Override
    void delete(LimitDTO entity);

}
