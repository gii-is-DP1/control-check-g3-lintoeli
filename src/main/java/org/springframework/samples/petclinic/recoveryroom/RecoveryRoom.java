package org.springframework.samples.petclinic.recoveryroom;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.samples.petclinic.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class RecoveryRoom extends BaseEntity{

    @NotNull
    @Size(min = 3, max = 50)
    String name;
    
    @NotNull
    @Min(0)
    double size;
    
    @NotNull
    boolean secure;
   /* 
    @ManyToOne
    @NotNull
    RecoveryRoomType roomType;*/
    

}
