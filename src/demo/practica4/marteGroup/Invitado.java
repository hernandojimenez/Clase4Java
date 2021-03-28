package demo.practica4.marteGroup;

public class Invitado {
    private String nombre;
    private boolean tieneTorta = false;

    public Invitado(String nombre) {
        this.nombre = nombre;
    }

    public void degustarTorta() throws InterruptedException {
        this.tieneTorta = true;
    }
}
