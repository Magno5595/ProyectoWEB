package actionsupportpackage;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import entity.Examen;
import entity.Tipolecturaexamen;
import entity.HibernateUtil;
import entity.Preguntalectura;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Max
 */
public class CrearExamen extends ActionSupport {
    
    private Integer idexamen;
     private String nombreexamen;
         

   public String execute() throws Exception 
    {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
         
        Examen examen = new Examen(nombreexamen);
        //public Product(Category category, String name, String description, float price)
        
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
    
  
    
    
    
    
}