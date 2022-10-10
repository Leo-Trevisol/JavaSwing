package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		
		////////INSERTS NO BANCO /////////////////
		
//		Pessoa p1 = new Pessoa(null, "Leo", "LEo@gmail.com");
//		Pessoa p2 = new Pessoa(null, "Leo1", "LEo1@gmail.com");
//		Pessoa p3 = new Pessoa(null, "Leo2", "LEo2@gmail.com");
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p3);
//		
//		em.getTransaction().begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		em.getTransaction().commit();
		
		
		
		////// SELECTS NO BANCO ////////////
		
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);
		
		
	////// DELETE NO BANCO -- EXCLUIR OBJ QUE ACABOU DE SER INSERIDO OU BUSCADO ////////////
		
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		
		
		em.close();
		emf.close();
		System.out.println("OKKKK");


	}

}
