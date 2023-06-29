import java.util.*;

import static java.util.Comparator.*;

public class Main {
    protected static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();
//        task11();
        task12();
    }

    public static int[] getRandArray(int size){
        Random rnd = new Random();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = rnd.nextInt(-50, 50);
        }

        return arr;
    }

    public static int[] pushToArray(int[] arr, int n){
        int[] tmp = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }

        tmp[arr.length] = n;

        return tmp;
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("\n\n");
    }

    public static void printLine(int length, boolean isStraight, char symbol){
        System.out.println("\n\n");
        for (int i = 0; i < length; i++) {
            if(isStraight){
                System.out.print(symbol);
            }
            else{
                System.out.println(symbol);
            }
        }
    }

    public static int[] sort(int[] arr, boolean isDesc){
        int[] tmp = arr.clone();

        Arrays.sort(tmp);

        if(isDesc){
            int n = tmp.length;

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i -1; j++) {
                    if(tmp[j] < tmp[j + 1]){
                        int x = tmp[j];
                        tmp[j] = tmp[j + 1];
                        tmp[j + 1] = x;
                    }
                }
            }
        }


        return tmp;
    }




    public static void task1(){
        System.out.println("\n\nЗавдання 1:");
        System.out.println("Вивести на екран надпис \"Your time is limited, so don’t waste it living someone else’s life\" Steve Jobs\n" +
                "в різних рядках. Приклад виводу:\n" +
                "“Your time is limited,\n" +
                "so don’t waste it\n" +
                "living someone else’s life”\n" +
                "Steve Jobs\n");

        System.out.println("“Your time is limited, ");
        System.out.println("\tso don’t waste it ");
        System.out.println("\t\tliving someone else’s life”");
        System.out.println("\t\t\tSteve Jobs");
    }

    public static void task2(){
        System.out.println("\n\nЗавдання 2:");
        System.out.println("Користувач вводить з клавіатури два числа. Перше число — це значення, друге число — відсоток,\n" +
                "який необхідно підрахувати. Наприклад, ми ввели з клавіатури 50 і 10. Потрібно вивести на екран\n" +
                "10 відсотків від 50. Результат — 5.");

        int num = 0;
        int percent = 0;

        System.out.println("Enter a num: ");
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        }

        System.out.println("Enter a percent:");
        if(scanner.hasNextInt()){
            percent = scanner.nextInt();
        }

        System.out.println(num*percent/100);
    }

    public static void task3(){
        System.out.println("\n\nЗавдання 3:\n");
        System.out.println("Користувач вводить з клавіатури 3 числа. Необхідно створити число, що містить ці числа.\n" +
                "Наприклад, якщо з клавіатури введено 7, 3, 8, тоді потрібно сформувати число 738.");

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Enter first num:");
        if (scanner.hasNextInt()){
            num1 = scanner.nextInt();
        }

        System.out.println("Enter second num: ");
        if(scanner.hasNextInt()){
            num2 = scanner.nextInt();
        }

        System.out.println("Enter third num:");
        if(scanner.hasNextInt()){
            num3 = scanner.nextInt();
        }

        int num = num1*100 + num2*10 + num3;

        System.out.println(num);
    }

    public static void task4(){
        System.out.println("\n\nЗавдання 4:");
        System.out.println("Користувач вводить шестизначне число. Необхідно змінити в цьому числі перше і шосте число, а\n" +
                "також друге і п’яте число. Наприклад, 723895 повинно перетворитися на 593827\n" +
                "Якщо користувач ввів не шестизначне число потрібно вивести повідомлення про помилку.");

        int num;
        do{
            System.out.println("Enter a 6-digits number:");
            if(scanner.hasNextInt()){
                num = scanner.nextInt();

                if(num >= 10000 && num <= 999999){
                    break;
                }
            }
            System.out.println("Error!");
        }while (true);

        String string = "" + num;

        char char1 = string.charAt(5);
        char char2 = string.charAt(4);
        char char3 = string.charAt(2);
        char char4 = string.charAt(3);
        char char5 = string.charAt(1);
        char char6 = string.charAt(0);

        string = "";
        string +=char1;
        string +=char2;
        string +=char3;
        string +=char4;
        string +=char5;
        string +=char6;

        num = Integer.parseInt(string);

        System.out.println(num);
    }

    public static void task5(){
        System.out.println("\n\nЗавдання 5:");
        System.out.println("Користувач вводить з клавіатури номер місяця(1-12). В залежності від отриманого номера програма\n" +
                "виводить на екран надпис : Winter (якщо введене значення 1,2 або 12), Spring (якщо введене значення від\n" +
                "3 до 5), Summer (якщо введене значення від 6 до 8), Autumn (якщо введене значення від 9 до 11).\n" +
                "Якщо користувач ввів значення не в діапазоні від 1 до 12 потрібно вивести повідомлення про помилку.");

        int num = 0;

        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        }

        if(num == 1 || num == 2 || num == 12){
            System.out.println("Winter");
        } else if (num >= 3 && num <= 5) {
            System.out.println("Spring");
        } else if (num >= 6 && num <= 8) {
            System.out.println("Summer");
        } else if (num >= 9 && num <= 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Error");
        }
    }

    public static void task6(){
        System.out.println("\n\nЗавдання 6:");
        System.out.println("Користувач вводить з клавіатури кількість метрів. В залежності від вибору користувача програма\n" +
                "переводить метри в милі, дюйми чи ярди");

        int m = 0;

        if(scanner.hasNextInt()){
            m = scanner.nextInt();
        }

        System.out.println(m + " m = "+ m*0.000621371 + " miles");
        System.out.println(m + " m = "+ m*39.3701 + " inches");
        System.out.println(m + " m = "+ m*1.09361 + " yards");
    }

    public static void task7(){
        System.out.println("\n\nЗавдання 7:");
        System.out.println("Користувач вводить з клавіатури два числа. Потрібно вивести всі непарні числа в вказаному\n" +
                "діапазоні. Якщо границі вказані не вірно потрібно провести нормалізацію границь. Наприклад,\n" +
                "якщо ввели 20 і 11, потрібна нормалізація, після якої початок стане рівним 11, а кінець 20.\n");

        int begin = 0;
        int end = 0;

        System.out.println("Enter begin:");
        if(scanner.hasNextInt()){
            begin = scanner.nextInt();
        }

        System.out.println("Enter end:");
        if(scanner.hasNextInt()){
            end = scanner.nextInt();
        }

        if(begin > end){
            int tmp = begin;
            begin = end;
            end = tmp;
        }

        for(int i = begin; i <= end; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    public static void task8(){
        System.out.println("\n\nЗавдання 8:");
        System.out.println("Показати на екрані таблицю множення в діапазоні, вказаному користувачем. Наприклад, якщо\n" +
                "користувач вказав 3 і 5, таблиця може виглядати так\n" +
                "3*1 = 3 3*2 = 6 3*3 = 9 ………… 3* 10 = 30\n" +
                "……………………………………………………\n" +
                "5*1 = 5 5 *2 = 10 5 *3 = 15 ………….");


        int begin = 0;
        int end = 0;
        System.out.println("Enter begin:");
        if(scanner.hasNextInt()){
            begin = scanner.nextInt();
        }

        System.out.println("Enter end:");
        if(scanner.hasNextInt()){
            end = scanner.nextInt();
        }

        for(int i = begin; i <= end; i++){
            System.out.println("\n*********************");
            for(int j = 1; j <= 10; j++){
                System.out.print(i+"*"+j+" = "+i*j+"  ");
            }
        }
        System.out.println("\n*********************");
    }

    public static void task9(){
        System.out.println("\n\nЗавдання 9:");
        System.out.println("В одномірному масиві, заповненому випадковими числами, визначаємо мінімальне і\n" +
                "максимальне значення, підраховуємо кількість від’ємних значень, підраховуємо кількість\n" +
                "додатних значень, підраховуємо кількість нулів. Результат виводимо на екран.");

        int size = 0;
        System.out.println("Enter a size of array:");
        if (scanner.hasNextInt()){
            size = scanner.nextInt();
        }

        int[] arr = getRandArray(size);

        int min = arr[0];
        int max = arr[0];
        int neg = 0;
        int pos = 0;
        int nul = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > 0){
                pos++;
            }
            if (arr[i] < 0){
                neg++;
            }
            if(arr[i] == 0){
                nul++;
            }
            System.out.println(arr[i]);
        }

        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
        System.out.println("Negative: "+neg);
        System.out.println("Positive: "+pos);
        System.out.println("Zero: "+nul);
    }

    public static void task10(){
        System.out.println("\n\nЗавдання 10:");
        System.out.println("Маємо одновимірний масив, заповнений випадковими числами. На основі даних масиву\n" +
                "потрібно:\n" +
                "\uF0B7 Створити одновимірний масив, що містить лише парні числа з першого масиву\n" +
                "\uF0B7 Створити одновимірний масив, що містить лише непарні числа з першого масиву\n" +
                "\uF0B7 Створити одновимірний масив, що містить лише від’ємні числа з першого масиву\n" +
                "\uF0B7 Створити одновимірний масив, що містить лише додатні числа з першого масиву");

        int size = 0;
        System.out.println("Enter size of array:");
        if(scanner.hasNextInt()){
            size = scanner.nextInt();
        }

        int[] arr = getRandArray(size);

        int[] pairs = new int[]{};
        int[] non_pairs = new int[]{};
        int[] neg = new int[]{};
        int[] pos = new int[]{};

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
               pairs = pushToArray(pairs, arr[i]);
            }
            else{
                non_pairs = pushToArray(non_pairs, arr[i]);
            }
            if(arr[i] > 0){
                pos = pushToArray(pos, arr[i]);
            }
            if(arr[i] < 0){
                neg = pushToArray(neg, arr[i]);
            }
        }

        System.out.println("Pairs");
        printArray(pairs);

        System.out.println("Non pairs");
        printArray(non_pairs);

        System.out.println("Negatives");
        printArray(neg);

        System.out.println("Positives");
        printArray(pos);
    }

    public static void task11(){
        System.out.println("\n\nЗавдання 11:\n");
        System.out.println("Написати метод, що відображає вертикальну або горизонтальну лінію із деяких символів. Метод приймає\n" +
                "в якості параметрів: довжину лінії, напрям, символ.\n");

        printLine(10,false,'*');
    }

    public static void task12(){
        System.out.println("\n\nЗавдання 12:\n");
        System.out.println("Написати метод, що сортує масив по спаданню або зростанню в залежності від вибору\n" +
                "користувача");

        int size = 0;
        System.out.println("Enter a size of array:");
        if(scanner.hasNextInt()){
            size = scanner.nextInt();
        }

        int[] arr = sort(getRandArray(size),false);

        System.out.println(Arrays.toString(arr));
    }
}