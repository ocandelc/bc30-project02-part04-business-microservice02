package com.nttdata.bootcamp.bank.product.service.impl;

import com.nttdata.bootcamp.bank.product.model.dao.inte.ClientTypeDaoInte;
import com.nttdata.bootcamp.bank.product.model.document.Client;
import com.nttdata.bootcamp.bank.product.model.document.ClientType;
import com.nttdata.bootcamp.bank.product.service.inte.ClientServiceInte;
import com.nttdata.bootcamp.bank.product.service.inte.ClientTypeServiceInte;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientTypeServiceImpl implements ClientTypeServiceInte
{
    private static final Logger log = LoggerFactory.getLogger(ClientTypeServiceImpl.class);

    @Autowired
    private ClientTypeDaoInte clientTypeDaoInte;

    @Override
    public Mono<ClientType> create(final ClientType clientType) {

        return clientTypeDaoInte.save(clientType)
                .doFirst(() -> log.info("Begin create client"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish create client"));
    }

    @Override
    public Flux<ClientType> readAll() {

        return clientTypeDaoInte.findAll()
                .doFirst(() -> log.info("Begin readAll client"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish readAll client"));
    }

    @Override
    public Mono<ClientType> findById(String id) {
        return clientTypeDaoInte.findById(id)
                .doFirst(() -> log.info("Begin findById client"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish findById client"));
    }

    @Override
    public Mono<ClientType> updateById(final String id, final ClientType clientType) {

        return clientTypeDaoInte.save(clientType)
                .doFirst(() -> log.info("Begin updateById Product"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish updateById Product"));
    }

    @Override
    public Mono<Void> deleteById(final String id) {

        return clientTypeDaoInte.deleteById(id)
                .doFirst(() -> log.info("Begin deleteById Product"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish deleteById Product"));
    }

}