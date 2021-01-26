/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springconannotations;

import org.springframework.stereotype.Component;

/**
 *
 * @author ups_c
 */
@Component
public class InformeFinancieroTrim1 implements CreacionInformeFinanciero{

    @Override
    public String getInformeFinanciero() {
        return "Presentacion de informe financiero del trimestre 1";
    }
    
}
