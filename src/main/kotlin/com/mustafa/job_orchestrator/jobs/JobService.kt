package com.mustafa.job_orchestrator.jobs

import org.springframework.stereotype.Service
import com.fasterxml.jackson.databind.ObjectMapper



@Service
class JobService(
    private val jobRepository: JobRepository,
    private val objectMapper: ObjectMapper
) {

    fun createJob(request: CreateJobRequest): CreateJobResponse {

        val job = Job().apply {
            type = request.type
            payload = objectMapper.writeValueAsString(request.payload)
        }

        val savedJob = jobRepository.save(job)
        return CreateJobResponse(savedJob.id, savedJob.status)
    }


}