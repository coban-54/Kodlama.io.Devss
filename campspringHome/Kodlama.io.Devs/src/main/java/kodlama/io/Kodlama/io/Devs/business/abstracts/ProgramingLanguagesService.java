package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;



import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgramLanguage;


public interface ProgramingLanguagesService {
	List<ProgramLanguage> getAll();	
	public ProgramLanguage getById(int id);
	public void add(ProgramLanguage lists)throws Exception;
	void delete(int id);
	public void update(ProgramLanguage lists, int id);
	

}
