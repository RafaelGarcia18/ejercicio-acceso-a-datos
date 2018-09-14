
package uesocc.edu.sv.ingenieria.prn335.ejerciciocompleto.control;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import uesocc.edu.sv.ingenieria.prn335.ejerciciocompleto.entities.Marca;

@LocalBean
@Stateless
public class Utilidades {
    
    @PersistenceContext(unitName ="uesocc.edu.sv.ingenieria.prn335_EjercicioCompleto_war_1.0-SNAPSHOTPU")
    private EntityManager manager;
    
    public List findAll(){
        Query consulta = manager.createQuery("SELECT r FROM Modelo r");
        return consulta.getResultList();
    }
    
    public List findByNombre(String busqueda){
        Query consulta2 = manager.createQuery("SELECT r.nombre FROM Modelo r where (r.nombre like '%"+busqueda+"%')");
        return consulta2.getResultList();
    }
    
    public void addRegistro(Marca entity) throws Exception{
        manager.getTransaction().begin();
        manager.persist(entity);
        manager.getTransaction().commit();
    }
    
    public void refreshRegistro(Marca entity) throws Exception{
        manager.getTransaction().begin();
        manager.merge(entity);
        manager.getTransaction().commit();
    }
    
    public void removeRegistro(Marca entity) throws Exception{
        manager.getTransaction().begin();
        manager.remove(entity);
        manager.getTransaction().commit();;
    }
    
    
    
}
