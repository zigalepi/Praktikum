package EJB;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import projekt.Uporabnik;

@Stateless
@Local
public class UporabnikEJB {
	

	
	@PersistenceContext(unitName="Praktikum")
	private EntityManager em;

public Uporabnik najdId(int id) {
		
		return em.find(Uporabnik.class, id);
	}

}