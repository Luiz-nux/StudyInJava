package desafios.javacore.oo.AiDesafios.varargs.domain;

public class Statistics {

    public void toAnalyze(int... numbers){
        if (numbers.length == 0){
            System.out.println("no number");
            return;
        }
        int sum = 0;
        double average = 0;
        int howManyNumbers = 0;
        int bigger = 0;
        int lower = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            howManyNumbers++;
            if (i == 0){
                bigger = numbers[0];
                lower = numbers[0];
            } else if (bigger < numbers[i]) {
                bigger = numbers[i];
            }
            if (lower > numbers[i]) {
                lower = numbers[i];
            }

        }
        average = (double) sum / numbers.length;
        System.out.println("amount = " + howManyNumbers);
        System.out.println("bigger = " + bigger);
        System.out.println("lower = " + lower);
        System.out.println("average = " + average);

    }
}
