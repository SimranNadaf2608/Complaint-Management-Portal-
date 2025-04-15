package com.college.complaintportal;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplaintRepository extends JpaRepository<Complaint, Long> {
    // You can add custom queries here later if needed
}

