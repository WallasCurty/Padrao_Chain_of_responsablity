public class FuncionarioSocorrista extends Funcionario{
    public FuncionarioSocorrista(Funcionario funcionario){
        atendimentoFuncionario.add(Socorrista.getInstance());
        setFuncionario(funcionario);
    }
    @Override
    public String getTipoAtendimentoFuncao(){
        return "Atendimendo pelo Socorrista.";
    }
}
