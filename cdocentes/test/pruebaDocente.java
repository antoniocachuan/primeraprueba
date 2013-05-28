
import models.Docente;
import models.Estado;
import org.junit.Before;
import org.junit.Test;
import play.test.Fixtures;
import play.test.UnitTest;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class pruebaDocente extends UnitTest{
    @Before
    public void inicio(){
        Fixtures.deleteAllModels();
    }
    @Test
    public void crear(){
        Estado e = new Estado("Activo");
        e.save();
        Docente d = new Docente("midni",
            "ap",
            "ap",
            "nombre",
            "email",
            "clave"    
            );
        d.save();
        Docente dd = Docente.obtenerDNI("midni");          
        assertNotNull(dd);        
        
        Docente ddd = Docente.obtener(dd.doc_iCodigo);
        assertNotNull(ddd);        
    }
}
