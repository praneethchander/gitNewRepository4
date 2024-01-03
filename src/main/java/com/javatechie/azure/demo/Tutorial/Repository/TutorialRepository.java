package com.javatechie.azure.demo.Tutorial.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.azure.demo.Tutorial.Entity.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
	List<Tutorial> findByPublished(boolean published);

	List<Tutorial> findByTitleContaining(String title);
}
