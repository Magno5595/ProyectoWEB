package actionsupportpackage;

import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import entity.Examen;
import entity.HibernateUtil;
import entity.Tipolecturaexamen;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ValoresCanvas extends ActionSupport 
{


private Integer id;
private List lista6;

   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public List getLista6() {
        return lista6;
    }

    public void setLista6(List lista6) {
        this.lista6 = lista6;
    }


    public String execute() throws Exception 
 {
 
 
 Session hibernateSession1;
  
 hibernateSession1=HibernateUtil.getSessionFactory().openSession(); 
 Query consulta6;
    consulta6 = hibernateSession1.createQuery("select e.nombreexamen,t.textotipolectura,p.oracionpregunta,r.textoRespuesta from Examen e inner join e.tipolecturaexamens t inner join t.preguntalecturas p inner join p.respuestapreguntases r where e.idexamen = :idexamen1");
 consulta6.setParameter("idexamen1", id);
 lista6=consulta6.list();
 

 return SUCCESS;
 }  
}


