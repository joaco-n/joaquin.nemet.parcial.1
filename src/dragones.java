public final class dragones extends npc{

    private static int cantidad_dragones = 0;

    public dragones(String nombre, double hp) {
        super(nombre, hp);
        cantidad_dragones++;
    }

    public static int getCantidad_dragones() {
        return cantidad_dragones;
    }

    @Override
    public String toString() {
        return "soy un dragon" + super.toString();
    }

    @Override
    public String obtener_habilidar() {
        return "mi nombre es " + this.getNombre() + "y me especializo en el ataque con fuego.";
    }
}
