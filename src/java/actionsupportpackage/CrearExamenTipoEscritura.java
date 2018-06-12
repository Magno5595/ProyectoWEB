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
import entity.Preguntalectura;
import entity.HibernateUtil;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Max
 */
public class CrearExamenTipoEscritura extends ActionSupport {
    
     private Integer idexamen;
     private String examenes;
     private String nombreexamen;
     private String descripcion;
     
     
     private Set tipoescrituraexamens = new HashSet(0);
     
     
     
     

   public String execute() throws Exception 
    {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        
  
       
         
        Examen examen = (Examen) session.createQuery(" from Examen where nombreexamen='"+examenes+"'").uniqueResult();
        //public Product(Category category, String name, String description, float price)
        Tipoescrituraexamen primera = new Tipoescrituraexamen(examen,descripcion, "Quad-core PC1");
        
        
        
         
        Set<Tipoescrituraexamen> escrituras = new HashSet<Tipoescrituraexamen>();
        escrituras.add(primera);
                
         
        examen.setTipoescrituraexamens(escrituras);
         
        session.save(examen);
         
        session.getTransaction().commit();
        session.close();
        
        return SUCCESS;
 }  

    public String getExamenes() {
        return examenes;
    }

    public void setExamenes(String examenes) {
        this.examenes = examenes;
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
    
    public Set getTipoescrituraexamens() {
        return this.tipoescrituraexamens;
    }
    
    public void setTipoescrituraexamens(Set tipoescrituraexamens) {
        this.tipoescrituraexamens = tipoescrituraexamens;
    }
    
    

    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   
    
}
