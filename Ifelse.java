class Ifelse {
    public static void main(String[] args) {
        // boolean check = 5 < 10;
        int number1 = 50;
        int number2 = 2;
        int number3 = 10;
        int number4 = 100;

        if (number1 < number2 && number2 < number3) {

            System.out.println("Verdadero");
        }

        else if (number4 > number3) {
            System.out.println("Else if");}

        else {
            System.out.println("Falso");

        }
        System.out.println("Fin");
    }
}