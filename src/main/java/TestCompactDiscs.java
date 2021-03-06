import com.conygre.training.entities.CompactDisc;

import javax.persistence.*;

public class TestCompactDiscs {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("conygrePersistentUnit");
        EntityManager em = factory.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        CompactDisc disc = em.find(CompactDisc.class, 11);
        System.out.println(disc.getTitle());

        em.clear();
        disc.setTitle("A Rush of Blood to the Head");
        Query allSpiceGirlTracks = em.createQuery("select t.title from Track t where t.cdId = 16");
        allSpiceGirlTracks.getResultList().forEach(System.out :: println);

        tx.commit();
        em.close();

        factory.close();
    }

}