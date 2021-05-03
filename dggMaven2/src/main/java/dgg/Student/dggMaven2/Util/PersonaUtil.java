package dgg.Student.dggMaven2.Util;

import org.springframework.http.server.DelegatingServerHttpResponse;
import org.springframework.stereotype.Component;

@Component
public class PersonaUtil {
    public String TratamientoNombre(String nombre) {
        String varsalida;
        if ( nombre.equals("Juan")) {
            varsalida = "Eres hombre";
        }
        else if(nombre.equalsIgnoreCase("Juana")) {
            varsalida = "Eres mujer";
        } else{
            varsalida = "Eres ni Juan ni Juana";
        }
    return varsalida;
    }
}
