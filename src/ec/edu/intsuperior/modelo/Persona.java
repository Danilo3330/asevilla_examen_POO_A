/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;


/**
 *
 * @author Usuario
 */
public class Persona {

    private String nombre;
    private String fechanacimiento;

    public Persona() {
    }

    public Persona(String nombre, String edad) {
        this.nombre = nombre;
        this.fechanacimiento = fechanacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return fechanacimiento;
    }

    public void setEdad(String edad) {
        this.fechanacimiento = fechanacimiento;
    }

    

}
