/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springconannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author ups_c
 */
public class UsoAnnotations {
    
    public static void main(String[] args){
        
        //leer xml de configuracion
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Pedir un bean al contenedor
       //1. Si trabajamos con el patron de diseño por defecto(singleton) 
       //los objetos creados apuntarian a la misma direccion de memoria
       //2. Al cambiar el patron con la annotation scope en la clase ComercialExperimentado
       //los objetos creados apuntan a distintas direcciones de memoria(vease cuando usar cada patron de diseño)
       Empleados ups = contexto.getBean("ComercialExperimentado",Empleados.class);
       Empleados fer = contexto.getBean("ComercialExperimentado",Empleados.class);
        //Usar el bean
       System.out.println(ups);
       System.out.println(fer);
        //Cerrar el contexto
       contexto.close();
    }
    
}
