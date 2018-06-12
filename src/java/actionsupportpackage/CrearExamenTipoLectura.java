/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actionsupportpackage;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import entity.Examen;
import entity.Tipolecturaexamen;
import entity.HibernateUtil;
import entity.Preguntalectura;
import entity.Respuestapreguntas;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Max
 */
public class CrearExamenTipoLectura extends ActionSupport {
    
    private Integer idexamen;
    private String examenes;
     private String nombreexamen;
     private String descripcion;
     private String pregunta1;
     private String respuesta1,respuesta2,respuesta3,respuesta4;
     private String si1,si2,si3,si4;
     private Set tipolecturaexamens = new HashSet(0);
     

   public String execute() throws Exception 
    {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        
        Examen examen = (Examen) session.createQuery(" from Examen where nombreexamen='"+examenes+"'").uniqueResult();
        //public Product(Category category, String name, String description, float price)
        Tipolecturaexamen primera = new Tipolecturaexamen(examen,descripcion, "Quad-core PC1");
        
        Preguntalectura primeraP = new Preguntalectura(primera,pregunta1);
        
        
        Respuestapreguntas primeraR = new Respuestapreguntas(primeraP,respuesta1,compare(si1));
        Respuestapreguntas segundaR = new Respuestapreguntas(primeraP,respuesta2,compare(si2));  
        Respuestapreguntas terceraR = new Respuestapreguntas(primeraP,respuesta3,compare(si3));  
        Respuestapreguntas cuartaR = new Respuestapreguntas(primeraP,respuesta4,compare(si4));  
        
        Set<Respuestapreguntas> respuestaL = new HashSet<Respuestapreguntas>();
        respuestaL.add(primeraR);
        
        respuestaL.add(segundaR);
        
        respuestaL.add(terceraR);
        
        respuestaL.add(cuartaR);
        
        primeraP.setRespuestapreguntases(respuestaL);
       
        
         
        Set<Preguntalectura> preguntaL = new HashSet<Preguntalectura>();
        preguntaL.add(primeraP);
        
        
        primera.setPreguntalecturas(preguntaL);
        
        Set<Tipolecturaexamen> lecturas = new HashSet<Tipolecturaexamen>();
        lecturas.add(primera);
               
         
        examen.setTipolecturaexamens(lecturas);
         
        session.save(examen);
         
        session.getTransaction().commit();
        session.close();
        
        return SUCCESS;
 }  

   public boolean compare(String a){
       System.out.println(a);
       if("true".equals(a))return true;
       else if("false".equals(a))return false;
       return false;
   }
   
    public String getExamenes() {
        return examenes;
    }

    public void setExamenes(String examenes) {
        this.examenes = examenes;
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
    
  
    public String getPregunta1() {
        return this.pregunta1;
    }
    
    public void setPregunta1(String pregunta1) {
        this.pregunta1 = pregunta1;
    }
    
    
    public String getRespuesta1() {
        return respuesta1;
    }

    public void setRespuesta1(String respuesta1) {
        this.respuesta1 = respuesta1;
    }

    public String getRespuesta2() {
        return respuesta2;
    }

    public void setRespuesta2(String respuesta2) {
        this.respuesta2 = respuesta2;
    }

    public String getRespuesta3() {
        return respuesta3;
    }

    public void setRespuesta3(String respuesta3) {
        this.respuesta3 = respuesta3;
    }

    public String getRespuesta4() {
        return respuesta4;
    }

    public void setRespuesta4(String respuesta4) {
        this.respuesta4 = respuesta4;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set getTipolecturaexamens() {
        return tipolecturaexamens;
    }

    public void setTipolecturaexamens(Set tipolecturaexamens) {
        this.tipolecturaexamens = tipolecturaexamens;
    }

    public String getSi1() {
        return si1;
    }

    public void setSi1(String si1) {
        this.si1 = si1;
    }

    public String getSi2() {
        return si2;
    }

    public void setSi2(String si2) {
        this.si2 = si2;
    }

    public String getSi3() {
        return si3;
    }

    public void setSi3(String si3) {
        this.si3 = si3;
    }

    public String getSi4() {
        return si4;
    }

    public void setSi4(String si4) {
        this.si4 = si4;
    }
    
    
    
}
