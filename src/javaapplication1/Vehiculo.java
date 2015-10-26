/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
    private String marca;
    private String color;
    private String modelo;
    private String matricula;
    private double tarifa;
    private boolean disponible;
    
    public Vehiculo(String _matricula, String _marca, String _modelo, String _color, double _tarifa){
        this.matricula = _matricula;
        this.marca = _marca;
        this.modelo = _modelo;
        this.color = _color;
        this.tarifa = _tarifa;
        this.disponible = false;
    };

    public String getMarca() {
        return "La Marca es: " + marca;
    }

    public void setMarca(String marca) {
        this.marca = marca.toUpperCase();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    
}
