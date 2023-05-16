public class FuncionarioEnfermeiro extends Funcionario{
    public FuncionarioEnfermeiro(Funcionario funcionario){
        atendimentoFuncionario.add(Enfermeiro.getInstance());
        setFuncionario(funcionario);
    }
    @Override
    public String getTipoAtendimentoFuncao(){
        return "Atendimendo pelo Enfermeiro.";
    }
}
