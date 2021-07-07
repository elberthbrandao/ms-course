package com.elberthbrandao.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elberthbrandao.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
