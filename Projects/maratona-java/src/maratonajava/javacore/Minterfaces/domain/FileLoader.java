package maratonajava.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader, DataRemove{
    @Override
    public void load() {
        System.out.println("loading data from file");
    }

    @Override
    public void print() {
        System.out.println("Remove data from file");
    }

    @Override
    public void checkPermission() {
        System.out.println("checking permission in the file");
    }
}
