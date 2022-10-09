//Creamos un objeto

public class CocheMain {
    public static void main(String[] args) {
        String coche = "alfa romeo";
        // Acá estamos creando un objeto Coche, que va a tener los atributos que
        // habiamos creado en Coche.java
        Coche cocheObj = new Coche();
        Coche cocheObj2 = new Coche("rojo", "honda", "civic", 1430.50, 43);

        cocheObj2.acelerar(50);
        System.out.println(cocheObj2);

        cocheObj2.peso = 1300.20;
        System.out.println(cocheObj2);
        CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.motorElectrico = "Modelo de motor";
        cocheElectrico.color = "AZUL";
        cocheElectrico.fabricante = "Peugeot";
        cocheElectrico.peso = 1600.31;
        System.out.println(cocheElectrico);
    }
}
