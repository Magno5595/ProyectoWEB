/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actionsupportpackage;

import com.opensymphony.xwork2.ActionSupport;
import entity.Examen;
import entity.HibernateUtil;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Max
 */
public class CrearExamenTipoLectura extends ActionSupport {
    
    private Integer idexamen;
    private String nombreexamen;
    private Set tipolecturaexamens = new HashSet(0);

     Session hibernateSession;
     Examen examen;
    
    public CrearExamenTipoLectura() {
    }
    
    public Integer getIdexamen() {
        return this.idexamen;
    }
    
    public void setIdexamen(Integer idexamen) {
        this.idexamen = idexamen;
    }
    public String getNombreexamen() {
        return this.nombreexamen;
    }
    
    public void setNombreexamen(String nombreexamen) {
        this.nombreexamen = nombreexamen;
    }
    
    public Set getTipolecturaexamens() {
        return this.tipolecturaexamens;
    }
    
    public void setTipolecturaexamens(Set tipolecturaexamens) {
        this.tipolecturaexamens = tipolecturaexamens;
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
 Examen user0 = new Examen();
 user0.setIdexamen(idexamen);
 user0.setNombreexamen(nombreexamen);
 user0.setTipolecturaexamens(tipolecturaexamens);
 hibernateSession.save(user0);
 t0.commit();

  return SUCCESS;
 }  
  
    
    
}
