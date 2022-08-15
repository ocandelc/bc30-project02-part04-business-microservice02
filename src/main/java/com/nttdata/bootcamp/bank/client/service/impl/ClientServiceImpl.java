package com.nttdata.bootcamp.bank.client.service.impl;

import com.nttdata.bootcamp.bank.client.model.dao.inte.ClientDaoInte;
<<<<<<< HEAD
import com.nttdata.bootcamp.bank.client.model.dao.inte.ClientDaoInte;
=======
>>>>>>> 0ed9a1e8f9d229e395e5b83e11fe951b5497e80d
import com.nttdata.bootcamp.bank.client.model.document.Client;
import com.nttdata.bootcamp.bank.client.service.inte.ClientServiceInte;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientServiceImpl implements ClientServiceInte
{

    private static final Logger log = LoggerFactory.getLogger(ClientServiceImpl.class);

    @Autowired
    private ClientDaoInte clientDaoInte;

    @Override
    public Mono<Client> create(final Client client) {

        return clientDaoInte.save(client)
                .doFirst(() -> log.info("Begin create Client"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish create Client"));
    }

    @Override
    public Flux<Client> readAll() {

        return clientDaoInte.findAll()
                .doFirst(() -> log.info("Begin readAll Client"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish readAll Client"));
    }

    @Override
    public Mono<Client> readByCodeClient(String codeClient) {
        return clientDaoInte.readByCodeClient(codeClient)
                .doFirst(() -> log.info("Begin findById Client"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish findById Client"));
    }

    @Override
    public Mono<Client> updateById(final String id, final Client client) {

        return clientDaoInte.save(client)
                .doFirst(() -> log.info("Begin updateById Client"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish updateById Client"));
    }

    @Override
    public Mono<Void> deleteById(final String id) {

        return clientDaoInte.deleteById(id)
                .doFirst(() -> log.info("Begin deleteById Client"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish deleteById Client"));
    }

}