import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class CEPTest {
    private RequestSpecification requestSpec;

    @BeforeEach
    public void createRequestSpecification() {

      requestSpec = new RequestSpecBuilder().
          setBaseUri("https://viacep.com.br").
          build();
    }

    @Test
    public void requestCEPValido_checkResponseCode_expect200() {
        String cepValido = "01001000";

      given().
          spec(requestSpec).
          when().
          get("ws/" + cepValido +"/json/").
          then().
          assertThat().
          statusCode(200).
          contentType(equalTo("application/json; charset=utf-8")).
          body("localidade", equalTo("São Paulo"));

    }

    @Test
    public void requestCEPInvalido_checkResponseCode_expect400() {
      String cepInvalido = "";

      given().
          spec(requestSpec).
          when().
          get("ws/" + cepInvalido +"/json/").
          then().
          assertThat().
          statusCode(400);

    }



}
