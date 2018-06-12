package actionsupportpackage;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import entity.Examen;
import entity.Tipoescrituraexamen;
import entity.Preguntalectura;
import entity.HibernateUtil;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;

/**
 *
 * @author Max
 */
public class prueba extends ActionSupport {
    
     private String examen;
     private String nombreexamen;
     private String descripcion;
     private String si1,si2,si3,si4;
     
     private Set tipoescrituraexamens = new HashSet(0);
     
     
     
     

   public String execute() throws Exception 
    {

        System.out.println(si1);
        System.out.println(si2);
        System.out.println(si3);
        System.out.println(si4);
        
        return SUCCESS;
 }  

    public String getSi1() {
        return si1;
    }

    public void setSi1(String si1) {
        this.si1 = si1;
    }

    public String getSi2() {
        return si2;
    }

    public void setSi2(String si2) {
        this.si2 = si2;
    }

    public String getSi3() {
        return si3;
    }

    public void setSi3(String si3) {
        this.si3 = si3;
    }

    public String getSi4() {
        return si4;
    }

    public void setSi4(String si4) {
        this.si4 = si4;
    }
   
   

    public String getExamen() {
        return examen;
    }

    public void setExamen(String examen) {
        this.examen = examen;
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
