public class Enfermeiro implements TipoFuncao{
    private static Enfermeiro enfermeiro = new Enfermeiro();
    private Enfermeiro(){}
    public static Enfermeiro getInstance(){
        return enfermeiro;
    }

    @Override
    public String tipoFuncaoExecutada(){
        return "Enfermeiro";
    }
}
