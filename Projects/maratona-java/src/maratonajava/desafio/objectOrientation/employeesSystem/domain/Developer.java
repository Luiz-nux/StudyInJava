package maratonajava.desafio.objectOrientation.employeesSystem.domain;

public class Developer extends Manager{
    protected String programingLanguage;

    public Developer(String name, int age, double salary, String department, String programingLanguage){
        super(name, age, salary, department);
        this.programingLanguage = programingLanguage;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("programing language: " + this.programingLanguage);
    }

    public String getProgramingLanguage() {
        return programingLanguage;
    }

    public void setProgramingLanguage(String programingLanguage) {
        this.programingLanguage = programingLanguage;
    }
}
