package signers;

import body.signer.SignBatch;
import body.signer.Signer;
import services.HttpRequestFactory;
import services.JsonConverter;

import java.net.http.HttpResponse;

public class SignerRequest {
    private final String apiRoute = "https://api.zapsign.com.br/api/v1/";
    private final JsonConverter jsonConverter = new JsonConverter();
    private String apiToken;

    public SignerRequest(String apiToken) {
        this.apiToken = apiToken;
    }

    public String getApiToken() {
        return apiToken;
    }

    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }

    public Signer detailSigner(String signerToken) throws Exception {
        String uri = this.apiRoute+"signers/"+signerToken+"/?api_token="+this.apiToken;

        HttpResponse<String> response = new HttpRequestFactory().getRequest(uri);

        return this.jsonConverter.jsonToSigner(response.body());
    }

    public Signer updateSigner(String signerToken, Signer signer) throws Exception {
        String jsonDoc = this.jsonConverter.signerToJson(signer);

        String uri = this.apiRoute+"signers/"+signerToken+"/?api_token="+this.apiToken;

        HttpResponse<String> response = new HttpRequestFactory().postRequest(uri, jsonDoc);

        return this.jsonConverter.jsonToSigner(response.body());
    }

    public Signer addSigner(String docToken, Signer signer) throws Exception {
        String jsonDoc = this.jsonConverter.signerToJson(signer);

        String uri = this.apiRoute+"docs/"+docToken+"/add-signer/?api_token="+this.apiToken;

        HttpResponse<String> response = new HttpRequestFactory().postRequest(uri, jsonDoc);

        return this.jsonConverter.jsonToSigner(response.body());
    }

    public String deleteSigner(String docToken) throws Exception {
        String uri = this.apiRoute+"signer/"+docToken+"/remove/?api_token="+this.apiToken;

        HttpResponse<String> response = new HttpRequestFactory().deleteRequest(uri);

        return response.body();
    }

    public String signInBatch(SignBatch signBatch) throws Exception {
        String jsonDoc = this.jsonConverter.signBachToJson(signBatch);

        String uri = this.apiRoute+"sign/?api_token="+this.apiToken;

        HttpResponse<String> response = new HttpRequestFactory().postRequest(uri, jsonDoc);

        return response.body();
    }
}
