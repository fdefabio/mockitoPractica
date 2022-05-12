package com.example.pruebas;

import com.example.pruebas.Services.ThirdPartyService;
import com.example.pruebas.controllers.UserController;
import com.example.pruebas.model.ThirdPartyUser;
import com.example.pruebas.repositories.UserRepository;
import net.bytebuddy.build.ToStringPlugin;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;
import java.time.Month;

@RunWith(MockitoJUnitRunner.class)
public class BusinessUnitTest {

    @Mock
    private ThirdPartyService thirdPartyService;

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserController userController;

    @BeforeEach
    public void setuo(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void givenUserIsAdultBeRegistered(){
        Long id = 2351L;
        String name = "juanjo";
        String lastName = "perez";

        ThirdPartyUser mockedUser = ThirdPartyUser
                .builder()
                .id(id)
                .firstName(name)
                .LastName(lastName)
                .maritalStatus("single")
                .isAdmin(true)
                .birtday(LocalDate.of(1990, Month.APRIL,5))
                .build();

        Mockito.when(thirdPartyService.getThirdPartyUser(id))
                .thenReturn(mockedUser);
    }



}
