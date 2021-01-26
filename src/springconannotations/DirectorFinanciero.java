/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springconannotations;

import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author ups_c
 */
public class DirectorFinanciero implements Empleados {

    private CreacionInformeFinanciero informeFinanciero;
    
    @Value("${email}")
    private String email;
    
    @Value("${nombreEmpresa}")
    private String nombreEmpresa;

    public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
        this.informeFinanciero = informeFinanciero;
    }

    public String getEmail() {
        return email;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    
    @Override
    public String getTareas() {
        return "Gestion y direccion de las operaciones financieras de la empresa";
    }

    @Override
    public String getInforme() {
        return informeFinanciero.getInformeFinanciero();
    }
    
   
    
    
}
