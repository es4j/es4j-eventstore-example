package org.es4j.eventstore.example;


public class AggregateMemento {
    private String value; // { get; set; }

    @Override
    public String toString() {
        return this.value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }    
}
