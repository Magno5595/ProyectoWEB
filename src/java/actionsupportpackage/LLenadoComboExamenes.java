package actionsupportpackage;

import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import entity.Examen;
import entity.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class LLenadoComboExamenes extends ActionSupport 
{
private List<String> lista4;

    public List<String> getLista4() {
        return lista4;
    }

    public void setLista4(List<String> lista4) {
        this.lista4 = lista4;
    }

    public String execute() throws Exception 
 {
 Session hibernateSession;
  
 hibernateSession=HibernateUtil.getSessionFactory().openSession(); 
 Query consulta=hibernateSession.createQuery("select nombreexamen from Examen ");
 lista4=consulta.list();
 
 return SUCCESS;
 }  
}