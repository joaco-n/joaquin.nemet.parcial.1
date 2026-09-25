public final class guerrero extends npc implements entrenar{

    private String legion;

    public guerrero(String nombre, double hp, String legion) {
        super(nombre, hp);
        this.legion = legion;
    }

    public String getLegion() {
        return legion;
    }

    public void setLegion(String legion) {
        this.legion = legion;
    }

    @Override
    public String toString() {
        return "soy un guerrero " +
                "legion='" + legion + '\'' +
                "} " + super.toString();
    }

    @Override
    public String entrenando() {
        return "estoy entrenando";
    }

    @Override
    public String mejorar_habilidad() {
        return "mejore mi habilidad cuerpo a cuerpo";
    }

    @Override
    public String obtener_habilidar() {
        return "mi nombre es " + this.getNombre() + " y me especializo en el ataque cuerpo a cuerpo.";
    }
}
