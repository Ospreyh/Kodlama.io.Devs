package kodlama.io.kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.kodlama.io.Devs.business.abstracts.SoftwareService;
import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.SoftwareRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.Software;

@Service
public class SoftwareManager implements SoftwareService{
	private SoftwareRepository softwareRepository;
	
	
	@Autowired
	public SoftwareManager(SoftwareRepository softwareRepository) {
		
		this.softwareRepository = softwareRepository;
	}



	@Override
	public List<Software> getAll() {
		
		return softwareRepository.getAll();
	}

}
