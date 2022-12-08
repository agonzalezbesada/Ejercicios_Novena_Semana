/**
 * Ejercicio Novena Semana: Main
 * @author Adrián
 * @version 1.0
 */
public class Main {
    /**
     * Realiza las llamadas
     * @param args
     */
    public static void main(String [] args){

        Perro perro1 = new Perro(); //Ejercicio2
        Perro perro2 = new Perro(); //Ejercicio7 1/2
        Perro perro3 = new Perro();

        // Ejercicio1
        perro1.setPelo("corto");
        perro1.setColor("negro");
        perro1.setChip(50);



        /*
        Ejercicio3 2/2

        Al poner los atributos en privado, a este punto no ocurre nada, ya que aunque ahora son privados y no pueden ser accedidos directamente
        desde el main, las funciones que son llamadas si tienen acceso a esos métodos y así pueden ser recibidos igualmente por el main.
        */

        //Ejercicio4 2/2
        perro1.setPelo("corto");
        perro1.setColor("negro");
        perro1.setChip(50);




        perro1.setPelo("largo");
        perro1.setColor("blanco");
        perro1.setChip(1);
        perro1.setPeso(9);
        perro1.setAltura(14);

        perro2.setPelo("corto");
        perro2.setColor("negro");
        perro2.setChip(2);
        perro2.setPeso(10);
        perro2.setAltura(15);

        perro3.setPelo("calvo");
        perro3.setColor("inexistente");
        perro3.setChip(3);
        perro3.setPeso(15);
        perro3.setAltura(20);


        Perro [] perros= new Perro[3]; //Ejercicio7 2/2

        perros[0]=perro1;
        perros[1]=perro2;
        perros[2]=perro3;


        //Ejercicio8
        for (int i = 0; i < perros.length;i++){
            System.out.println(perros[i].ladrar());
        }
    }
}