package actionsupportpackage;

import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import entity.Usuarios;
import entity.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ListaMenu extends ActionSupport 
{
private List lista1;

    public List getLista1() {
        return lista1;
    }

    public void setLista1(List lista1) {
        this.lista1 = lista1;
    }

    public String execute() throws Exception 
 {
 Session hibernateSession;
  
 hibernateSession=HibernateUtil.getSessionFactory().openSession(); 
 Query consulta=hibernateSession.createQuery("from Usuarios");
 lista1=consulta.list();
 
 return SUCCESS;
 }  
}