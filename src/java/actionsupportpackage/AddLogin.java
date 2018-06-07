package actionsupportpackage;

import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.LOGIN;
import static com.opensymphony.xwork2.Action.NONE;
import static com.opensymphony.xwork2.Action.SUCCESS;
//import static com.opensymphony.xwork2.Action.LOGIN;
//import static com.opensymphony.xwork2.Action.NONE;
import com.opensymphony.xwork2.ActionSupport;
import entity.Usuarios;
import entity.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class AddLogin extends ActionSupport {
    
 String sid;
 String password;
 String firstname;
 
 Session hibernateSession;
 Usuarios usuario;
 List lista1;

 public String execute() throws Exception {
 hibernateSession=HibernateUtil.getSessionFactory().openSession(); 
 hibernateSession.beginTransaction();
 System.out.println("session get");
  
 if(sid!=null && password!=null &&(!sid.equals(""))&&(!password.equals(""))){
 usuario=(Usuarios) hibernateSession.createQuery("from Usuarios where sid='"+sid+"'AND password='"+password+"'").uniqueResult();
 }else{
 addActionError("User Name does not exist");
 return INPUT;
 }
 if(usuario==null){
 addActionError("User Name does not exist");
 return INPUT;
 }
 
 
 if(usuario.getTipousuario()==1){
 addActionMessage("Welcome you logined");
 Query consulta=hibernateSession.createQuery("from Usuarios");
 lista1=consulta.list();
 return SUCCESS;
 }
 if(usuario.getTipousuario()==2){
 addActionMessage("Welcome you logined");
 return NONE;
 }
 if(usuario.getTipousuario()==3){
 addActionMessage("Welcome you logined");
 return LOGIN;
 }
 return INPUT;
 }
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
   
     
    public List getLista1() {
        return lista1;
    }

    public void setLista1(List lista1) {
        this.lista1 = lista1;
    }
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

}