
package actionsupportpackage;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import entity.HibernateUtil;
import entity.Examen;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class GuardarCanvas extends ActionSupport{
    private int id ;
    private String cadenaJSON;

    public GuardarCanvas() {
    }

    public GuardarCanvas(int id, String cadenaJSON) {
        this.id = id;
        this.cadenaJSON = cadenaJSON;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCadenaJSON() {
        return cadenaJSON;
    }

    public void setCadenaJSON(String cadenaJSON) {
        this.cadenaJSON = cadenaJSON;
    }
    
        public String execute() throws Exception {
         Session hibernateSession;
        hibernateSession=HibernateUtil.getSessionFactory().openSession(); 
        Transaction t=hibernateSession.beginTransaction(); 
        Examen cadena=new Examen();
        //cadena.setCadena(cadenaJSON);
        hibernateSession.save(cadena);
        t.commit(); 
        return SUCCESS;
     }
}