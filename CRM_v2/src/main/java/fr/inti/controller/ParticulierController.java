package fr.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.inti.model.Particulier;
import fr.inti.service.IParticulierService;
import fr.inti.service.ParticulierServiceImpl;




@Controller
@RequestMapping("/particulier")
public class ParticulierController {
	
	@Autowired
	IParticulierService pService= new ParticulierServiceImpl();
	
	@RequestMapping(method = RequestMethod.GET)
	public String initForm(ModelMap model){
		
		List<Particulier> particulierList = pService.getAllParticulier();
		model.addAttribute("listeParticulier", particulierList);
		return ("particuliers");
	}

}
