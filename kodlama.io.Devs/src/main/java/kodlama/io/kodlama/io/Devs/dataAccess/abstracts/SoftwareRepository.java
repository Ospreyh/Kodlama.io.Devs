package kodlama.io.kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.kodlama.io.Devs.entities.concretes.Software;


public interface SoftwareRepository {
	 List<Software> getAll();

}
