import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RecepcaoTest {
    FuncionarioSocorrista funcionarioSocorrista;
    FuncionarioEnfermeiro funcionarioEnfermeiro;
    FuncionarioMedico funcionarioMedico;

    @BeforeEach
    void setUp(){
        funcionarioSocorrista = new FuncionarioSocorrista(funcionarioSocorrista);
        funcionarioEnfermeiro = new FuncionarioEnfermeiro(funcionarioEnfermeiro);
        funcionarioMedico = new FuncionarioMedico(null);
    }

    @Test
    void deveRetornarAtendimendoSocorrista(){
        assertEquals("Atendimento Socorrista",
                funcionarioSocorrista.executarFuncao(new Recepcao(Socorrista.getInstance())));
    }

    @Test
    void deveRetornarAtendimendoEnfermeiro(){
        Recepcao recepcao = new Recepcao(Enfermeiro.getInstance());
        assertEquals("Atendimento Enfermeiro", funcionarioEnfermeiro.executarFuncao(recepcao));
    }


    @Test
    void deveRetornarAtendimendoMedico(){
        Recepcao recepcao = new Recepcao(Medico.getInstance());
        assertEquals("Atendimento Medico", funcionarioMedico.executarFuncao(recepcao));
    }

    @Test
    void deveRetornarFuncaoIndisponivel(){
        Recepcao recepcao = new Recepcao(Medico.getInstance());
        funcionarioMedico.atendimentoFuncionario.remove(0);
        assertEquals("O serviço desejado está indisponivel", funcionarioMedico.executarFuncao(recepcao));
    }


}
