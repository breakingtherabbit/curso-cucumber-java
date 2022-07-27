import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

public class AprenderCucumber {

    @Dado("que eu criei o arquivo corretamente")
    public void queEuCrieiOArquivoCorretamente() {

    }

    @Quando("executá-lo")
    public void executaLo() {

    }

    @Entao("a especificação deve finalizar com sucesso")
    public void aEspecificacaoDeveFinalizarComSucesso() {

    }

    private Integer contador = 0;
    @Dado("que o valor do contador é {int}")
    public void queOValorDoContadorE(Integer int1) {
        contador = int1;
    }

    @Quando("eu incrementar em {int}")
    public void euIncrementarEm(Integer int1) {
        contador = contador + int1;
    }

    @Entao("o valor do contador será {int}")
    public void oValorDoContadorSera(Integer int1) {
        Assert.assertEquals(int1, contador);
    }
}
