package com.springboot.jpa.app.model.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.springboot.jpa.app.model.entity.Client;

public interface IClientDAO extends PagingAndSortingRepository<Client, Long> {

}
