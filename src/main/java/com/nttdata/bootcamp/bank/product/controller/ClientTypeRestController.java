package com.nttdata.bootcamp.bank.product.controller;

import com.nttdata.bootcamp.bank.product.model.document.Client;
import com.nttdata.bootcamp.bank.product.model.document.ClientType;
import com.nttdata.bootcamp.bank.product.service.impl.ClientTypeServiceImpl;
import com.nttdata.bootcamp.bank.product.service.inte.ClientServiceInte;
import com.nttdata.bootcamp.bank.product.service.inte.ClientTypeServiceInte;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/clienttype")
public class ClientTypeRestController
{

    private static final Logger log = LoggerFactory.getLogger(ClientTypeRestController.class);

    @Autowired
    private ClientTypeServiceImpl productServiceInte;

    @PostMapping("create")
    public Mono<ClientType> create(@RequestBody final ClientType clientType) {
        log.debug("Begin RestController create Product");
        return productServiceInte.create(clientType);
    }

    @GetMapping
    public Flux<ClientType> readAll() {
        log.debug("Begin RestController readAll Product");
        return productServiceInte.readAll();
    }

    @GetMapping("findByClientId/{id}")
    public Mono<ClientType> findByClientId(@PathVariable String id) {
        log.debug("Begin RestController findByCodeProduct Product");
        return productServiceInte.findById(id);
    }

    @PutMapping("updateById/{id}")
    public Mono<ClientType> updateById(@RequestBody final ClientType clientType, @PathVariable("id") final String id) {
        log.debug("Begin RestController updateById Product");
        return productServiceInte.updateById(id, clientType);
    }

    @DeleteMapping("deleteById/{id}")
    public Mono<Void> deleteById(@PathVariable final String id) {
        log.debug("Begin RestController deleteById Product");
        return productServiceInte.deleteById(id);
    }

}