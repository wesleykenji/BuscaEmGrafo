/**
 * Created with IntelliJ IDEA.
 * User: wesleykenji
 * Date: 15/11/13
 * Time: 16:52
 * To change this template use File | Settings | File Templates.
 */
public class GrafoMain {

    public static void main(String[] args){
        IGrafo iGrafo = new BuscaEmGrafo();

        iGrafo.populaEstado()
                .comEstadoInicial(new Integer[]{7, 2, 4, 5, null, 6, 8, 3, 1})
                .comEstadoFinal(new Integer[]{null, 1, 2, 3, 4, 5, 6, 7, 8})
        .efetuarBusca().porAlgoritmoEmProfundidade()
        .efetuarBusca().porAlgoritmoEmAmplitude()
        .efetuarBusca().porAlgoritmoDeMelhorEscolha();

    }
}
