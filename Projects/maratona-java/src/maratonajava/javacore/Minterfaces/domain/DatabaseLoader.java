package maratonajava.javacore.Minterfaces.domain;

public class  DatabaseLoader implements DataLoader, DataRemove{

    @Override
    public void load() {
        System.out.println("Loading data from database");
    }

    @Override
    public void print() {
        System.out.println("Remove data from database");
    }

    @Override
    public void checkPermission() {
        System.out.println("checking permission in the database");
    }


    public static void retrieveMaxDataSize(){
        System.out.println("inside retrieveMaxDataSize in the DatabaseLoader");
    }
}
