package com.digital.devs;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.digital.devs.dao.IRecordatorioDAO;
import com.digital.devs.dao.UserRepository;
import com.digital.devs.model.Recordatorio;
import com.digital.devs.model.User;

@RestController
public class HelloController {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private IRecordatorioDAO iRecordatorioDAO;
	
	
    @RequestMapping("/")
    public String index() {
        return "Servicio Activo";
    }
	
	@GetMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String addNewUser (@RequestParam String nombre
			, @RequestParam String apellido) {
    	 SimpleDateFormat userId = new SimpleDateFormat("yyyyMMddHHmmssSSS");
	      Date currentDate = new Date();

	      // Create a new User class.
	      final User testUser = new User(userId.format(currentDate), nombre, apellido);

	      // For this example, remove all of the existing records.
	      userRepository.deleteAll();

	      // Save the User class to the Azure database.
	      userRepository.save(testUser);

	      // Retrieve the database record for the User class you just saved by ID.
	      // final User result = repository.findOne(testUser.getId());
	      final User result = userRepository.findById(testUser.getId()).get();
	      
	      
	      final Recordatorio testRecordatorio =
	    		  new Recordatorio("1", true, "Apronax Forte COSMO", "08:00am", "MedicaMento");
	      
	      iRecordatorioDAO.save(testRecordatorio);
	      
	      
	      
	      
	      
	      

	      // Display the results of the database record retrieval.
        return "Holas!"+result.toString();
    }
    
}
