package com.lucas.caheRedis.service;

import com.lucas.caheRedis.model.Company;
import com.lucas.caheRedis.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Cacheable(cacheNames = "Company", key="#root.method.name")
    public List<Company> findAll() {
        return companyRepository.findAll();
    }
}
