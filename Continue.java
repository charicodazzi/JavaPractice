public class Continue {
    public static void main(String[] args) {

        int count = 0;

        while (count < 10) {
            count++;
            if (count == 6)
                continue;
            System.out.println("Hola mundo" + count);
        }
        System.out.println("fin");
    }
}
//Lo que hace continue, es que cuando se cumple la condicion de count=6 se saltea esa vuelta, y sigue iterando (en cambio con break no)