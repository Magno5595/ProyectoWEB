package actionsupportpackage;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import entity.HibernateUtil;
import entity.Usuarios;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateAdministrator2 extends ActionSupport 
{
String sid;
 String password;
 int tipousuario;
 String firstname;
 String lastname;

    public String getSid() {
        return this.sid;
    }
    
    public void setSid(String sid) {
        this.sid = sid;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public int getTipousuario() {
        return this.tipousuario;
    }
    
    public void setTipousuario(int tipousuario) {
        this.tipousuario = tipousuario;
    }
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public String execute() throws Exception 
    {
        System.out.println("SID ES:"+sid);
        System.out.println("PW ES:"+password);
        System.out.println("TU ES:"+tipousuario);
        System.out.println("FN ES:"+firstname);
        System.out.println("LN ES:"+lastname);
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t=session.beginTransaction();
        Query query = session.createQuery("update Usuarios set password = :pw1,lastname =:ln1,firstname = :fn1,tipousuario =:tp1 where sid = :sid1");
        query.setParameter("sid1", sid);
        query.setParameter("pw1", password);
        query.setParameter("tp1", tipousuario);
        query.setParameter("fn1", firstname);
        query.setParameter("ln1", lastname);
        query.executeUpdate();
        t.commit();
        session.close();
        return SUCCESS;
    }
    
}

