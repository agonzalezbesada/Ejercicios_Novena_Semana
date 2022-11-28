public class Main {

    public static void main(String [] args){
        Perro perro1 = new Perro();

        perro1.setPelo("Corto");
        perro1.setColor("Negro");
        perro1.setChip(50);

        /*
        Al poner los atributos en privado, a este punto no ocurre nada, ya que aunque ahora son privados y no pueden ser accedidos directamente
        desde el main, las funciones que son llamadas si tienen acceso a esos métodos y así pueden ser recibidos igualmente por el main.
        */

        perro1.setPelo("Largo");
        perro1.setColor("Blanco");
        perro1.setChip(25);
        
        System.out.println("El perro 1 tiene "+"el pelo "+perro1.getPelo()+" de color "+perro1.getColor()+" y el número de chip "+perro1.getChip());







    }

}