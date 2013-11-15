/**
 * Created with IntelliJ IDEA.
 * User: wesleykenji
 * Date: 15/11/13
 * Time: 16:32
 * To change this template use File | Settings | File Templates.
 */
public class BuscaEmGrafo implements IGrafo {

    private BuscaEmGrafo buscaEmGrafo;
    private Agente agente;
    private EstadoBuilder estadoBuilder;

    public BuscaEmGrafo(){
        this.estadoBuilder = new EstadoBuilder(this);
    }

    @Override
    public Agente efetuarBusca() {
        this.agente = new Agente(estadoBuilder.getEstados(), this);
        return this.agente;
    }

    @Override
    public EstadoBuilder populaEstado() {
        return this.estadoBuilder;
    }

}
