package dgg.Student.dggMaven2.Services;

import dgg.Student.dggMaven2.Util.TrataNumeroUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrataNumeroServices{
   @Autowired
   TrataNumeroUtil trataNumeroUtil;
   public String FormateaNumeroUtil(String numero){

    return trataNumeroUtil.FormateaNumero(numero);

   }
}


