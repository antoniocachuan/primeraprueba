
import models.Estado;
import org.junit.Test;
import play.test.UnitTest;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class pruebaEstado extends UnitTest{
    @Test
    public void crear(){
        Estado e = new Estado("Activo");
        e.est_vcNombre="Activo";       
        e.save();
        Estado ee= Estado.obtener("Activo");                
        assertNotNull(ee);        
    }
}
