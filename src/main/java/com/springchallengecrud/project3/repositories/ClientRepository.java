package com.springchallengecrud.project3.repositories;

import com.springchallengecrud.project3.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
