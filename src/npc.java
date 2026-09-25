import java.util.Objects;

public abstract class npc {

    private String nombre;
    private double hp;

    public npc(String nombre, double hp) {
        this.nombre = nombre;
        this.hp = hp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "npc{" +
                "nombre='" + nombre + '\'' +
                ", hp=" + hp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        npc npc = (npc) o;
        return Objects.equals(nombre, npc.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    public abstract String obtener_habilidar();
}
