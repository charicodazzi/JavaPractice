public class CocheElectrico extends Coche {

    String motorElectrico;

    public CocheElectrico() {
    }

    public CocheElectrico(String motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

//super nos permite invocar a un constructor de la clase superior (en este caso de coche)
    public CocheElectrico(String color, String fabricante, String modelo, Double peso, Integer velocidad, String motorElectrico){
        //Acá super llama al constructor de Coche, y lo que hacemos es terminar de asginar una propiedad (motorElectrico) que no estaba asignada
        super(color, fabricante, modelo, peso, velocidad);
        this.motorElectrico=motorElectrico;
    }
}
