/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actionsupportpackage;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import entity.Examen;
import entity.Tipoescrituraexamen;
import entity.HibernateUtil;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Max
 */
public class CrearExamenTipoEscritura extends ActionSupport {
    
    private Integer idexamen;
     private String nombreexamen;
     private Set tipolecturaexamens = new HashSet(0);
     private Set tipoescrituraexamens = new HashSet(0);

   public String execute() throws Exception 
    {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
         
        Examen examen = new Examen("Examen segunda  ");
        //public Product(Category category, String name, String description, float price)
        Tipoescrituraexamen primera = new Tipoescrituraexamen(examen,"Haz esto 1", "Quad-core PC1");
        Tipoescrituraexamen segunda = new Tipoescrituraexamen(examen,"Haz esto 2", "Quad-core PC2");
        Tipoescrituraexamen tercera = new Tipoescrituraexamen(examen,"Haz esto 3", "Quad-core PC3");
        Tipoescrituraexamen cuarta = new Tipoescrituraexamen(examen,"Haz esto 4", "Quad-core PC4");
         
        Set<Tipoescrituraexamen> escrituras = new HashSet<Tipoescrituraexamen>();
        escrituras.add(primera);
        escrituras.add(segunda);
        escrituras.add(tercera);
        escrituras.add(cuarta);        
         
        examen.setTipoescrituraexamens(escrituras);
         
        session.save(examen);
         
        session.getTransaction().commit();
        session.close();
        
        return SUCCESS;
 }  

 public Integer getIdexamen() {
        return this.idexamen;
    }
    
    public void setIdexamen(Integer idexamen) {
        this.idexamen = idexamen;
    }
    public String getNombreexamen() {
        return this.nombreexamen;
    }
    
    public void setNombreexamen(String nombreexamen) {
        this.nombreexamen = nombreexamen;
    }
    public Set getTipolecturaexamens() {
        return this.tipolecturaexamens;
    }
    
    public void setTipolecturaexamens(Set tipolecturaexamens) {
        this.tipolecturaexamens = tipolecturaexamens;
    }
    public Set getTipoescrituraexamens() {
        return this.tipoescrituraexamens;
    }
    
    public void setTipoescrituraexamens(Set tipoescrituraexamens) {
        this.tipoescrituraexamens = tipoescrituraexamens;
    }
  
    
    
}
