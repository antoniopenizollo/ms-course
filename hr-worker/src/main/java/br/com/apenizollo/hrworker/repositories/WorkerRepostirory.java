package br.com.apenizollo.hrworker.repositories;

import br.com.apenizollo.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepostirory extends JpaRepository<Worker, Long> {
}
