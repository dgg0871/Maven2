package dgg.Student.dggMaven2.Controler;

import dgg.Student.dggMaven2.Services.PersonaServices;
import dgg.Student.dggMaven2.Services.TrataNumeroServices;
import dgg.Student.dggMaven2.Util.TrataNumeroUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DggControler {

    @Autowired
    PersonaServices personaServices;

    @Autowired
    TrataNumeroServices trataNumeroServices;

    @RequestMapping("/")
    public String Hola(){
        return "Hola, como va";
    }
    @RequestMapping("/Bay")
    public String Bay(){
       return "Adios...";
        }

    @RequestMapping("/Nombre/{nombre}")
    public String Nombre(@PathVariable(value="nombre") String nombre){
        return personaServices.obtenerDatoPersonaUtil(nombre);

    }

    @RequestMapping("/numero/{numero}")
    public String Numero(@PathVariable(value="numero") String numero){
        return trataNumeroServices.FormateaNumeroUtil(numero);
    }

}
