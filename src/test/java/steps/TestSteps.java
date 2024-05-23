package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.junit.Assert;
import service.CEP;
import utils.Global;

import java.io.File;


public class TestSteps {

    @Given("que realizo um GET na aplicacao de CEP {} com o CEP {}")
    public void queRealizoUmGETNaAplicacaoDeCEPHttpsViacepComBrIdComOCEPEscolhido(String url, String cep) {
        Global.response = CEP.getCEP(url,cep);
    }

    @And("obtenho o status code {int}")
    public void obtenhoOStatusCode(int statusCode) {
        Assert.assertEquals("Status Code: ",statusCode,Global.response.getStatusCode());
    }

    @Then("valido o schema da response GET de CEP por um código")
    public void validoOSchemaDaResponseGETDeCEPPorUmCódigo() {
        Global.response.then().body(JsonSchemaValidator.matchesJsonSchema(new File("src/main/java/schema/cepSchema.json")));
        Global.response.prettyPrint();
    }

    @Given("realizo um GET na aplicacao de CEP https:\\/\\/viacep.com.br\\/ com o CEP inexistente")
    public void realizoUmGETNaAplicacaoDeCEPHttpsViacepComBrComOCEPInexistente(String url) {
        Global.response = CEP.getCEPNonExistent(url);
    }

}
