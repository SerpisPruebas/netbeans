/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import javax.persistence.*;
import Dominio.Persona;
import org.apache.logging.log4j.*;
/**
 *
 * @author marmin
 * @version 1.0
 * esto es una prueba
 * esto es otra prueba
 */
public class ClienteEntidadClientes {
    static Logger log= LogManager.getRootLogger();
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("ClientesPU");
        EntityManager em=emf.createEntityManager();
        EntityTransaction tx=em.getTransaction();
        
        //iniciamos transaccion
        tx.begin();
        //no especifiqueis el id de la BD
        Persona persona1 =new Persona("Antonio", "Pérez", "antonio@email.com");
        log.debug("Objeto a persistir: " +persona1);
        
        //persistimos el objeto
        em.persist(persona1);
        
        //terminar la transacción
        tx.commit();
        log.debug("Objeto persistido " +persona1);
        em.close();
        
    }
    
}
