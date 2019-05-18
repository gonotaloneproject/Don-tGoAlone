package com.example.goNotAlone.service;

import com.example.goNotAlone.repository.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRolesServiceImpl implements GenericService {
    @Autowired
    private GenericRepository genericRepository;


    @Override
    public Object addG(Object o) {
        return this.genericRepository.save(o);
    }

    @Override
    public Object getById(Long id) {
        return this.genericRepository.findById(id).get();
    }

    @Override
    public List getAll() {
        return this.genericRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        this.genericRepository.deleteById(id);

    }

    @Override
    public void deleteAll() {
        this.genericRepository.deleteAll();

    }
}
