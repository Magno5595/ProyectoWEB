package actionsupportpackage;

import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import entity.Usuarios;
import entity.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class InsertUser extends ActionSupport {
 String sid;
 String password;
 int tipousuario;
 String firstname;
 String lastname;
 Session hibernateSession;
 Usuarios usuario;
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

    public Session getHibernateSession() {
        return hibernateSession;
    }

    public void setHibernateSession(Session hibernateSession) {
        this.hibernateSession = hibernateSession;
    }

   

 public String execute() throws Exception 
 {
 hibernateSession=HibernateUtil.getSessionFactory().openSession(); 
 
 //Insert
 Transaction t0=hibernateSession.beginTransaction();
 Usuarios user0 = new Usuarios();
 user0.setSid(sid);
 user0.setPassword(password);
 user0.setTipousuario(tipousuario);
 user0.setFirstname(firstname);
 user0.setLastname(lastname);
 hibernateSession.save(user0);
 t0.commit();
 /*
 //Select
 Login user1=(Login)hibernateSession.load(Login.class, 1);
 System.out.println(user1.getIdLogin());
 System.out.println(user1.getUsername());
 System.out.println(user1.getPassword());
 
 //Update
 Transaction t1=hibernateSession.beginTransaction();
 user1.setPassword("456");
 hibernateSession.update(user1);
 t1.commit();
 
 //Delete
 Transaction t2=hibernateSession.beginTransaction(); 
 Login user2=(Login)hibernateSession.load(Login.class,9);
 hibernateSession.delete(user2);
 t2.commit(); */
  return SUCCESS;
 }  
}
