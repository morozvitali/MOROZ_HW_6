package hw;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(compareSum(10, 2));
        compareZero(0);
        System.out.println(searchNegative(-5));
        System.out.println(intercalary(2022));
    }

    private static void printThreeWords() {    //2
        System.out.println( "Orange\n" + "Banana\n" +  "Apple"); }

    public static void checkSumSign() {     //3
        String sumPositive = "Сума позитивна";
        String sumNegative = "Сума негативна";

        int a = (int) (Math.random() * 20 - 10);
        int b = (int) (Math.random() * 20 - 10);

        System.out.print("[" + (a + b) + "] ");

        System.out.println(((a + b) >= 0) ? sumPositive : sumNegative);
    }

    public static void printColor() {      //4
        String redMessage = "Червоний";
        String yellowMessage = "Жовтий";
        String greenMessage = "Зелений";

        int value = (int) (Math.random() * 300 - 150);

        System.out.print("[" + value + "] ");

        if (value <= 0) {
            System.out.println(redMessage);
        } else if (value > 0 && value <= 100) {
            System.out.println(yellowMessage);
        } else {
            System.out.println(greenMessage);
        }

    }

    public static void compareNumbers() {   //5
        String compareA = "a >= b";
        String compareB = "a < b";

        int a = (int) (Math.random() * 20 - 10);
        int b = (int) (Math.random() * 20 - 10);

        System.out.print("[" + a + "][" + b + "] ");

        System.out.println(a > b ? compareA : compareB);
    }


    public static boolean compareSum(int a, int b) {  //6

        if (((a + b) < 20) && ((a + b) > 10)) {
            return true;
        } else {
            return false;
        }

    }

    public static void compareZero(int a) {    // 7
        String negative = "Число а від'ємне";
        String positive = "Число а позитивне";

        System.out.println((a < 0) ? negative : positive);
    }


    public static boolean searchNegative(int a) { //8
        return (a < 0) ? true : false;
    }


    public static void printString(String textForPrint, int value) {  //9
        for (int i = 0; i < value; i++) {
            System.out.println(textForPrint);
        }
    }


    public static boolean intercalary(int year) {     //10
        if (year % 400 == 0) {
            return true;
        }

        if ((year % 4 == 0) && (year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }


}