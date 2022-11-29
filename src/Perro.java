public class Perro {

    // Ejercicio3 1/2
    private String pelo;
    private String color;
    private int chip;

    //Ejercicio5 1/2
    private int peso;
    private int altura;


    //Ejercicio4 1/2 & Ejercicio5 2/2
    public String getPelo(){
        return pelo;
    }

    public void setPelo(String pelo){
        this.pelo = pelo;
    }


    public String getColor(){
        return color;
    }


    public void setColor(String color){
        this.color = color;
    }


    public int getChip(){
        return chip;
    }


    public void setChip(int chip){
        this.chip = chip;
    }


    public int getPeso(){
        return peso;
    }


    public void setPeso(int peso){
        this.peso = peso;
    }


    public int getAltura(){
        return altura;
    }


    public void setAltura(int altura){
        this. altura = altura;
    }

    public static void cosa() {

    }


    //Ejercicio 6
    public String ladrar(){
        String ladrido="";

        if (peso<10 && altura<15){
            ladrido="Guau!";

        }if (peso==10 && altura==15){
            ladrido="GUAU!!";

        }if (peso>10 && altura>15){
            ladrido="GUUAUU!!!";
        }

        return ladrido;
    }
}
