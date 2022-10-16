//En esta clase implementamos el interfaz CocheService

public class CocheServiceClassicImpl implements CocheService{
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche clásico");
        return new CocheElectrico();
    }
    
}
