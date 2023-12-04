package com.example.demo.controller;

import com.example.demo.entity.Client;
import com.example.demo.entity.Product;
import com.example.demo.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<Client> getAllClients()
    {
        return clientService.getAllClient();
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id)
    {
        return clientService.getClientById(id).orElse(null);
    }

    @PostMapping
    public Client createClient(@RequestBody Client client)
    {
        return clientService.saveClient(client);
    }

    @PutMapping("/{id}")
    public Client updateClient(@PathVariable Long id, @RequestBody Client client)
    {
        client.setClientId(id);
        return clientService.saveClient(client);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id)
    {
        clientService.deleteClient(id);
    }



}
