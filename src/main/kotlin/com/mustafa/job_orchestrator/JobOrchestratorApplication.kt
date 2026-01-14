package com.mustafa.job_orchestrator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JobOrchestratorApplication

fun main(args: Array<String>) {
	runApplication<JobOrchestratorApplication>(*args)
}
