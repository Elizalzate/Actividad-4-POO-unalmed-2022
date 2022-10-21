package Animales;

public class Prueba {
    public static void main(String[] args) {
       /* Gato miGato = new Gato();
        miGato.setAlimentos("ratones");
        miGato.imprimirInfo();

        Perro miPerro = new Perro();
        miPerro.imprimirInfo();

        Lobo miLobo = new Lobo();
        miLobo.imprimirInfo();

        Leon miLeon = new Leon();
        miLeon.imprimirInfo();*/

        Animal[] animales = new Animal[4];
        animales[0] = new Gato();
        animales[1] = new Perro();
        animales[2] = new Lobo();
        animales[3] = new Leon();
        for (Animal animale : animales) {
            System.out.println(animale.getNombreCientifico());
            System.out.println("Sonido: " + animale.getSonido());
            System.out.println("Alimentos: " + animale.
                    getAlimentos());
            System.out.println("Hábitat: " + animale.getHabitat());
            System.out.println();
        }

        }

}
