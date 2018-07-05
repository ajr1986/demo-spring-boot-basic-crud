package com.springboot.jpa.app.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.jpa.app.model.dao.IClientDAO;
import com.springboot.jpa.app.model.entity.Client;

@Service
public class ClientServiceImpl implements IClientService {

	@Autowired
	private IClientDAO clientDAO;

	@Override
	@Transactional(readOnly = true)
	public List<Client> getClientsList() {

		return (List<Client>) clientDAO.findAll();
	}

	@Override
	@Transactional
	public void saveClient(Client client) {

		clientDAO.save(client);
	}

	@Override
	@Transactional(readOnly = true)
	public Client getClient(Long id) {

		Optional<Client> result = clientDAO.findById(id);

		Client client = null;
		if (result.isPresent()) {
			client = result.get();
		}

		return client;
	}

	@Override
	@Transactional
	public void deleteClient(Long id) {

		clientDAO.deleteById(id);
	}

	@Override
	public Page<Client> getClientsList(Pageable pageable) {

		return clientDAO.findAll(pageable);
	}

}
