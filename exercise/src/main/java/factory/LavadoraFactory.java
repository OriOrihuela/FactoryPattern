package factory;

import org.lasencinas.domain.Lavadora;

public abstract class LavadoraFactory {


    /* ---- MAIN BEHAVIOURS ---- */
    public Lavadora createLavadora() {
        Lavadora lavadora = createLavadoraType();
        lavadora.ponerMandos();
        lavadora.ponerTambor();
        return lavadora;
    }

    protected abstract Lavadora createLavadoraType();
}
