package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Foto;
import model.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-30T21:38:12")
@StaticMetamodel(Comentario.class)
public class Comentario_ { 

    public static volatile SingularAttribute<Comentario, String> texto;
    public static volatile SingularAttribute<Comentario, Foto> foto;
    public static volatile SingularAttribute<Comentario, Date> dataPublicacao;
    public static volatile SingularAttribute<Comentario, Usuario> usuario;
    public static volatile SingularAttribute<Comentario, Integer> id;

}