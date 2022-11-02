package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;



import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgramLanguage;


public interface ProgramingLanguageRepository {
	List<ProgramLanguage> getAll();
	void update(ProgramLanguage list, int id);
	void delete(int id);
	public ProgramLanguage getById(int id);
	void add(ProgramLanguage lists) throws Exception;
}
