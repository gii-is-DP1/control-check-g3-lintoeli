package org.springframework.samples.petclinic.recoveryroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/recoveryroom")
public class RecoveryRoomController {
    @Autowired
    private RecoveryRoomService rrs;
    
    private static final String VIEWS_RECOVERYROOM_CREATE_OR_UPDATE_FORM = "/recoveryroom/createOrUpdateRecoveryRoomForm.jsp";

    @GetMapping(path = "/create")
    public String initCreationForm(ModelMap modelMap) {
    	String view = VIEWS_RECOVERYROOM_CREATE_OR_UPDATE_FORM;
    	modelMap.addAttribute("recoveryroom", new RecoveryRoom());
    	//modelMap.addAttribute("recoveryroom", new RecoveryRoom());
    	return view;
    }
}
