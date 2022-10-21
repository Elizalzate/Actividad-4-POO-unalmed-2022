package Animales;

public class Lobo extends Canido{
    private void setSonido() {
        this.sonido = "Aullido - auuuu";
    }
    private void setHabitat() {
        this.habitat = "Bosque";
    }

    private void setAlimentos() {
        this.alimentos = "Carne - carnívoro";
    }

    private void setNombreCientifico() {
        this.nombreCientifico = "Canis lupus";
    }


    @Override
    public String getNombreCientifico() {
        setNombreCientifico();
        return nombreCientifico;
    }

    @Override
    public String getSonido() {
        setSonido();
        return sonido;
    }

    @Override
    public String getAlimentos() {
        setAlimentos();
        return alimentos;
    }

    @Override
    public String getHabitat() {
        setHabitat();
        return habitat;
    }

    void imprimirInfo(){
        System.out.println("\n" + getNombreCientifico() +
                " también conocido como Lobo" +
                "\nSonido: " + getSonido()+
                "\nSu habitat es: " + getHabitat() +
                "\nSu alimentación está basada en: " + getAlimentos() );
    }
}
