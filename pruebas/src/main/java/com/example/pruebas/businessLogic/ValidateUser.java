package com.example.pruebas.businessLogic;

import com.example.pruebas.model.ThirdPartyUser;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidateUser {

    private ThirdPartyUser thirdPartyUser;

    public ValidateUser( ThirdPartyUser thirdPartyUser){
        this.thirdPartyUser = thirdPartyUser;
    }

    public boolean isAdult(){
        return ageCalculation(thirdPartyUser.getBirtday())>= 18;
    }

    public boolean isAlive(){
        return thirdPartyUser.isAdmin();
    }

    private Long ageCalculation(LocalDate birthday){
        return LocalDate.from(birthday).until(LocalDate.now(), ChronoUnit.YEARS);
    }
}
