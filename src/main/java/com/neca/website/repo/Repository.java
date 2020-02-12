package com.neca.website.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neca.website.model.Feedback;

public interface Repository extends JpaRepository<Feedback, String> {

}
