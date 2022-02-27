package br.com.apenizollo.hrworker.resources;

import br.com.apenizollo.hrworker.entities.Worker;
import br.com.apenizollo.hrworker.repositories.WorkerRepostirory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

    @Autowired
    private WorkerRepostirory workerRepostirory;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> lsWorkers = workerRepostirory.findAll();
        return ResponseEntity.ok(lsWorkers);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id) {
        Worker worker = workerRepostirory.findById(id).get();
        return ResponseEntity.ok(worker);
    }
}
