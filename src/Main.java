public class Main {
    public static void main(String[] args) {

        //Задание 1
        for (var i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Задание 2
        for (var a = 10; a <= 10 && a > 0; a = a - 1) {
            System.out.println(a);
        }

        //Задание 3
        for (var b = 2; b <= 17 && b >= 0; b = b + 2) {
            System.out.println(b);
        }

        //Задание 4
        for (var c = 10; c <= 10 && c > -11; c = c - 2) {
            System.out.println(c);
        }

        //Задание Б1
        for (var d = 1904; d <= 2096; d = d + 4) {
            System.out.println(d);
        }

        //Задание Б2
        var x = 7;
        var y = 0;
        for (var e = 1; e <= 14; e++) {
            y = x * e;
            System.out.println(y);
        }

        //Задание Б3
        for (var f = 1; f <= 512; f = f * 2) {
            System.out.println(f);
        }

        //Задание В1
        var asalary = 29000;
        var atotalSalary = 0;
        for (var g = 1; g <= 12; g++) {
            atotalSalary = atotalSalary + asalary;
            System.out.println("Месяц " + g + ", сумма накоплений равна " + atotalSalary + " рублей");
        }

        //Задание В2
        var salary = 29000;
        var totalSalary = 0;
        for (var g = 1; g <= 12; g++) {
            totalSalary = totalSalary + totalSalary / 100;
            totalSalary = totalSalary + salary;
            System.out.println("Месяц " + g + ", сумма накоплений равна " + totalSalary + " рубле");
        }
    }
}