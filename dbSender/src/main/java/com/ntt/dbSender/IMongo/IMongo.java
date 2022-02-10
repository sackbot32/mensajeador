package com.ntt.dbSender.IMongo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.ntt.dbSender.model.Mensaje;

@Repository
public interface IMongo extends ReactiveMongoRepository<Mensaje, String> {

}
