## Job Orchestrator

### Jobs

#### POST /jobs

**Description:** Create a new job in the orchestrator and return its id and initial status

**Request fields:** type, payload

**Response fields:** id, status

**Success status code:** 201 (Created)

**Failure status code:** 400 (Bad request) - for invalid types, missing fields etc