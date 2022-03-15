package cat.itacademy.barcelonactiva.sedo.bulpe.jordi.s04.t01.n02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/HelloWorld")
	public String saluda(
			@RequestParam(name="name", required=false, defaultValue="UNKNOWN")
			String nom
			) {	
		return "Hola, " + nom + ". Est�s executant un projecte Gradle.";
	}
		
	@GetMapping(value = {"/HelloWorld2", "/HelloWorld2/{nom}"})
	public String saluda2(
			@PathVariable(required = false) 
			String nom
			) {
		
		nom = (nom != null)?nom:"UNKNOWN";
		return "Hola, " + nom + ". Est�s executant un projecte Gradle.";    
	}
}