package peaksoft.service;

import org.hibernate.Session;
import peaksoft.entity.Worker;
import peaksoft.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class ServiceWorkers {

    public static long create(Worker worker){
        Session session = HibernateUtil.getSession().openSession();
        session.beginTransaction();
        session.save(worker);
        session.getTransaction().commit();
        session.close();

        System.out.println("Successfully added!  "+ worker);
        return  worker.getId();
    }

    public static List<Worker> getAza(){
        Session session = HibernateUtil.getSession().openSession();
        session.beginTransaction();
        List workers = session.createQuery("from Worker where  age > 23 and name = 'aza'").getResultList();
        session.getTransaction().commit();
        session.close();
        System.out.println(workers);
        return workers;
    }

    public static void update(){
        Session session = HibernateUtil.getSession().openSession();
        session.beginTransaction();
        session.createQuery("update Worker set age = 18 where name = 'aza'").executeUpdate();
        session.getTransaction().commit();
        session.close();

        System.out.println("Successfully updated!");
    }

    public static void remove(){
        Session session = HibernateUtil.getSession().openSession();
        session.beginTransaction();
        session.createQuery("delete Worker where name = 'aza'").executeUpdate();
        session.getTransaction().commit();
        session.close();
    }

    public static List<Worker> getAll(){
        Session session = HibernateUtil.getSession().openSession();
        session.beginTransaction();
        List<Worker> workers = session.createQuery("from Worker").getResultList();
        session.getTransaction().commit();
        session.close();

        System.out.println(workers);
        return workers;
    }
}
