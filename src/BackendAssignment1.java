public class BackendAssignment1 {
    public static void main(String[] args) {

        hello();
        positiveOrNegative(5);

        positiveOrZeroOrNegative(-5);

        bartender(4);

        sum(12, 12);




    }
    public static void hello () {
        System.out.println("Hello");
    }

    public static void positiveOrNegative (int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else {
            System.out.println("This number is negative!");
        }
    }

    public static void positiveOrZeroOrNegative (int zeronumber) {
        if (zeronumber > 0) {
            System.out.println("This number is positive!");
        } else if (zeronumber < 0) {
            System.out.println("This number is negative!");
        } else {
            System.out.println("This number is zero!");
        }
    }

    public static void bartender (int name) {
        switch (name) {
            case 1:
                System.out.println("Strawberry Daiquiri");
                break;
            case 2:
                System.out.println("Long Island Icetea");
                break;
            case 3:
                System.out.println("Mojito");
                break;
            case 4:
                System.out.println("Redbull Wodka");
                break;
            case 5:
                System.out.println("Piña Colada");
        }
    }

    public static void sum (int input1, int input2) {
        System.out.println(input1 + " summed by " + input2 +" = 24");
    }
}