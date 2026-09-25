public final class arqueros extends npc implements entrenar{

    private int flechas;

    public arqueros(String nombre, double hp, int flechas) {
        super(nombre, hp);
        this.flechas = flechas;
    }

    public int getFlechas() {
        return flechas;
    }

    public void setFlechas(int flechas) {
        this.flechas = flechas;
    }

    @Override
    public String toString() {
        return "soy un arquero " +
                "flechas=" + flechas +
                "} " + super.toString();
    }

    @Override
    public String entrenando() {
        return "estoy entrenando";
    }

    @Override
    public String mejorar_habilidad() {
        return "mejore mi habilidad a distancia";
    }

    @Override
    public String obtener_habilidar() {
        return "mi nombre es " + this.getNombre() + " y me especializo en el ataque a distancia.";
    }
}
