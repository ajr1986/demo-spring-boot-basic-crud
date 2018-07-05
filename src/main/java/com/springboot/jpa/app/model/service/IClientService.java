package com.springboot.jpa.app.model.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.springboot.jpa.app.model.entity.Client;

public interface IClientService {

	public List<Client> getClientsList();

	public void saveClient(Client client);

	public Client getClient(Long id);

	public void deleteClient(Long id);
	
	public Page<Client> getClientsList(Pageable pageable);
}
