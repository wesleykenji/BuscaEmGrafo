import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: wesleykenji
 * Date: 15/11/13
 * Time: 16:36
 * To change this template use File | Settings | File Templates.
 */
public class Agente {

    private Map<TipoEstado, Integer[]> estados;
    private BuscaEmGrafo buscaEmGrafo;

    public Agente(Map<TipoEstado, Integer[]> estados, BuscaEmGrafo buscaEmGrafo) {
        this.estados = estados;
        this.buscaEmGrafo = buscaEmGrafo;
    }

    public BuscaEmGrafo porAlgoritmoEmAmplitude(){
        /*
         *
            01 Busca-em-Amplitude (grafo, vertice_inicial) {
            02    criar fronteira como fila;
            03    enquanto (fronteira <> vazia) {
            04      vertice = remover_do_inicio(fronteira);
            05      se funcao_objetivo(vertice) entao retorna vertice;
            06      para-cada vertice_adjacente em (vertice) {
            07        adicionar_no_fim(fronteira, vertice_adjacente);
            08      }
            09    }
            10  }
        *
        * */
        Estado estado = new Estado(TipoDeInstancia.FILA, estados);

//        while(!fronteira.isEmpty()){
//            if(funcaoObjetivo(vertice)){
//                System.out.println(vertice);
//            }
//
//            for(verticeAdjacente em vertice){
//                fronteira.add(verticeAdjacente);
//            }
//        }

        return buscaEmGrafo;
     }

    public BuscaEmGrafo porAlgoritmoEmProfundidade(){
        /*
        *
            01  Busca-em-Profundidade (grafo, vertice_inicial) {
            02    criar fronteira como pilha;
            03    enquanto (fronteira <> vazia) {
            04      vertice = remover_do_fim(fronteira);
            05      se funcao_objetivo(vertice) entao retorna vertice;
            06      para-cada vertice_adjacente em (vertice) {
            07        adicionar_no_fim(fronteira, vertice_adjacente);
            08      }
            09    }
            10  }
        *
        * */
        Estado estado = new Estado(TipoDeInstancia.PILHA, estados);

        return buscaEmGrafo;
     }

    public BuscaEmGrafo porAlgoritmoDeMelhorEscolha(){
        /*
        *
            01  Busca-por-Melhor-Escolha (grafo, vertice_inicial) {
            02    criar fronteira como fila_de_prioridade;
            03    enquanto (fronteira <> vazia) {
            04      vertice = remover_prioritario(fronteira);
            05      se funcao_objetivo(vertice) entao retorna vertice;
            06      para-cada vertice_adjacente em (vertice) {
            07        adicionar_no_fim(fronteira, vertice_adjacente, prioridade);
            08      }
            09    }
        *
        * */

        Estado estado = new Estado(TipoDeInstancia.FILA_PRIORITARIA, estados);

        return buscaEmGrafo;
     }
}
