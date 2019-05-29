package factory;

import org.lasencinas.domain.Lavadora;
import org.lasencinas.domain.LavadoraCargaSuperior;

public class LavadoraCargaSuperiorFactory extends LavadoraFactory {

    /* ---- MAIN BEHAVIOURS ---- */
    @Override
    public Lavadora createLavadoraType() {
        return new LavadoraCargaSuperior();
    }
}
