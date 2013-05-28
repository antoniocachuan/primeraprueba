
import models.Usuario;
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
public class pruebaUsuario extends UnitTest{
    @Test
    public void crear(){
        Usuario u = new Usuario();
        u.usu_vcUsuario="oarias";
        u.usu_vcClave="secreto";
        u.usu_vcRol="administrador";
        u.save();
        
        Usuario uu = Usuario.find("byUsu_vcUsuario","oarias").first();
        assertNotNull(uu);        
    }
    
    
}
