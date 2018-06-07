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

public class DeleteUser extends ActionSupport 
{
private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String execute() throws Exception 
 {
 Session hibernateSession;
  
 hibernateSession=HibernateUtil.getSessionFactory().openSession(); 
  
 Transaction t0=hibernateSession.beginTransaction(); 
 Usuarios user=(Usuarios)hibernateSession.load(Usuarios.class,id);
 hibernateSession.delete(user);
 t0.commit(); 
 
 return SUCCESS;
 }  
}