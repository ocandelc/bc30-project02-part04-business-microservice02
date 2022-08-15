package com.nttdata.bootcamp.bank.client.service.inte;

import com.nttdata.bootcamp.bank.client.model.document.Client;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientServiceInte
{

    Mono<Client> create(final Client client);

    Flux<Client> readAll();

    Mono<Client> readByCodeClient(String codeClient);

    Mono<Client> updateById(final String id, final Client client);

    Mono<Void> deleteById(final String id);
}