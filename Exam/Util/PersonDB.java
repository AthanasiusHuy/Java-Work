package Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Model.Person;

public abstract class PersonDB<P> {
    protected List<P> personList;

    public PersonDB() {
        personList = new ArrayList<>();
    }

    public abstract P getPerson();

    public void addPerson(P person) {
        personList.add(person);
    }

    public void printAllPersons() {
        System.out.println("\nPerson List:");
        for (P person : personList) {
            if (person instanceof Person) {
                ((Person) person).print();
                System.out.println();
            }
        }
    }

    public void sortByProperty(Comparator<P> comparator) {
        Collections.sort(personList, comparator);
    }
}
