/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springconannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author ups_c
 */
@Component("ComercialExperimentado")
@Scope("prototype")// Annotation para cambiar el patron de diseño predeterminado sin usar el xml
public class ComercialExperimentado implements Empleados {
 
   

    //1. La anotacion autowired puede ser omitida apartir 
    //de spring 4.3 si el bean solo tiene un constructor.
    //2. Inyeccion de dependencias a travez de un constructor
//    @Autowired
//    public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
//        this.nuevoInforme = nuevoInforme;
//    }

    //la anotacion autowired puede ser usada para inyeccion tanto en el 
    //contructor como en el metodo setter u otros metodos
//    @Autowired
//    public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
//        this.nuevoInforme = nuevoInforme;
//    }
    
    @Override
    public String getTareas() {
        return "Captar, Convencer y Vender";
    }

    @Override
    public String getInforme() {
//       return "Informe generado por el comercial";
        return nuevoInforme.getInformeFinanciero();
    }
    
    //1. La anotacion Autowired tambien puede ser usada directamente en campos de clase 
    //2. La notacion Qualifier se usa para especificar la clase en caso de que haya
    //varias que implementen la misma interfaz
    @Autowired
    @Qualifier("informeFinancieroTrim4")
    private CreacionInformeFinanciero nuevoInforme;
    
    
    
}
