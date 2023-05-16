public class Medico implements TipoFuncao{
    private static Medico medico = new Medico();
    private Medico(){}
    public static Medico getInstance(){
        return medico;
    }

    @Override
    public String tipoFuncaoExecutada(){
        return "Medico";
    }
}
