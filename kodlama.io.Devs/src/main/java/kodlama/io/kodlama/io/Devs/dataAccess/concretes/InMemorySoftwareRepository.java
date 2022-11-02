package kodlama.io.kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.SoftwareRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.Software;

@Repository
public class InMemorySoftwareRepository implements SoftwareRepository{

	List<Software> softwares;
	
	public InMemorySoftwareRepository() {
		softwares = new ArrayList<Software>();
		softwares.add(new Software(1,"C#"));
		softwares.add(new Software(2,"Java"));
		softwares.add(new Software(3,"Python"));
	}

	@Override
	public List<Software> getAll() {
		
		return null;
	}

}
