package org.es4j.eventstore.example;


public class SomeDomainEvent {
    
    final String value;
    
    public SomeDomainEvent(String value) {
        this.value = value;
    }

    String getValue() {
        return value;
    }
}
