package actionsupportpackage;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import entity.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Max
 */
public class VerExamen extends ActionSupport {
    
    public VerExamen() {
    }
    
    private List lista2;

    public List getLista2() {
        return lista2;
    }

    public void setLista2(List lista1) {
        this.lista2 = lista1;
    }
    
    public String execute() throws Exception {
        Session hibernateSession;
  
    hibernateSession=HibernateUtil.getSessionFactory().openSession(); 
    Query consulta=hibernateSession.createQuery("from Examen");
    lista2=consulta.list();
    
    return SUCCESS;
    }
    
}