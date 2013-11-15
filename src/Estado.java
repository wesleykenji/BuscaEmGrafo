import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: wesleykenji
 * Date: 15/11/13
 * Time: 16:36
 * To change this template use File | Settings | File Templates.
 */
public class Estado {

    private List<Estado> estado;
    private List<Estado> fronteira;
    private List<Estado> historico;

    public Estado(TipoDeInstancia tipoDeInstancia, Map<TipoEstado, Integer[]> estados){

        if(tipoDeInstancia.equals(TipoDeInstancia.PILHA)){
            estado = new Stack<Estado>();
        } else if(tipoDeInstancia.equals(TipoDeInstancia.FILA)){
            estado = new LinkedList<Estado>();
        }
    }



}
