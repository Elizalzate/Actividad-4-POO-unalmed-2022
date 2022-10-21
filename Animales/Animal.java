package Animales;

public class Animal implements IAnimal{
    protected String sonido;
    protected String alimentos;
    protected String habitat;
    protected String nombreCientifico;

    @Override
    public void setNombreCientifico(String nombre) {
        this.nombreCientifico = nombre;
    }

    @Override
    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    @Override
    public void setAlimentos(String alimento) {
        this.alimentos = alimento;
    }

    @Override
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    @Override
    public String getSonido() {
        return sonido;
    }

    @Override
    public String getAlimentos() {
        return alimentos;
    }

    @Override
    public String getHabitat() {
        return habitat;
    }
}
