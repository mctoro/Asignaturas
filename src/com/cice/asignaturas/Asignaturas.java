/*
Escribir un programa que represente las asignaturas de una carrera. Una asignatura tiene un
nombre, un código numérico y el curso en el que se imparte. Los valores iniciales se muestran
mediante un constructor.
El programa debe imprimir los datos de la asignatura
 */
package com.cice.asignaturas;

/**
 *
 * @author cice
 */
public class Asignaturas {
    
    String asignatura;
    int codigo;
    String curso;
    
    public Asignaturas() {
asignatura = "Matematicas";
codigo = 22346;
curso = "Segundo";

}

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void pintarinfo (){
        
        System.out.println("La asignatura es: " + asignatura);
        System.out.println("El codigo de esa asignatura es: " + codigo);
        System.out.println("El curso en el que se imparte esa asignatura es en: " + curso);
    
    }
    
    
    
}
