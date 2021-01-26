/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springconannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author ups_c
 */
@Configuration //Nos sirve para prescindir del xml de configuracion
@ComponentScan("springconannotations") //Para escanear el o los paquetes 
public class Config {
    
    //Definir el bean para InformeFinancieroCompras
    @Bean
    public CreacionInformeFinanciero informeFinancieroDtoCompras(){//el nombre de metodo es tambien el id del bean a inyectar
        
        return new InformeFinancieroDtoCompras();
    }
    
    //Definir el bean para DirectorFinanciero e inyectar dependencias
    @Bean
    public Empleados directorFinanciero(){//el nombre de metodo es tambien el id del bean a inyectar
        return new DirectorFinanciero(informeFinancieroDtoCompras());
    }
}
