package com.mustafa.job_orchestrator.jobs

data class CreateJobResponse(
    val id: Long,
    val status: JobStatus,
)
