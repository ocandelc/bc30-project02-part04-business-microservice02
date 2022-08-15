package com.nttdata.bootcamp.bank.client.model.dao.inte;

<<<<<<< HEAD
=======
import com.nttdata.bootcamp.bank.client.model.document.Client;
>>>>>>> 0ed9a1e8f9d229e395e5b83e11fe951b5497e80d
import com.nttdata.bootcamp.bank.client.model.document.ClientType;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface ClientTypeDaoInte extends ReactiveMongoRepository<ClientType, String> {
<<<<<<< HEAD
    Mono<ClientType> findById(String Id);
=======
    Mono<ClientType> readByCodeClientType(String codeClientType);
>>>>>>> 0ed9a1e8f9d229e395e5b83e11fe951b5497e80d
}
