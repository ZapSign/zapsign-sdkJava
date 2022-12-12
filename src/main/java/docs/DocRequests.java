package docs;

import body.doc.*;
import response.DocAsyncResponse;
import response.DocResponse;
import response.DocsResponse;
import response.ExtraDocResponse;
import services.HttpRequestFactory;
import services.JsonConverter;

import java.net.http.HttpResponse;

public class DocRequests {
    private final String apiRoute = "https://api.zapsign.com.br/api/v1/";
    private final JsonConverter jsonConverter = new JsonConverter();
    private String apiToken;

    public DocRequests(String apiToken) {
        this.apiToken = apiToken;
    }

    public String getTokenApi() {
        return apiToken;
    }

    public void setTokenApi(String apiToken) {
        this.apiToken = apiToken;
    }

    public DocResponse createDocFromUploadPdf(DocFromPdf doc) throws Exception {
        String jsonDoc = this.jsonConverter.docFromPdfToJson(doc);

        String uri = this.apiRoute+"docs/?api_token="+this.apiToken;

        HttpResponse<String> response = new HttpRequestFactory().postRequest(uri, jsonDoc);

        return this.jsonConverter.jsonToDocResponse(response.body());
    }

    public DocResponse createDocFromUploadDocx(DocFromDocx doc) throws Exception {
        String jsonDoc = new JsonConverter().docFromDocxToJson(doc);

        String uri = this.apiRoute+"docs/?api_token="+this.apiToken;

        HttpResponse<String> response = new HttpRequestFactory().postRequest(uri, jsonDoc);

        return this.jsonConverter.jsonToDocResponse(response.body());
    }

    public DocAsyncResponse createDocFromUploadAsync(DocFromPdf doc) throws Exception {
        String jsonDoc = new JsonConverter().docFromPdfToJson(doc);

        String uri = this.apiRoute+"docs/async/?api_token="+this.apiToken;

        HttpResponse<String> response = new HttpRequestFactory().postRequest(uri, jsonDoc);

        return this.jsonConverter.jsonToDocAsyncResponse(response.body());
    }

    public DocResponse createDocFromTemplate(DocFromTemplate doc) throws Exception {
        String jsonDoc = new JsonConverter().docFromTemplateToJson(doc);

        String uri = this.apiRoute+"models/create-doc/?api_token="+this.apiToken;

        HttpResponse<String> response = new HttpRequestFactory().postRequest(uri, jsonDoc);

        return this.jsonConverter.jsonToDocResponse(response.body());
    }

    public DocAsyncResponse createDocFromTemplateAsync(DocFromTemplate doc) throws Exception {
        String jsonDoc = new JsonConverter().docFromTemplateToJson(doc);

        String uri = this.apiRoute+"models/create-doc/async/?api_token="+this.apiToken;

        HttpResponse<String> response = new HttpRequestFactory().postRequest(uri, jsonDoc);

        return this.jsonConverter.jsonToDocAsyncResponse(response.body());
    }

    public ExtraDocResponse addExtraDoc(String docToken, ExtraDoc extraDoc) throws Exception {
        String jsonDoc = new JsonConverter().extraDocsToJson(extraDoc);

        String uri = this.apiRoute+"docs/"+docToken+"/upload-extra-doc/?api_token="+this.apiToken;

        HttpResponse<String> response = new HttpRequestFactory().postRequest(uri, jsonDoc);

        return this.jsonConverter.jsonToExtraDocResponse(response.body());
    }

    public DocResponse detailDoc(String docToken) throws Exception {
        String uri = this.apiRoute+"docs/"+docToken+"/?api_token="+this.apiToken;

        HttpResponse<String> response = new HttpRequestFactory().getRequest(uri);

        return this.jsonConverter.jsonToDocResponse(response.body());
    }

    public DocsResponse getDocs() throws Exception {
        String uri = this.apiRoute+"docs/?api_token="+this.apiToken;

        HttpResponse<String> response = new HttpRequestFactory().getRequest(uri);

        return this.jsonConverter.jsonToDocsResponse(response.body());
    }

    public DocResponse deleteDoc(String docToken) throws Exception {
        String uri = this.apiRoute+"docs/"+docToken+"/?api_token="+this.apiToken;

        HttpResponse<String> response = new HttpRequestFactory().deleteRequest(uri);

        return this.jsonConverter.jsonToDocResponse(response.body());
    }

    public int placeSignatures(String docToken, RubricaList rubricaList) throws Exception {
        String jsonDoc = new JsonConverter().rubricaListToJson(rubricaList);

        String uri = this.apiRoute+"docs/"+docToken+"/place-signatures/?api_token="+this.apiToken;

        HttpResponse<String> response = new HttpRequestFactory().postRequest(uri, jsonDoc);

        return response.statusCode();
    }
}
