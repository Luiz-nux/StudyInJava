package maratonajava.javacore.AATestEnum.domain;

public enum Type {
    BUGATTI("rich", 250,"Bugatti"){
        public void print(){
            System.out.println("this car is for rich and fast");
        }
    },
    CHEVROLET("comfort", 200, "Chevrolet"){
        public void print(){
            System.out.println("this car is comfort but slower");
        }
    },
    FERRARI("running", 300, "Ferrari"){
        public void print(){
            System.out.println("this car is death speed");
        }
    };

    String style;
    int speed;
    String reportValue;

    Type(String style, int speed, String reportValue) {
        this.style = style;
        this.speed = speed;
        this.reportValue = reportValue;

    }

    public static Type typeCar(String typeCar){
        for (Type t: values()){
            if (t.reportValue.equalsIgnoreCase(typeCar)){
                return t;
            }
        }
        return null;
    }

    public abstract void print();
}
