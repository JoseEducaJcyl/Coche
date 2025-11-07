// Clase Main con el metodo main para ejecutar el codigo
public class Main  {
	public static void main(String[] args) {
        //Declaramos dos objetos de la clase Coche, coche usando el constructor con sus atributos
        //y coche2 con un constructor vacio
        Coche coche = new Coche("marca1","modelo1",2000);
        Coche coche2 = new Coche();
        //Declaramos los atributos del objeto coche2
        //Asegurandonos que funciona la restriccion en setAnio()
        coche2.setMarca("marca2");
        coche2.setModelo("modelo2");
        coche2.setAnio(1884);
        System.out.println(coche.toString());
        System.out.println(coche2.toString());
    }
}