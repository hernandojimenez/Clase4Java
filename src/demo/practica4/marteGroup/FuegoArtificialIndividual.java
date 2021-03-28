package demo.practica4.marteGroup;

public class FuegoArtificialIndividual extends FuegoArtificial{
    private String nombre;
    private int potencia;
    private String explosion;

    public FuegoArtificialIndividual(String nombre, int potencia, String explosion) {
        this.nombre = nombre;
        this.potencia = potencia;
        this.explosion = explosion;
    }

    public void agregarAListaDeFuegosArtificiales() {
        this.fuegosArtificiales.add(this);
    }

    @Override
    public void explotar() {
        System.out.println(this.explosion);
    }
}
