package dgg.Student.dggMaven2.Services;

import dgg.Student.dggMaven2.Util.PersonaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServices {
    @Autowired
    PersonaUtil personaUtil;
    public String obtenerDatoPersonaUtil(String nombre){

     return personaUtil.TratamientoNombre(nombre);

    }

}
