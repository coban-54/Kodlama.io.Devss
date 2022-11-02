package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgramingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgramLanguage;


@Repository
public class InMemoyProgramingLanguageRepository implements ProgramingLanguageRepository{

	List<ProgramLanguage> list;

	@Autowired
	public InMemoyProgramingLanguageRepository() {
		list = new ArrayList<ProgramLanguage>();
		list.add(new ProgramLanguage(1, "C#"));
		list.add(new ProgramLanguage(2, "java"));
		list.add(new ProgramLanguage(3, "Python"));
	}

	@Override
	public List<ProgramLanguage> getAll() {
		for (ProgramLanguage programLanguage : list) {
			programLanguage.getName();
		}
		
		return list;
	}

	@Override
	public void add(ProgramLanguage lists)throws Exception {
		if (!hasName(lists));
		
	}

	@Override
	public void update(ProgramLanguage lists, int id) {
		for (ProgramLanguage programLanguage : list) {
			if (programLanguage.getId()==id) {
				programLanguage.setName(lists.getName());
			}
		}
		
	}

	@Override
	public void delete(int id) {
		list.removeIf(lists->lists.getId() == id);
		
	}

	@Override
	public ProgramLanguage getById(int id) {
		for (ProgramLanguage programLanguage : list) {
			if (programLanguage.getId() == id) {
				return programLanguage;
			}
		}
		return null;
	}
	public boolean hasName(ProgramLanguage lists) throws Exception{
		boolean isThere = false;
		for (ProgramLanguage programLanguage : list) {
			if (lists.getName().equalsIgnoreCase(programLanguage.getName())) {
				isThere = true;
				break;
			}
		}
		if (lists.getName().isEmpty() || lists.getName().isBlank()){
			throw new Exception("Proglamlama ismi boş");
		}else if (!isThere && !(lists.getName().isEmpty() || lists.getName().isBlank())) {
			list.add(lists);
		}else {
			throw new Exception("Programlama dili tekrar edemez");
		}
		return isThere;
	}

}
