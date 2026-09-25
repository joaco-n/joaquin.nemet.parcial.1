void main() {

    gestion_del_videojuego gestion = new gestion_del_videojuego();
    npc arquero_1 = new arqueros("legolas", 150, 10);
    npc arquero_2 = new arqueros("link", 125, 10);
    npc guerrero_1 = new guerrero("cloud strife", 200, "legion del fin del mundo");
    npc guerrero_2 = new guerrero("kratos", 210, "legion dorada");
    npc escudero_1 = new escudero("steve rogers", 400, 200);
    npc escudero_2 = new escudero("reinhardt", 500, 300);
    npc dragon_1 = new dragones("pollux", 666);
    npc dragon_2 = new dragones("smaug", 800);

    System.out.printf(arquero_1.toString() + "\n");
    System.out.printf(arquero_1.obtener_habilidar() + "\n");
    System.out.printf("estoy entrenando." + "\n");
    System.out.printf("mejore mi habilidad a distancia" + "\n");

    System.out.printf(arquero_2.toString() + "\n");
    System.out.printf(arquero_2.obtener_habilidar() + "\n");
    System.out.printf("estoy entrenando." + "\n");
    System.out.printf("mejore mi habilidad a distancia" + "\n");

    System.out.printf(guerrero_1.toString() + "\n");
    System.out.printf(guerrero_1.obtener_habilidar() + "\n");
    System.out.printf("estoy entrenando." + "\n");
    System.out.printf("mejore mi habilidad cuerpo a cuerpo" + "\n");

    System.out.printf(guerrero_2.toString() + "\n");
    System.out.printf(guerrero_2.obtener_habilidar() + "\n");
    System.out.printf("estoy entrenando." + "\n");
    System.out.printf("mejore mi habilidad cuerpo a cuerpo" + "\n");

    System.out.printf(escudero_1.toString() + "\n");
    System.out.printf(escudero_1.obtener_habilidar() + "\n");

    System.out.printf(escudero_2.toString() + "\n");
    System.out.printf(escudero_2.obtener_habilidar() + "\n");

    System.out.printf(dragon_2.toString() + "\n");
    System.out.printf(dragon_2.obtener_habilidar() + "\n");

    System.out.printf(dragon_1.toString() + "\n");
    System.out.printf(dragon_1.obtener_habilidar() + "\n");

    gestion.agregar_personaje(arquero_1);
    gestion.agregar_personaje(arquero_2);
    gestion.agregar_personaje(guerrero_1);
    gestion.agregar_personaje(guerrero_2);
    gestion.mostrar_personajes();
    System.out.printf(gestion.iniciar_combate(guerrero_2) + "\n");
    System.out.printf("cantidad de dragones: " + 2 + "\n");



}
