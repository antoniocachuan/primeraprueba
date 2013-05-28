/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import play.data.validation.Required;
import play.db.jpa.GenericModel;

/**
 *
 * @author alumno
 */
@Entity
@Table(name="docente")
public class Docente extends GenericModel{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public long doc_iCodigo;
   
    @Required public String doc_vcDni;
    @Required public String doc_vcPaterno;
    @Required public String doc_vcMaterno;
    @Required public String doc_vcNombre;
    @Required public String doc_vcEmail;
    @Required public String doc_vcClave;    
    
    
    @Required 
    @ManyToOne 
    @JoinColumn(name="est_iCodigo")
    public Estado estado;
    
    public Docente(
            String doc_vcDni,
            String doc_vcPaterno,
            String doc_vcMaterno,
            String doc_vcNombre,
            String doc_vcEmail,
            String doc_vcClave    
            ){
        this.doc_vcClave=doc_vcClave;
        this.doc_vcDni=doc_vcDni;
        this.doc_vcEmail=doc_vcEmail;
        this.doc_vcMaterno=doc_vcMaterno;
        this.doc_vcNombre=doc_vcNombre;
        this.doc_vcPaterno=doc_vcPaterno;
    }
        
    public String toString(){
        return doc_vcPaterno+" / "+doc_vcMaterno+" / "+doc_vcNombre;
    }
    
    public static Docente obtener(long iCodigo){
        return find("byDoc_iCodigo",iCodigo).first();
    }
    
    public static Docente obtenerDNI(String sDni){
        return find("byDoc_vcDni",sDni).first();
    }
}
