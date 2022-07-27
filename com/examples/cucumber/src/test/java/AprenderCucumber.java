import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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

    Date entrega = new Date();
    @Dado("que o prazo é dia {int}\\/{int}\\/{int}")
    public void queOPrazoEDia(Integer dia, Integer mes, Integer ano) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, dia);
        calendar.set(Calendar.MONTH, mes - 1);
        calendar.set(Calendar.YEAR, ano);
        entrega = calendar.getTime();
    }

    @Quando("a entrega atrasar em {int} dias")
    public void aEntregaAtrasarEmDias(Integer quantidadeDias) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(entrega);
        calendar.add(Calendar.DAY_OF_MONTH, quantidadeDias);
        entrega = calendar.getTime();
    }

    @Quando("a entrega atrasar em {int} meses")
    public void aEntregaAtrasarEmMeses(Integer quantidadeMeses) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(entrega);
        calendar.add(Calendar.MONTH, quantidadeMeses);
        entrega = calendar.getTime();
    }

    @Entao("a entrega será efetuada em {int}\\/{int}\\/{int}")
    public void aEntregaSeraEfetuadaEm(Integer dia, Integer mes, Integer ano) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, dia);
        calendar.set(Calendar.MONTH, mes - 1);
        calendar.set(Calendar.YEAR, ano);

        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String expected = format.format(calendar.getTime());
        String actual = format.format(entrega);

        Assert.assertEquals(expected, actual);
    }
}
