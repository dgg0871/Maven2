package dgg.Student.dggMaven2.Util;

import org.springframework.stereotype.Component;

@Component
public class TrataNumeroUtil {
    public String FormateaNumero(String numero){
/*        String numeroOut, numeroIn;
        numeroIn = numero;
        numeroIn = numeroIn.replace(".", "&");
        numeroIn = numeroIn.replaceAll(",", ".");
        numeroIn = numeroIn.replaceAll("&", ",");
        numeroOut = numeroIn;*/

        return numero.replace(".",",").replace(",",".");
    }
}
