/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import play.data.validation.Required;
import play.db.jpa.GenericModel;

/**
 *
 * @author alumno
 */
@Entity
@Table(name="usuario")
public class Usuario extends GenericModel{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public long usu_iCodigo;
    
    @Required public String usu_vcUsuario;
    @Required public String usu_vcClave;
    @Required public String usu_vcRol;
    
    @Override
    public String toString(){
        return usu_vcUsuario+" - "+usu_vcRol;
    }
    
    
}
