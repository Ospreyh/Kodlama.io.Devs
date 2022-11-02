package kodlama.io.kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.kodlama.io.Devs.business.abstracts.SoftwareService;
import kodlama.io.kodlama.io.Devs.entities.concretes.Software;

@RestController
@RequestMapping("/api/softwares")
public class SoftwaresController {
	private SoftwareService softwareService;

	@Autowired
	public SoftwaresController(SoftwareService softwareService) {
		
		this.softwareService = softwareService;
	}
	
	@GetMapping("/getall")
	public List<Software> getAll(){
		return softwareService.getAll();
	}
}
