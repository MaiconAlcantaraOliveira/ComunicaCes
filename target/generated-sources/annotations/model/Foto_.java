package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Comentario;
import model.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-30T21:38:12")
@StaticMetamodel(Foto.class)
public class Foto_ { 

    public static volatile SingularAttribute<Foto, String> titulo;
    public static volatile SingularAttribute<Foto, Usuario> usuario;
    public static volatile SingularAttribute<Foto, Integer> id;
    public static volatile SingularAttribute<Foto, String> url;
    public static volatile CollectionAttribute<Foto, Comentario> comentarioCollection;

}