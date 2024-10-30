package org.example.model;

import jakarta.persistence.*;
import org.example.model.Reader;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "subscriptions")
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int subscriptionId;

    private String subscriptionName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "reader_subscription",
            joinColumns = @JoinColumn(name = "subscription_id"),
            inverseJoinColumns = @JoinColumn(name = "reader_id")
    )
    private Set<Reader> readers = new HashSet<>();

    public Subscription() {}

    public Subscription(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    // Getters and Setters
    public int getSubscriptionId() { return subscriptionId; }
    public void setSubscriptionId(int subscriptionId) { this.subscriptionId = subscriptionId; }

    public String getSubscriptionName() { return subscriptionName; }
    public void setSubscriptionName(String subscriptionName) { this.subscriptionName = subscriptionName; }

    public Set<Reader> getReaders() { return readers; }
    public void setReaders(Set<Reader> readers) { this.readers = readers; }
}
