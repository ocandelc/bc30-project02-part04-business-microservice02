package com.nttdata.bootcamp.bank.product.controller;

import com.nttdata.bootcamp.bank.product.model.document.Client;
import com.nttdata.bootcamp.bank.product.service.impl.ClientServiceImpl;
import com.nttdata.bootcamp.bank.product.service.inte.ClientServiceInte;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/client")
public class ClientRestController
{

    private static final Logger log = LoggerFactory.getLogger(ClientRestController.class);

    @Autowired
    private ClientServiceImpl productServiceInte;

    @PostMapping("create")
    public Mono<Client> create(@RequestBody final Client client) {
        log.debug("Begin RestController create Product");
        return productServiceInte.create(client);
    }

    @GetMapping
    public Flux<Client> readAll() {
        log.debug("Begin RestController readAll Product");
        return productServiceInte.readAll();
    }

    @GetMapping("findByClientId/{id}")
    public Mono<Client> findByClientId(@PathVariable String codeProduct) {
        log.debug("Begin RestController findByCodeProduct Product");
        return productServiceInte.findById(codeProduct);
    }

    @PutMapping("updateById/{id}")
    public Mono<Client> updateById(@RequestBody final Client client, @PathVariable("id") final String id) {
        log.debug("Begin RestController updateById Product");
        return productServiceInte.updateById(id, client);
    }

    @DeleteMapping("deleteById/{id}")
    public Mono<Void> deleteById(@PathVariable final String id) {
        log.debug("Begin RestController deleteById Product");
        return productServiceInte.deleteById(id);
    }

}