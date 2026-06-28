package maratonajava.javacore.Mpolymorphism.test;

import maratonajava.javacore.Mpolymorphism.repository.Repository;
import maratonajava.javacore.Mpolymorphism.service.DatabaseRepositoryService;
import maratonajava.javacore.Mpolymorphism.service.FileRepositoryService;
import maratonajava.javacore.Mpolymorphism.service.InMemoryRepositoryService;

import java.util.ArrayList;
import java.util.List;

public class RepositoryTest01 {
    public static void main(String[] args) {
        Repository repository = new InMemoryRepositoryService();
        repository.save();
        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("Goten");
        list.add("N18");
        System.out.println(list);
    }
}