package ar.com.botanico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.botanico.model.Report;

public interface ReportRepository extends JpaRepository<Report, Integer>{

}
