package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Comentario;
import model.Foto;
import model.Seguindo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-03T20:53:39")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> senha;
    public static volatile CollectionAttribute<Usuario, Seguindo> seguindoCollection;
    public static volatile SingularAttribute<Usuario, String> nome;
    public static volatile SingularAttribute<Usuario, Integer> id;
    public static volatile CollectionAttribute<Usuario, Foto> fotoCollection;
    public static volatile CollectionAttribute<Usuario, Comentario> comentarioCollection;

}