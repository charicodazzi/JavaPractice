public class Break {
    public static void main(String[] args) {

        int count = 0;

        while (count < 10) {
            count++;
            if (count == 6)
                break;
            System.out.println("Hola mundo" + count);
        }
        System.out.println("fin");
    }
}
// Acá con Break rompe el flujo de ejecución o bucle y no sigue iterando