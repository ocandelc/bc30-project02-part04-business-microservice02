package com.nttdata.bootcamp.bank.client.service.inte;

<<<<<<< HEAD
=======
import com.nttdata.bootcamp.bank.client.model.document.Client;
>>>>>>> 0ed9a1e8f9d229e395e5b83e11fe951b5497e80d
import com.nttdata.bootcamp.bank.client.model.document.ClientType;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientTypeServiceInte
{

    Mono<ClientType> create(final ClientType clientType);

    Flux<ClientType> readAll();

    Mono<ClientType> readByCodeClientType(String codeClientType);

    Mono<ClientType> updateById(final String id, final ClientType clientType);

    Mono<Void> deleteById(final String id);
}