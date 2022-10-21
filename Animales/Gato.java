package Animales;

public class Gato extends Felino{
        private void setSonido() {
            this.sonido = "Maullido - meow";
        }
        private void setHabitat() {
            this.habitat = "Doméstico";
        }

        private void setAlimentos() {
            this.alimentos = "Carne - carnívoro";
        }

        private void setNombreCientifico() {
            this.nombreCientifico = "Felis silvestris catus";
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
                    " también conocido como Gato" +
                    "\nSonido: " + getSonido()+
                    "\nSu habitat es: " + getHabitat() +
                    "\nSu alimentación está basada en: " + getAlimentos() );
        }
}
