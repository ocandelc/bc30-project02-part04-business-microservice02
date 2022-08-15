package com.nttdata.bootcamp.bank.client.service.inte;

import com.nttdata.bootcamp.bank.client.model.document.ClientType;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientTypeServiceInte
{

    Mono<ClientType> create(final ClientType product);

    Flux<ClientType> readAll();

    Mono<ClientType> findById(String id);

    Mono<ClientType> updateById(final String id, final ClientType clientType);

    Mono<Void> deleteById(final String id);
}