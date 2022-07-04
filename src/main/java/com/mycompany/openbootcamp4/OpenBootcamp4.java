/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.openbootcamp4;

/**
 *
 * @author chr_i
 */
class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
class Cliente extends Persona{
    private int Credito;

    public int getCredito() {
        return Credito;
    }

    public void setCredito(int Credito) {
        this.Credito = Credito;
    }
    
}
class Trabajador extends Persona{
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}
public class OpenBootcamp4 {

    public static void main(String[] args) {
        Cliente Banamex1 = new Cliente();
        Trabajador Cat1 = new Trabajador();
        
        Banamex1.setNombre("Christian Jimenez");
        Banamex1.setEdad(26);
        Banamex1.setTelefono("7221307240");
        Banamex1.setCredito(50000);
        System.out.println("Nombre del cliente: "+Banamex1.getNombre());
        System.out.println("Edad: "+Banamex1.getEdad());
        System.out.println("Telefono: "+Banamex1.getTelefono());
        System.out.println("Limite de Credito: "+Banamex1.getCredito());
        
        Cat1.setNombre("Christian Jimenez");
        Cat1.setEdad(26);
        Cat1.setTelefono("7221307240");
        Cat1.setSalario(80000);
        System.out.println("Nombredel trabajador: "+Cat1.getNombre());
        System.out.println("Edad: "+Cat1.getEdad());
        System.out.println("Telefono: "+Cat1.getTelefono());
        System.out.println("Salario mensual: "+Cat1.getSalario());
    }
}
