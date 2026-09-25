public final class escudero extends npc {

    private double escudo_vida;

    public escudero(String nombre, double hp, double escudo_vida) {
        super(nombre, hp);
        this.escudo_vida = escudo_vida;
    }

    public double getEscudo_vida() {
        return escudo_vida;
    }

    public void setEscudo_vida(double escudo_vida) {
        this.escudo_vida = escudo_vida;
    }

    @Override
    public String toString() {
        return "soy un escudero " +
                "escudo_vida=" + escudo_vida +
                "} " + super.toString();
    }

    @Override
    public String obtener_habilidar() {
        return "mi nombre es " + this.getNombre() + " y me especializo en la defensa.";
    }
}
