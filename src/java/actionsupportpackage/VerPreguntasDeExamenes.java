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

public class VerPreguntasDeExamenes extends ActionSupport 
{


private Integer id;
private List lista5;

   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public List getLista5() {
        return lista5;
    }

    public void setLista5(List lista5) {
        this.lista5 = lista5;
    }


    public String execute() throws Exception 
 {
 
 
 Session hibernateSession1;
  
 hibernateSession1=HibernateUtil.getSessionFactory().openSession(); 
 Query consulta5;
    consulta5 = hibernateSession1.createQuery("select e.idexamen,e.nombreexamen,t.textotipolectura,p.oracionpregunta,r.textoRespuesta from Examen e inner join e.tipolecturaexamens t inner join t.preguntalecturas p inner join p.respuestapreguntases r where e.idexamen = :idexamen1");
 consulta5.setParameter("idexamen1", id);
 lista5=consulta5.list();
 

 return SUCCESS;
 }  
}


