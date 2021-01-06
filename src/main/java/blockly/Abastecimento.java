package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Abastecimento {

public static final int TIMEOUT = 300;

/**
 *
 * @param Entidade
 * @return Var
 */
// Abastecimento
public static Var custoKm(Var Entidade) throws Exception {
 return new Callable<Var>() {

   private Var custo = Var.VAR_NULL;

   public Var call() throws Exception {

    custo =
    Var.valueOf(0);

    if (
    /*# sourceMappingStart=|bm)f~*dkiPEJpIyP.B; */
    cronapi.logic.Operations.isNullOrEmpty(
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("km"))).negate().getObjectAsBoolean()) {

        if (
        Var.valueOf(!
        cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("km")).equals(
        Var.valueOf(0))).getObjectAsBoolean()) {

            custo =
            cronapi.math.Operations.divisor(
            cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("valor")),
            cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("km")));
        }
    }
    return custo;
   }
 }.call();
}

}

