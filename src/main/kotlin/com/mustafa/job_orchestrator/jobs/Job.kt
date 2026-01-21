package com.mustafa.job_orchestrator.jobs

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.Instant

@Entity
@Table(name = "jobs")
class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column(nullable = false, length = 100)
    var type: String = ""

    @Column(nullable = false, length = 100)
    @Enumerated(value = EnumType.STRING)
    var status: JobStatus = JobStatus.PENDING

    @Column(nullable = false)
    var attempts: Int = 0

    @Column(nullable = false, columnDefinition = "jsonb")
    var payload: String = "{}"

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    var createdAt: Instant? = null

    @UpdateTimestamp
    @Column(name = "updated_at")
    var updatedAt: Instant? = null
}