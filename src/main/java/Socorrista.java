public class Socorrista implements TipoFuncao{
    private static Socorrista socorrista = new Socorrista();
    private Socorrista(){}
    public static Socorrista getInstance(){
        return socorrista;
    }

    @Override
    public String tipoFuncaoExecutada(){
        return "Socorrista";
    }
}
