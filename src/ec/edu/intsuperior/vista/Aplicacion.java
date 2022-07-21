
package ec.edu.intsuperior.vista;
import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Persona;
public class Aplicacion {

    public static void main(String[] args) {

        Persona p1 = new Persona();
        Persona p2 = new Persona("ANTHONY SEVILLA","18");
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente("0978677452");

        System.out.println("EL CLIENTE: " + p2.getNombre());
        System.out.println("TIENE: " + p2.getEdad() + "AÑOS");
        System.out.println("Y SU TELÉFONO: " + c2.getTelefono());
    }

}

