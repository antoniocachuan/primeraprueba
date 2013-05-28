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
@Table(name="estado")
public class Estado  extends GenericModel{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public long est_iCodigo;
    
    @Required public String est_vcNombre;
    
    public Estado(String est_vcNombre){
        this.est_vcNombre=est_vcNombre;
    }
    
    @Override
    public String toString(){
        return est_vcNombre;
    }
    
    public static Estado obtener(String sNombre){
        return find("byEst_vcNombre",sNombre).first();
    }
}
