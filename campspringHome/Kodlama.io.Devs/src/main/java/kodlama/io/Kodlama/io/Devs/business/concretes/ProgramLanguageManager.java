package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgramingLanguagesService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgramingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgramLanguage;


@Service
public class ProgramLanguageManager implements ProgramingLanguagesService{
	private ProgramingLanguageRepository programingLanguageRepository;
	
	@Autowired
	public ProgramLanguageManager(ProgramingLanguageRepository progLanguageRepository) {
		this.programingLanguageRepository = progLanguageRepository;
	}
	
	
	@Override
	public List<ProgramLanguage> getAll() {
		return programingLanguageRepository.getAll();
	}

	@Override
	public ProgramLanguage getById(int id) {
		return programingLanguageRepository.getById(id);
	}

	@Override
	public void add(ProgramLanguage lists) throws Exception{
		programingLanguageRepository.add(lists);
		
	}

	@Override
	public void delete(int id) {
		programingLanguageRepository.delete(id);
		
	}

	@Override
	public void update(ProgramLanguage lists, int id) {
		programingLanguageRepository.update(lists, id);
		
	}


	
}
