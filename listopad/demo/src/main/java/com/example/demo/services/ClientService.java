package com.example.demo.services;

import com.example.demo.entity.Client;
import com.example.demo.repo.ClientRepo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Service
public class ClientService {


    @Autowired
    private ClientRepo clientRepo;

    public List<Client> getAllClient()
    {
        return clientRepo.findAll();
    }
    public Optional<Client> getClientById(Long id)
    {
        return clientRepo.findById(id);
    }

    public Client saveClient (Client client)
    {
        return clientRepo.save(client);
    }

    public void deleteClient(Long id)
    {
        clientRepo.deleteById(id);
    }
}
