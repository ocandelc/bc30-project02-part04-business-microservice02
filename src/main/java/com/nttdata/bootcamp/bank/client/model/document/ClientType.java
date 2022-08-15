package com.nttdata.bootcamp.bank.client.model.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@Document(collection="client_type")
public class ClientType
{
    @Id
    private String id;
    private String codeClientType;
    private String name;
    private String description;
    private String state;
}
