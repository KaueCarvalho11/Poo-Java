    package lista_criacao_classes_II.questao042;

    public class Generica <T>{
        private T atributo1;
        private T atributo2;
        private T atributo3;

        public Generica(T atributo1, T atributo2, T atributo3){
            this.atributo1 = atributo1;
            this.atributo2 = atributo2;
            this.atributo3 = atributo3;
        }

        public String toString(){
            return "\nAtributo 1 = " + atributo1 + " Atributo 2 = " + atributo2 + " Atributo 3 = " + atributo3;
        }

        public int iguais(){
            int contador = 0;

            if(atributo1.equals(atributo2)){
                contador+=2;
                if(atributo1.equals(atributo3)){
                    contador++;
                }
            }

            else if(atributo1.equals(atributo3)){
                contador+=2;
            }  
            
            return contador;
        }
    }
