package org.springframework.samples.petclinic.recoveryroom;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

@Component
public class RecoveryRoomTypeFormatter implements Formatter<RecoveryRoomType>{

	@Autowired
	RecoveryRoomService rrs;
	
    @Override
    public String print(RecoveryRoomType object, Locale locale) {
        return object.getName();
    }

    @Override
    public RecoveryRoomType parse(String text, Locale locale) throws ParseException {
        RecoveryRoomType rrt = this.rrs.getRecoveryRoomType(text); 
    	if(rrt == null) {
    		throw new ParseException(text, 0);
    	}else {
    		return rrt;
    	}
    	
    }
    
}
