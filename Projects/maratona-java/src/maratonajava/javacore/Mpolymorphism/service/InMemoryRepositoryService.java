package maratonajava.javacore.Mpolymorphism.service;

import maratonajava.javacore.Mpolymorphism.repository.Repository;

public class InMemoryRepositoryService implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in the memory");
    }
}
