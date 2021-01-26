/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springconannotations;

/**
 *
 * @author ups_c
 */
public class DirectorFinanciero implements Empleados {

    private CreacionInformeFinanciero informeFinanciero;

    public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
        this.informeFinanciero = informeFinanciero;
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
