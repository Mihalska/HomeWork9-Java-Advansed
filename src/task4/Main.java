package task4;

public class Main {
    public static void main(String[] args) {
        try {
            Operation sum = (x, y) -> x + y;
            Operation sub = (x, y) -> x - y;
            Operation mul = (x, y) -> x * y;
            Operation div = (x, y) -> x / y;

            int resultSum = sum.calculate(10, 20);
            int resultSub = sub.calculate(20, 10);
            int resultMul = mul.calculate(10, 20);
            int resultDiv = div.calculate(20, 10);

            System.out.println("Основні арифметичні дії калькулятора:");
            System.out.println("\tдодавання (числа 10 та 20), результат = " + resultSum);
            System.out.println("\tвіднімання (числа 20 та 10), результат = "+ resultSub);
            System.out.println("\tмноження (числа 10 та 20), результат = "+ resultMul);
            System.out.println("\tділення (числа 20 та 10), результат = " + resultDiv);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

interface Operation {
    int calculate(int x, int y);
}
