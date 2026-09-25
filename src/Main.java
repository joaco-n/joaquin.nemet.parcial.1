void main() {

    /*//buscar metodos basandose en la clase.
System.out.print("Ingrese el ID del avión: ");
int idBuscado = teclado.nextInt();

avion avionEncontrado = null;
for (avion a : ezeiza.getAviones()) {
if (a.getId() == idBuscado) { // compara el ID
avionEncontrado = a;
break;
}
}

if (avionEncontrado != null) {
if (avionEncontrado instanceof avion_comercial) {
avion_comercial c = (avion_comercial) avionEncontrado;
System.out.println(((avion_comercial) avionEncontrado).comida());
System.out.println(c.mantas());
} else if (avionEncontrado instanceof avion_privado) {
avion_privado p = (avion_privado) avionEncontrado;
System.out.println("quieres ver tv?(y/n)");
char tv = teclado.nextLine().charAt(0);
System.out.println(p.comida());
System.out.println(p.mantas());
System.out.println("¿Se esta viendo tv?: " + p.tv(tv));
} else if (avionEncontrado instanceof avion_carga) {
avion_carga ca = (avion_carga) avionEncontrado;
System.out.println(ca.cargar());
System.out.println(ca.descargar());
} else if (avionEncontrado instanceof avion_militar) {
avion_militar m = (avion_militar) avionEncontrado;
System.out.println("Avión militar, no tiene métodos extra.");
}
} else {
System.out.println("No se encontró avión con ese ID.");
}
break;*/

    /*//agregar y eliminar algo dentro de un arraylist de una clase
public String agregar_aviones(avion avion){
if(avion.getId() + 1 > capacidad_de_operacion){
return "no hay capacidad para almacenar este avion";
} else {
aviones.add(avion);
avion.atterizar();
return "avion agregado: " + avion.toString();
}
}

public String eliminar_avion(int id){
avion aux = aviones.remove(id);
return "avion eliminado: " + aux.toString();
}*/

    /*//elegir algo dentro de una linkedlist y que se muestre.
@Override
public void reproducir() {
if (lista.isEmpty()) {
System.out.println("La lista está vacía.");
return;
}

Scanner sc = new Scanner(System.in);
System.out.println("Elija la canción a reproducir:");
for (int i = 0; i < lista.size(); i++) {
System.out.println((i + 1) + ". " + lista.get(i));
}

int opcion = sc.nextInt();
if (opcion < 1 || opcion > lista.size()) {
System.out.println("Opción inválida.");
return;
}

System.out.println("Reproduciendo: " + lista.get(opcion-1));
}*/

    /* //eliminar de una linkedlist
@Override
public void eliminar_cancion() {
if (lista.isEmpty()) {
System.out.println("No hay canciones para eliminar.");
return;
}

Scanner sc = new Scanner(System.in);
System.out.println("Elija la canción a eliminar:");
for (int i = 0; i < lista.size(); i++) {
System.out.println((i + 1) + ". " + lista.get(i));
}

int opcion = sc.nextInt();
if (opcion < 1 || opcion > lista.size()) {
System.out.println("Opción inválida.");
return;
}

lista.remove(opcion - 1);
System.out.println("Canción eliminada.");
}*/

/*//por si el usuario tiene que elegir cosas dentro de un enum
System.out.println("Ingrese el género (1. ROCK, 2. TRAP, 3. JAZZ, 4. HIPHOP, 5. POP, 6. METAL, 7. CLASICA):");
int genero = teclado.nextInt();
genero_musical genero2 = null;
teclado.nextLine();
switch (genero) {
case 1:
genero2 = genero_musical.ROCK;
break;
case 2:
genero2 = genero_musical.TRAP;
break;
case 3:
genero2 = genero_musical.JAZZ;
break;
case 4:
genero2 = genero_musical.HIP_HOP;
break;
case 5:
genero2 = genero_musical.POP;
case 6:
genero2 = genero_musical.METAL;
break;
case 7:
genero2 = genero_musical.CLASICA;
break;
default:
System.out.println("opcion invalida. seleccionando POP por defecto.");
genero2 = genero_musical.POP;
}*/

/*   Scanner teclado = new Scanner(System.in);

    boolean continuar = true;
    while (continuar) {
        System.out.println("Ingrese ejercicio a realizar (1-8):");
        int ejercicio = teclado.nextInt();
        teclado.nextLine();
        switch (ejercicio) {
            case 1:
            case 2:
            case 3:
                System.out.printf("cerrando el programa.");
                continuar = false;
                break;
            default:
                System.out.println("Ejercicio no encontrado.");
                break;

        }
    }*/


/*//recorrer un arraylist con for each
public static void mostrarLista(ArrayList lista) {
for (String s : lista) System.out.println(s);
}*/


    System.out.printf("a");









}
