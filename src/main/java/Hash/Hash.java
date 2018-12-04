/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hash;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.persistence.metamodel.SingularAttribute;
import model.Usuario;


public final class Hash {

    public static Object md5(SingularAttribute<Usuario, String> senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private Hash(){}
    
    public static String md5(String source) {
        String hash = null;
        try {
            MessageDigest md = MessageDigest.getInstance("md5");
            hash = Base64.getEncoder().encodeToString(md.digest(source.getBytes("UTF-8")));
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
        return hash;
    }
}
