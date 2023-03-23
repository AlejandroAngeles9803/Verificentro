package com.mycompany.verificentro;

import javax.swing.JOptionPane;


public class Gobierno extends Auto {
    
   
    
    
    public Gobierno() {
    }

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
    
    
   
    
    

    
    @Override
    public boolean validarEscape(boolean e) {
       
        this.escape=e;
        
        
        return e;
    }

    

    @Override
    public boolean validacionAceite(boolean e) {
        this.aceite = e;
        return e;
    }

    @Override
    public boolean filtrosAire(boolean e) {
       this.filtrosAire = e;
        return e;
    }

    @Override
    public boolean filtrosCarbon(boolean e) {
        this.filtrosCarbon = e;
        return e;
        
    }

    
    @Override
    public String validarHumo(String aux) {
        String respuesta = "";
        
        if(aux.equalsIgnoreCase("Transparente")){
            respuesta = "Estado normal del auto";
            JOptionPane.showMessageDialog(null, "Estado normal del auto");
            this.modelo = aux;
        }else if(aux.equalsIgnoreCase("Azul")){
            respuesta = "El motor esta quemando aceite";
            this.modelo = aux;
        }else if(aux.equalsIgnoreCase("Negro")){
            respuesta = "Mezcla de aire y Combustible no óptima";
            this.modelo = aux;
        }else if(aux.equalsIgnoreCase("Blanco")){
            respuesta = "Problema de Junta";
            this.modelo = aux;
        }
        
        return modelo;
    }

    @Override
    public String medicionHidrocarburos(String valor, String sustancia) {
           
           if(sustancia.equalsIgnoreCase("Hidrocarburos")){
               this.hidrocarburos = 80;
               double v = Double.parseDouble(valor);
               if(v >= this.hidrocarburos){
                   this.result = "NO ACEPTADO";
                   JOptionPane.showMessageDialog(null, result);
               }else{
                   this.result = "ACEPTADO";
                   JOptionPane.showMessageDialog(null, result);
               }
           }else if(sustancia.equalsIgnoreCase("Monoxido")){
               this.hidrocarburos = 0.4;
               double v = Double.parseDouble(valor);
               if(v >= this.hidrocarburos){
                   this.result = "NO ACEPTADO";
                   JOptionPane.showMessageDialog(null, result);
               }else{
                   this.result = "ACEPTADO";
                   JOptionPane.showMessageDialog(null, result);
               }
           }else if(sustancia.equalsIgnoreCase("Óxidos de Nitrógeno")){
               this.hidrocarburos = 250;
               double v = Double.parseDouble(valor);
               if(v >= this.hidrocarburos){
                   this.result = "NO ACEPTADO";
                   JOptionPane.showMessageDialog(null, result);
               }else{
                   this.result = "ACEPTADO";
                   JOptionPane.showMessageDialog(null, result);
               }
            }else if(sustancia.equalsIgnoreCase("Oxígeno")){
               this.hidrocarburos = 0.4;
               double v = Double.parseDouble(valor);
               if(v >= this.hidrocarburos){
                   this.result = "NO ACEPTADO";
                   JOptionPane.showMessageDialog(null, result);
               }else{
                   this.result = "ACEPTADO";
                   JOptionPane.showMessageDialog(null, result + "\n El precio a pagar es de: $");
               }
           }
        return result;
    }

    @Override
    public void determinacionModelo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int determinarHolo(String holo) {
        int holograma = Integer.parseInt(holo);
        
        if(holograma == 00){
            JOptionPane.showMessageDialog(null, "El precio a pagar es: \n $1,037.4 pesos.");
        }else if(holograma == 0){
            JOptionPane.showMessageDialog(null, "El precio a pagar es: \n $518.7 pesos.");
        }else if(holograma == 1){
            JOptionPane.showMessageDialog(null, "El precio a pagar es: \n $414.96 pesos.");
        }else if(holograma == 2){
            JOptionPane.showMessageDialog(null, "El precio a pagar es: \n $414.96 pesos.");
        }
        
        if(holo.equalsIgnoreCase("Rechazo Técnico")){
            JOptionPane.showMessageDialog(null, "El precio a pagar es: \n $414.96 pesos.");
        }
        return holograma;
    }

   
    
    
    

   
    
}
