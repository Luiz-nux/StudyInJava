package maratonajava.javacore.Mpolymorphism.service;

import maratonajava.javacore.Mpolymorphism.repository.Repository;

public class FileRepositoryService implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in the a file");
    }
}
