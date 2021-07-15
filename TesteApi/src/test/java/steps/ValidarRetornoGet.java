package steps;

import io.cucumber.java.en.*;
import utils.ValidacoesGet;

public class ValidarRetornoGet {

    @Given("que seja acessada a API {string}")
    public void que_seja_acessada_a_api(String url) {
        ValidacoesGet.acessarApi(url);
    }

    @When("realizar uma requisição para verificar o se o campo {string} é {string}")
    public void realizar_uma_requisição_para_verificar_o_usuário_cadastrado(String campo, String nome) {
        ValidacoesGet.validacaoConteudo(campo, nome);
    }

    @Then("a API deverá retornar os dados do usuário cadastrado e StatusCode {int}")
    public void a_api_deverá_retornar_os_dados_do_usuário_cadastrado_e_status_code(Integer statusCode) {
        ValidacoesGet.validacaoStatusCode(statusCode);
    }

    @Then("o retorno deverá estar conforme padrão do schema")
    public void o_retorno_deverá_estar_conforme_padrão_do_schema() {
        ValidacoesGet.validacaoSchema("validateSchema.json");
    }
}
