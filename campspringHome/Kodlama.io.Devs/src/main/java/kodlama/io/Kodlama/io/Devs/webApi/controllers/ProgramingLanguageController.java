package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgramingLanguagesService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgramLanguage;


@RestController  
@RequestMapping("/api/programlanguages")
public class ProgramingLanguageController {
	private ProgramingLanguagesService programingLanguagesService;
	
	@Autowired
	public ProgramingLanguageController(ProgramingLanguagesService programingLanguagesService) {
		this.programingLanguagesService = programingLanguagesService;
	}


	@GetMapping("/getAll")
	public List<ProgramLanguage> getAll(){
		return programingLanguagesService.getAll();
	}
	@GetMapping("/{id}")
	public ProgramLanguage getById(@PathVariable()int id) {
		return programingLanguagesService.getById(id);
	}
	@PostMapping
	public void add(@RequestBody ProgramLanguage lists) throws Exception{
		programingLanguagesService.add(lists);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		programingLanguagesService.delete(id);
	}
	@PutMapping("/{id}")
	public void update(@RequestBody ProgramLanguage lists, @PathVariable int id) {
		programingLanguagesService.update(lists, id);
	}
}
