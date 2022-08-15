package com.nttdata.bootcamp.bank.client.controller;

<<<<<<< HEAD
import com.nttdata.bootcamp.bank.client.model.document.ClientType;
=======
import com.nttdata.bootcamp.bank.client.model.document.Client;
import com.nttdata.bootcamp.bank.client.model.document.ClientType;
import com.nttdata.bootcamp.bank.client.service.inte.ClientServiceInte;
>>>>>>> 0ed9a1e8f9d229e395e5b83e11fe951b5497e80d
import com.nttdata.bootcamp.bank.client.service.inte.ClientTypeServiceInte;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/clienttypes")
public class ClientTypeRestController
{

    private static final Logger log = LoggerFactory.getLogger(ClientTypeRestController.class);

    @Autowired
    private ClientTypeServiceInte clientTypeServiceInte;

    @PostMapping("create")
    public Mono<ClientType> create(@RequestBody final ClientType clientType) {
        log.debug("Begin RestController create ClientType");
        return clientTypeServiceInte.create(clientType);
    }

    @GetMapping
    public Flux<ClientType> readAll() {
        log.debug("Begin RestController readAll ClientType");
        return clientTypeServiceInte.readAll();
    }

    @GetMapping("readByCodeClientType/{codeClientType}")
    public Mono<ClientType> readByCodeClientType(@PathVariable String codeClientType) {
        log.debug("Begin RestController readByCodeClientType ClientType");
        return clientTypeServiceInte.readByCodeClientType(codeClientType);
    }

    @PutMapping("updateById/{id}")
    public Mono<ClientType> updateById(@RequestBody final ClientType clientType, @PathVariable("id") final String id) {
        log.debug("Begin RestController updateById ClientType");
        return clientTypeServiceInte.updateById(id, clientType);
    }

    @DeleteMapping("deleteById/{id}")
    public Mono<Void> deleteById(@PathVariable final String id) {
        log.debug("Begin RestController deleteById ClientType");
        return clientTypeServiceInte.deleteById(id);
    }

}