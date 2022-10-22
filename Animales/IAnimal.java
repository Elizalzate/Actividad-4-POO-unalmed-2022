package Animales;

interface IAnimal {
    void setNombreCientifico(String nombre);
    void setSonido(String sonido);
    void setAlimentos(String alimento);
    void setHabitat(String habitat);
    String getNombreCientifico();
    String getSonido();
    String getAlimentos();
    String getHabitat();
}
