package fr.app;

import org.petstore.entities.animals.Animal;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

/**
 * Classe permettant de rechercher et d'afficher les animaux associés à un PetStore spécifique.
 */
public class PetStoreSearch {

    /**
     * Point d'entrée de l'application pour rechercher les animaux associés à un PetStore.
     * Effectue une requête pour récupérer les animaux associés à l'ID de PetStore spécifié
     * et affiche leurs identifiants.
     *
     * @param args les arguments de la ligne de commande (non utilisés)
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager em = emf.createEntityManager();

        // Requête pour récupérer les animaux associés à un PetStore avec ID 1
        Query query = em.createQuery("SELECT a FROM Animal a WHERE a.petstore_col.id = 1");
        List<Animal> animals = query.getResultList();

        // Fermeture de l'EntityManager et de l'EntityManagerFactory
        em.close();
        emf.close();

        // Affichage des identifiants des animaux trouvés
        for (Animal animal : animals) {
            System.out.println(animal.getId());
        }
    }
}
