package ar.com.botanico.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.botanico.model.Report;
import ar.com.botanico.repository.ReportRepository;

@RestController
@RequestMapping("/reports")
public class ReportController {

	@Autowired
	ReportRepository reportRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Report> findAllReports(){
		return reportRepository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Report addReport(@RequestBody Report report){
		report.setId(null);
		
		return reportRepository.saveAndFlush(report);
	}
	
	@RequestMapping(value = "/{id}",  method = RequestMethod.PUT)
	public Report updateReport(@RequestBody Report report, @PathVariable Integer id){
		
		if (id != null && id!= 0){
			report.setId(id);
		}
		return reportRepository.saveAndFlush(report);			
	}
	
	@RequestMapping(value = "/{id}",  method = RequestMethod.DELETE)
	public void removeReport(@PathVariable Integer id){
		reportRepository.delete(id);
	}
}
