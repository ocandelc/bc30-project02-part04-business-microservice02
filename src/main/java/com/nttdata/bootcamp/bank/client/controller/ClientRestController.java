package com.nttdata.bootcamp.bank.client.controller;

import com.nttdata.bootcamp.bank.client.model.document.Client;
import com.nttdata.bootcamp.bank.client.service.inte.ClientServiceInte;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/clients")
public class ClientRestController
{

    private static final Logger log = LoggerFactory.getLogger(ClientRestController.class);

    @Autowired
    private ClientServiceInte clientServiceInte;

    @PostMapping("create")
    public Mono<Client> create(@RequestBody final Client client) {
        log.debug("Begin RestController create Product");
        return clientServiceInte.create(client);
    }

    @GetMapping
    public Flux<Client> readAll() {
        log.debug("Begin RestController readAll Product");
        return clientServiceInte.readAll();
    }

    @GetMapping("readByCodeClient/{codeClient}")
    public Mono<Client> readByCodeClient(@PathVariable String codeClient) {
        log.debug("Begin RestController readByCodeClient Product");
        return clientServiceInte.readByCodeClient(codeClient);
    }

    @PutMapping("updateById/{id}")
    public Mono<Client> updateById(@RequestBody final Client client, @PathVariable("id") final String id) {
        log.debug("Begin RestController updateById Product");
        return clientServiceInte.updateById(id, client);
    }

    @DeleteMapping("deleteById/{id}")
    public Mono<Void> deleteById(@PathVariable final String id) {
        log.debug("Begin RestController deleteById Product");
        return clientServiceInte.deleteById(id);
    }

}