package com.mustafa.job_orchestrator.jobs

import com.fasterxml.jackson.databind.JsonNode


data class CreateJobRequest(
    val type: String,
    val payload: JsonNode,
)
