public class PolimorfismoMain {
    public static void main(String[] args) {
    

        //Acá creamos objetos sin polimorfismo:
        Coche coche1 = new Coche();
        CocheElectrico coche2 = new CocheElectrico();

        //Con polimorfismo:
        //Tipo BASE    Tipo HIJO
        Coche coche3=new Coche();
        Coche coche4=new CocheElectrico();

        //Instance of comprueba si el objeto coche3 es una instancia de la clase Coche

        if (coche3 instanceof Coche){System.out.println("Coche");}
        if (coche4 instanceof Coche){System.out.println("CocheElectrico");}
    }
}
