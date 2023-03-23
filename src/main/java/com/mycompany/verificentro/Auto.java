package com.mycompany.verificentro;

public abstract class Auto {
    protected double hidrocarburos;
    protected String modelo;
    protected double ppm;
    protected boolean escape;
    protected boolean tapaGasolina;
    protected boolean filtrosAire;
    protected boolean filtrosCarbon;
    protected boolean validarHumo;
    protected boolean aceite;
    protected String result;
    protected int holograma;

    public double getHidrocarburos() {
        return hidrocarburos;
    }

    public void setHidrocarburos(double hidrocarburos) {
        this.hidrocarburos = hidrocarburos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPpm() {
        return ppm;
    }

    public void setPpm(double ppm) {
        this.ppm = ppm;
    }

    public boolean isEscape() {
        return escape;
    }

    public void setEscape(boolean escape) {
        this.escape = escape;
    }

    public boolean isTapaGasolina() {
        return tapaGasolina;
    }

    public void setTapaGasolina(boolean tapaGasolina) {
        this.tapaGasolina = tapaGasolina;
    }

    public boolean isFiltrosAire() {
        return filtrosAire;
    }

    public void setFiltrosAire(boolean filtrosAire) {
        this.filtrosAire = filtrosAire;
    }

    public boolean isFiltrosCarbon() {
        return filtrosCarbon;
    }

    public void setFiltrosCarbon(boolean filtrosCarbon) {
        this.filtrosCarbon = filtrosCarbon;
    }

    public boolean isValidarHumo() {
        return validarHumo;
    }

    public void setValidarHumo(boolean validarHumo) {
        this.validarHumo = validarHumo;
    }

    public boolean isAceite() {
        return aceite;
    }

    public void setAceite(boolean aceite) {
        this.aceite = aceite;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getHolograma() {
        return holograma;
    }

    public void setHolograma(int holograma) {
        this.holograma = holograma;
    }
    
    
    

    
    
    
    public abstract String medicionHidrocarburos(String valor, String sustancia);
    public abstract void determinacionModelo();
    public abstract boolean validarEscape(boolean e);
    public abstract boolean  validacionAceite(boolean e);
    public abstract boolean filtrosAire(boolean e);
    public abstract boolean filtrosCarbon(boolean e);
    public abstract String validarHumo(String aux);
    public abstract int determinarHolo(String holo);

    
    
    
    
}
