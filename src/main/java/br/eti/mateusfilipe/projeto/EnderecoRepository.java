package br.eti.mateusfilipe.projeto;

public class EnderecoRepository {
    package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface EnderecoRepository extends CrudRepository<Endereco, String> {

    }
}
