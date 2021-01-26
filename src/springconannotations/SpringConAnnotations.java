/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springconannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author ups_c
 */
public class SpringConAnnotations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        //leer xml de configuracion
        //ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Leer class de configuracion
        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Config.class);
        
        //Pedir un bean al contenedor
        Empleados ups = contexto.getBean("ComercialExperimentado",Empleados.class);
        //Usar el bean
        System.out.println(ups.getTareas());
        System.out.println(ups.getInforme());
        //Cerrar el contexto
       contexto.close();
    }
    
}
