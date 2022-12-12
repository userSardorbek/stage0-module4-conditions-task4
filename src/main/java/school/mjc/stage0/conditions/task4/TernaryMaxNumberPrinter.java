package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int biggest;
        biggest = first >= second && first >= third ? first : 0;
        biggest = first <= second && second >= third ? second : biggest;
        biggest = third >= second && first <= third ? third : biggest;
        System.out.println(biggest);
    }
}
