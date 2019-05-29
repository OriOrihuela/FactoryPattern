package org.lasencinas.domain;

public abstract class Lavadora {

    /* ---- PROPERTIES OF THE CLASS ---- */
    protected boolean tieneTambor = false;
    protected boolean tieneMandos = false;
    protected String tipoCarga = null;


    /* ---- MAIN BEHAVIOURS ---- */
    public void ponerTambor() {
        tieneTambor = true;
    }

    public void ponerMandos() {
        tieneMandos = true;
    }
}
