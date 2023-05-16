public class FuncionarioMedico extends Funcionario{
    public FuncionarioMedico(Funcionario funcionario){
        atendimentoFuncionario.add(Medico.getInstance());
        setFuncionario(funcionario);
    }
    @Override
    public String getTipoAtendimentoFuncao(){
        return "Atendimendo pelo Médico.";
    }
}
