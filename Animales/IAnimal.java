package Animales;

interface IAnimal {

    void setNombreCientifico(String nombre);

    void setSonido(String sonido);
    void setAlimentos(String alimento);
    void setHabitat(String habitat);



    public String getNombreCientifico();
    public String getSonido();
    public String getAlimentos();
    public String getHabitat();
}
