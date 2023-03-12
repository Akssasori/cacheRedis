package com.lucas.caheRedis.repository;

import com.lucas.caheRedis.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, String> {
}
