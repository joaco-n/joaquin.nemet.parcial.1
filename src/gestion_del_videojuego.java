import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.logging.XMLFormatter;

public class gestion_del_videojuego {

    //elegi ArrayDequeue por que te permite ver el contenido con un indice y solo permite modificar/eliminar el ultimo objeto agregado.
    private List<npc> entrenables;

    public gestion_del_videojuego() {
        this.entrenables = new LinkedList<>();
    }

    public List<npc> getEntrenables() {
        return entrenables;
    }

    public void agregar_personaje(npc personaje_nuevo){
        if (personaje_nuevo instanceof arqueros || personaje_nuevo instanceof guerrero ){
            entrenables.add(personaje_nuevo);
        } else {
            System.out.printf("el personaje no puede entrenar.");
        }
    }

    public String retornar_personaje(int indice){
        return entrenables.get(indice).toString();
    }

    public void mostrar_personajes(){
        for (int i = 0; i < entrenables.size(); i++) {
            System.out.println((i + 1) + ". " + entrenables.get(i));
        }
    }

    public void borrar_personaje(int indice){
        entrenables.remove(indice);
    }

    public String iniciar_combate(npc combatiente){
        String retorno = combatiente.obtener_habilidar();
        retorno += " y voy a iniciar el combate.";
        return retorno;
    }
}
