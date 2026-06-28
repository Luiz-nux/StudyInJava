package desafios.javacore.oo.AiDesafios.varargs.domain;

public class RetestStatistics {

    public void toAnalyze(int... numbers){
        if (numbers.length == 0){
            System.out.println("no number");
            return;
        }
        int sum = 0;
        int amount = 0;
        double avarege = 0;
        int bigger = numbers[0];
        int lower = numbers[0];

        for (int num: numbers){
            sum += num;
            if (bigger < num){
                bigger = num;
            }
            if (lower > num){
                lower = num;
            }
        }
        avarege = (double) sum / numbers.length;
        System.out.println("amount = " + numbers.length);
        System.out.println("bigger = " + bigger);
        System.out.println("lower = " + lower);
        System.out.println("avarege = " + avarege);
    }
}
