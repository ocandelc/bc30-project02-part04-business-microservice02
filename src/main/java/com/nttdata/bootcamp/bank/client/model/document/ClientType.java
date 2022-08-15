package com.nttdata.bootcamp.bank.client.model.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@Document(collection="product")
public class ClientType
{
    @Id
    private String id;
    private String name;
    private String description;
}
