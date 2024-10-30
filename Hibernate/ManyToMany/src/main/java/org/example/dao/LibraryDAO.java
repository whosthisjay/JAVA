package org.example.dao;

import org.example.model.Reader;
import org.example.model.Subscription;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class LibraryDAO {

    private Session getSession() {
        return new Configuration().configure().buildSessionFactory().openSession();
    }

    // Create Reader
    public void createReader(Reader reader) {
        try (Session session = getSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(reader);
            transaction.commit();
        }
    }

    // Create Subscription
    public void createSubscription(Subscription subscription) {
        try (Session session = getSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(subscription);
            transaction.commit();
        }
    }

    // Read Readers
    public Reader readReader(int readerId) {
        try (Session session = getSession()) {
            return session.get(Reader.class, readerId);
        }
    }

    // Read Subscriptions
    public Subscription readSubscription(int subscriptionId) {
        try (Session session = getSession()) {
            return session.get(Subscription.class, subscriptionId);
        }
    }

    // Update Reader
    public void updateReader(Reader reader) {
        try (Session session = getSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(reader);
            transaction.commit();
        }
    }

    // Update Subscription
    public void updateSubscription(Subscription subscription) {
        try (Session session = getSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(subscription);
            transaction.commit();
        }
    }

    // Delete Reader
    public void deleteReader(int readerId) {
        try (Session session = getSession()) {
            Transaction transaction = session.beginTransaction();
            Reader reader = session.get(Reader.class, readerId);
            if (reader != null) {
                session.delete(reader);
            }
            transaction.commit();
        }
    }

    // Delete Subscription
    public void deleteSubscription(int subscriptionId) {
        try (Session session = getSession()) {
            Transaction transaction = session.beginTransaction();
            Subscription subscription = session.get(Subscription.class, subscriptionId);
            if (subscription != null) {
                session.delete(subscription);
            }
            transaction.commit();
        }
    }

    // Get All Readers
    @SuppressWarnings("unchecked")
    public List<Reader> getAllReaders() {
        try (Session session = getSession()) {
            return session.createQuery("from Reader").list();
        }
    }

    // Get All Subscriptions
    @SuppressWarnings("unchecked")
    public List<Subscription> getAllSubscriptions() {
        try (Session session = getSession()) {
            return session.createQuery("from Subscription").list();
        }
    }
}
