// MESSAGE A L'ENSEIGNANT
//
// Bonjour,
// Désolée d'avoir rendu ce devoir en retard, cela fait des jours que je n'arrive pas à débloquer un souci :
// Dans ma table animal, la colonne où je devrais avoir l'ID du petstore garde une valeur null quoique je tente
// J'ai quand même essayé de coder la classe PetStoreSearch où je dois faire une requête, mais elle ne marche pas par conséquent
// Merci pour votre compréhension !
// Coralie
//

package org.petstore.apps;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.EntityTransaction;
import org.petstore.entities.Address;
import org.petstore.entities.PetStore;
import org.petstore.entities.animals.Cat;
import org.petstore.entities.animals.fish.Fish;
import org.petstore.entities.animals.fish.FishLivEnv;
import org.petstore.entities.product.ProdType;
import org.petstore.entities.product.Product;

import java.util.Date;
import java.util.List;

/**
 * Classe principale pour la création d'instances de PetStore, d'Animal, et de Product,
 * et pour leur persistance dans la base de données.
 */
public class PetstoreCreation {
    /**
     * Point d'entrée de l'application pour créer et persister des PetStores,
     * des animaux et des produits associés.
     *
     * @param args les arguments de la ligne de commande (non utilisés)
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        try {
            // Début de la transaction
            transaction.begin();

            // Création et configuration du premier PetStore
            PetStore petStore1 = new PetStore();
            petStore1.setName("Zooplus");
            petStore1.setManagerName("Brigitte Bardot");

            Address adresse1 = new Address();
            adresse1.setNumber("1312");
            adresse1.setStreet("rue des Antispécistes");
            adresse1.setZipcode("26900");
            adresse1.setCity("Vie-Aux-Vaches");
            petStore1.setAddress(adresse1);

            // Création de chats pour le premier PetStore
            Cat cat1 = new Cat();
            cat1.setBirth(new Date());
            cat1.setCouleur("tigré");
            cat1.setChipId("AAA222CCC");

            Cat cat2 = new Cat();
            cat2.setBirth(new Date());
            cat2.setCouleur("roux");
            cat2.setChipId("111BBB333");

            // Création d'un poisson pour le premier PetStore
            Fish fish1 = new Fish();
            fish1.setBirth(new Date());
            fish1.setCouleur("rouge");
            fish1.setLivingEnv(FishLivEnv.FRESH_WATER);

            // Création de produits pour le premier PetStore
            Product product1 = new Product();
            product1.setCode("979820045");
            product1.setPrice(8.5);
            product1.setLabel("Friskies");
            product1.setType(ProdType.TYPE_FOOD);

            Product product2 = new Product();
            product2.setCode("979820066");
            product2.setPrice(12.8);
            product2.setLabel("Juliet");
            product2.setType(ProdType.TYPE_CLEANING);

            Product product3 = new Product();
            product3.setCode("9798200f4");
            product3.setPrice(10.8);
            product3.setLabel("FreshCat");
            product3.setType(ProdType.TYPE_CLEANING);

            // Configuration du deuxième PetStore et de ses animaux et produits
            PetStore petStore2 = new PetStore();
            petStore2.setName("Zoomalia");
            petStore2.setManagerName("Brigitte Gothière");

            Address adresse2 = new Address();
            adresse2.setNumber("269");
            adresse2.setStreet("rue de la Biodiversité");
            adresse2.setZipcode("26900");
            adresse2.setCity("Castelnau-del-Toro");
            petStore2.setAddress(adresse2);

            Cat cat3 = new Cat();
            cat3.setBirth(new Date());
            cat3.setCouleur("calico");
            cat3.setChipId("A4A222CC7");

            Fish fish2 = new Fish();
            fish2.setBirth(new Date());
            fish2.setCouleur("doré");
            fish2.setLivingEnv(FishLivEnv.SEA_WATER);

            Fish fish3 = new Fish();
            fish3.setBirth(new Date());
            fish3.setCouleur("noir");
            fish3.setLivingEnv(FishLivEnv.FRESH_WATER);

            Product product4 = new Product();
            product4.setCode("979820466");
            product4.setPrice(18.8);
            product4.setLabel("Trixie");
            product4.setType(ProdType.TYPE_ACCESSORY);
            product4.setPetstores(List.of(petStore2));

            // Configuration du troisième PetStore et de ses animaux
            PetStore petStore3 = new PetStore();
            petStore3.setName("Zoomalia");
            petStore3.setManagerName("Paul Watson");

            Address adresse3 = new Address();
            adresse3.setNumber("13");
            adresse3.setStreet("rue des chats noirs");
            adresse3.setZipcode("66600");
            adresse3.setCity("Cerbère");
            petStore3.setAddress(adresse3);

            Cat cat4 = new Cat();
            cat4.setBirth(new Date());
            cat4.setCouleur("noir");
            cat4.setChipId("A4A24HCC7");

            Fish fish4 = new Fish();
            fish4.setBirth(new Date());
            fish4.setCouleur("blanc");
            fish4.setLivingEnv(FishLivEnv.SEA_WATER);

            Fish fish5 = new Fish();
            fish5.setBirth(new Date());
            fish5.setCouleur("bleu");
            fish5.setLivingEnv(FishLivEnv.FRESH_WATER);

            // Association des produits et animaux aux PetStores
            product1.setPetstores(List.of(petStore1, petStore3));
            product2.setPetstores(List.of(petStore1, petStore2));
            product3.setPetstores(List.of(petStore1, petStore2, petStore3));
            product4.setPetstores(List.of(petStore2, petStore3));

            petStore1.setProducts(List.of(product1, product2, product3));
            petStore1.addAnimal(cat1);
            petStore1.addAnimal(cat2);
            petStore1.addAnimal(fish1);

            petStore2.setProducts(List.of(product2, product3, product4));
            petStore2.addAnimal(cat3);
            petStore2.addAnimal(fish2);
            petStore2.addAnimal(fish3);

            petStore3.setProducts(List.of(product1, product3, product4));
            petStore3.addAnimal(cat4);
            petStore3.addAnimal(fish4);
            petStore3.addAnimal(fish5);

            // Persistance des données
            em.persist(petStore1);
            em.persist(petStore2);
            em.persist(petStore3);
            em.persist(product1);
            em.persist(product2);
            em.persist(product3);
            em.persist(product4);

            System.out.println(petStore1.getName());

            // Commit de la transaction
            transaction.commit();

        } catch (Exception e) {
            // Rollback de la transaction en cas d'erreur
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}
