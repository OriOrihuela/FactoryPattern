package factory;

import org.lasencinas.domain.Lavadora;
import org.lasencinas.domain.LavadoraCargaFrontal;

public class LavadoraCargaFrontalFactory extends LavadoraFactory {

    /* ---- MAIN BEHAVIOURS ---- */
    @Override
    public Lavadora createLavadoraType() {
        return new LavadoraCargaFrontal();
    }
}
