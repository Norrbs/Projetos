public class Comentarios {
    public static void main(String[] args) {
        // Olá, eu sou um comentário em uma única linha

        /* Olá,
         * Eu sou um comentario
         * que posso ser mais detalhadod
         * quando necessário
         */

        /**
         * Estas duas estrelinhas acima
         * é para identificar que você
         * pretende elaborar um comentário
         * a nível de documentação.
         * Que incrível !!!
         */

        }
    /*
     * Este método foi elaborado as pressas
     * por isso eu abrevei o nome das variáveis
     * mas olha, ele tem a finalidade somar ou  multiplicar
     * dois números
     */
    public int somaMultiplica (int primeiroNumero, int segundoNumero, boolean multiplicao){
        int resultado = 0;
        if (multiplicao){
            resultado = primeiroNumero * segundoNumero;
        }else{
            resultado = primeiroNumero + segundoNumero;
        }
        return resultado;
    }
}
