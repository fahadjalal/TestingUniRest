import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class UniRestTest {
    @Test
    public void shouldReturnStatusOkay() {
        HttpResponse<JsonNode> jsonResponse
                = Unirest.get("http://www.mocky.io/v2/5a9ce37b3100004f00ab5154")
                .header("accept", "application/json").queryString("apiKey", "123")
                .asJson();

        assertNotNull(jsonResponse.getBody());
        assertEquals(200, jsonResponse.getStatus());
    }
@Test
public void getReqRes (){
        HttpResponse<JsonNode> response = Unirest.get("https://reqres.in/api/users?page=2").asJson();
        assertEquals(200,response.getStatus());
}
@Test void postReqres (){
        HttpResponse<JsonNode> response =
                Unirest.post("https://reqres.in/api/users")
                        .body("{\"name\": \"morpheus\", \"job\": \"leader\",\"id\": \"873\",\"createdAt\": \"2023-03-10T11:07:15.731Z\"}")
                        .asJson();
}
    @Test
    public void shouldReturnStatusAccepted() {
        Map<String, String> headers = new HashMap<>();
        headers.put("accept", "application/json");
        headers.put("Authorization", "Bearer 5a9ce37b3100004f00ab5154");

        Map<String, Object> fields = new HashMap<>();
        fields.put("name", "Sam Baeldung");
        fields.put("id", "PSP123");

        HttpResponse<JsonNode> jsonResponse
                = Unirest.put("http://www.mocky.io/v2/5a9ce7853100002a00ab515e")
                .headers(headers).fields(fields)
                .asJson();

        assertNotNull(jsonResponse.getBody());
        assertEquals(202, jsonResponse.getStatus());
    }


    @Test
    public void givenRequestBodyWhenCreatedThenCorrect() {

        HttpResponse<JsonNode> jsonResponse
                = Unirest.post("http://www.mocky.io/v2/5a9ce7663100006800ab515d")
                .body("{\"name\":\"Sam Baeldung\", \"city\":\"viena\"}")
                .asJson();

        assertEquals(201, jsonResponse.getStatus());
    }


}