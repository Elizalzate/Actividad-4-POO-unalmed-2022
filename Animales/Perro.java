package Animales;

public class Perro extends Canido{

    private void setNombreCientifico() {
        this.nombreCientifico = "Canis lupus familiaris";
    }

    private void setSonido() {
        this.sonido = "Ladrido - Woff, woff";
    }

    private void setAlimentos() {
        this.alimentos = "Carnívoro principalmente";
    }

    private void setHabitat() {
        this.habitat = "Doméstico";
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
        System.out.println("\nPerro\nNombre cientifico: " + getNombreCientifico() +
                "\nSu habitat es: " + getHabitat() +
                "\nSu alimentación está basada en: " + getAlimentos() +
                "\nSonido: " + getSonido());
    }
}
