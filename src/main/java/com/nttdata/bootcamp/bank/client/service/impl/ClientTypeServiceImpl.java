package com.nttdata.bootcamp.bank.client.service.impl;

import com.nttdata.bootcamp.bank.client.model.dao.inte.ClientTypeDaoInte;
import com.nttdata.bootcamp.bank.client.model.document.ClientType;
import com.nttdata.bootcamp.bank.client.service.inte.ClientServiceInte;
import com.nttdata.bootcamp.bank.client.service.inte.ClientTypeServiceInte;
import com.nttdata.bootcamp.bank.client.model.dao.inte.ClientTypeDaoInte;
import com.nttdata.bootcamp.bank.client.model.document.Client;
import com.nttdata.bootcamp.bank.client.model.document.ClientType;
import com.nttdata.bootcamp.bank.client.service.inte.ClientServiceInte;
import com.nttdata.bootcamp.bank.client.service.inte.ClientTypeServiceInte;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientTypeServiceImpl implements ClientTypeServiceInte
{
    private static final Logger log = LoggerFactory.getLogger(ClientServiceInte.class);

    @Autowired
    private ClientTypeDaoInte clientTypeDaoInte;

    @Override
    public Mono<ClientType> create(final ClientType clientType) {

        return clientTypeDaoInte.save(clientType)
                .doFirst(() -> log.info("Begin create ClientType"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish create client"));
    }

    @Override
    public Flux<ClientType> readAll() {

        return clientTypeDaoInte.findAll()
                .doFirst(() -> log.info("Begin readAll ClientType"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish readAll ClientType"));
    }

    @Override
    public Mono<ClientType> readByCodeClientType(String codeClientType) {
        return clientTypeDaoInte.readByCodeClientType(codeClientType)
                .doFirst(() -> log.info("Begin findById ClientType"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish findById ClientType"));
    }

    @Override
    public Mono<ClientType> updateById(final String id, final ClientType clientType) {

        return clientTypeDaoInte.save(clientType)
                .doFirst(() -> log.info("Begin updateById ClientType"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish updateById ClientType"));
    }

    @Override
    public Mono<Void> deleteById(final String id) {

        return clientTypeDaoInte.deleteById(id)
                .doFirst(() -> log.info("Begin deleteById ClientType"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish deleteById ClientType"));
    }

}