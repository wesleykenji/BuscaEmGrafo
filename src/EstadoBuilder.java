import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: wesleykenji
 * Date: 15/11/13
 * Time: 17:09
 * To change this template use File | Settings | File Templates.
 */
public class EstadoBuilder {

    private BuscaEmGrafo buscaEmGrafo;
    private Map<TipoEstado, Integer[]> mapEstados = new HashMap<TipoEstado, Integer[]>();

    public EstadoBuilder(BuscaEmGrafo buscaEmGrafo) {
        this.buscaEmGrafo = buscaEmGrafo;
    }

    public EstadoBuilder comEstadoInicial(Integer[] estado){
        //Sobrescrever espaço inicial
        mapEstados.put(TipoEstado.INICIO, estado);
        return this;
    }

    public BuscaEmGrafo comEstadoFinal(Integer[] estado){
        //Sobrescrever espaço final
        mapEstados.put(TipoEstado.FINAL, estado);
        return this.buscaEmGrafo;
    }

    public Map<TipoEstado, Integer[]> getEstados() {
        return mapEstados;
    }

}

