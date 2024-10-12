package com.example.demo.repository;

import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.example.demo.model.Livre;

public interface LivreRepository extends CassandraRepository<Livre, UUID> {

}
