package com.nttdata.bootcamp.bank.client.service.impl;

import com.nttdata.bootcamp.bank.client.model.dao.inte.ClientDaoInte;
import com.nttdata.bootcamp.bank.client.model.dao.inte.ClientDaoInte;
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
                .doFirst(() -> log.info("Begin create client"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish create client"));
    }

    @Override
    public Flux<Client> readAll() {

        return clientDaoInte.findAll()
                .doFirst(() -> log.info("Begin readAll client"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish readAll client"));
    }

    @Override
    public Mono<Client> findById(String id) {
        return clientDaoInte.findById(id)
                .doFirst(() -> log.info("Begin findById client"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish findById client"));
    }

    @Override
    public Mono<Client> updateById(final String id, final Client client) {

        return clientDaoInte.save(client)
                .doFirst(() -> log.info("Begin updateById Product"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish updateById Product"));
    }

    @Override
    public Mono<Void> deleteById(final String id) {

        return clientDaoInte.deleteById(id)
                .doFirst(() -> log.info("Begin deleteById Product"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish deleteById Product"));
    }

}