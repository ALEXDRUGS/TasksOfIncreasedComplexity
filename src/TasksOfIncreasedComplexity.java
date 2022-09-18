public class TasksOfIncreasedComplexity {
    //1.2 Переменные
    //Задача 6, повышенная сложность
    public static void main(String[] args) {
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        System.out.println( result + " -> " + Math.abs(result));
    }
}