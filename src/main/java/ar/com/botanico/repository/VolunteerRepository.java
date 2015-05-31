package ar.com.botanico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.botanico.model.Volunteer;

public interface VolunteerRepository extends JpaRepository<Volunteer, Integer>{

}
