package entity;
// Generated 3/06/2018 04:40:11 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Preguntalectura generated by hbm2java
 */
public class Preguntalectura  implements java.io.Serializable {


     private Integer idpregunta;
     private Tipolecturaexamen tipolecturaexamen;
     private String oracionpregunta;
     private Set respuestapreguntases = new HashSet(0);

    public Preguntalectura() {
    }

	
    public Preguntalectura(Tipolecturaexamen tipolecturaexamen, String oracionpregunta) {
        this.tipolecturaexamen = tipolecturaexamen;
        this.oracionpregunta = oracionpregunta;
    }
    public Preguntalectura(Tipolecturaexamen tipolecturaexamen, String oracionpregunta, Set respuestapreguntases) {
       this.tipolecturaexamen = tipolecturaexamen;
       this.oracionpregunta = oracionpregunta;
       this.respuestapreguntases = respuestapreguntases;
    }
   
    public Integer getIdpregunta() {
        return this.idpregunta;
    }
    
    public void setIdpregunta(Integer idpregunta) {
        this.idpregunta = idpregunta;
    }
    public Tipolecturaexamen getTipolecturaexamen() {
        return this.tipolecturaexamen;
    }
    
    public void setTipolecturaexamen(Tipolecturaexamen tipolecturaexamen) {
        this.tipolecturaexamen = tipolecturaexamen;
    }
    public String getOracionpregunta() {
        return this.oracionpregunta;
    }
    
    public void setOracionpregunta(String oracionpregunta) {
        this.oracionpregunta = oracionpregunta;
    }
    public Set getRespuestapreguntases() {
        return this.respuestapreguntases;
    }
    
    public void setRespuestapreguntases(Set respuestapreguntases) {
        this.respuestapreguntases = respuestapreguntases;
    }




}

