package com.nttdata.bootcamp.bank.product.service.inte;

import com.nttdata.bootcamp.bank.product.model.document.Client;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientServiceInte
{

    Mono<Client> create(final Client client);

    Flux<Client> readAll();

    Mono<Client> findById(String id);

    Mono<Client> updateById(final String id, final Client product);

    Mono<Void> deleteById(final String id);
}