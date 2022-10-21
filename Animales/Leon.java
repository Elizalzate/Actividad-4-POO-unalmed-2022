package Animales;

public class Leon extends Felino{
    private void setSonido() {
        this.sonido = "Rugido - grrr";
    }
    private void setHabitat() {
        this.habitat = "Pradera";
    }

    private void setAlimentos() {
        this.alimentos = "Carne - carnívoro";
    }

    private void setNombreCientifico() {
        this.nombreCientifico = "Panthera leo";
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
                " también conocido como León" +
                "\nSonido: " + getSonido()+
                "\nSu habitat es: " + getHabitat() +
                "\nSu alimentación está basada en: " + getAlimentos() );
    }
}
