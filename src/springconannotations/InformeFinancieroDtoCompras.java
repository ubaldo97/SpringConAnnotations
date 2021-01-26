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
public class InformeFinancieroDtoCompras implements CreacionInformeFinanciero {

    @Override
    public String getInformeFinanciero() {
        return "Informe financiero del departamento de compras 2021";
    }
    
}
