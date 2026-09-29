package request;

import services.HttpRequestFactory;
import services.JsonConverter;

import java.net.http.HttpResponse;

public class Request {
    protected final static String apiRoute = "https://api.zapsign.com.br/api/v1/";
    protected final static String apiRouteSandbox = "https://sandbox.api.zapsign.com.br/api/v1/";
    protected final JsonConverter jsonConverter = new JsonConverter();
    protected String apiToken;
    protected boolean isSandbox = false;

    public Request(String apiToken) {
        this.apiToken = apiToken;
    }

    public Request(String apiToken, boolean isSandbox) {
        this.apiToken = apiToken;
        this.isSandbox = isSandbox;
    }

    public static String getApiRoute() {
        return apiRoute;
    }

    public static String getApiRouteSandbox() {
        return apiRouteSandbox;
    }

    private <T> T createRequest(Object payload, String endpoint, Class<T> responseType, boolean delete) throws Exception {
        String uri = new StringBuilder()
                .append(isSandbox ? apiRouteSandbox : apiRoute).append(endpoint).append("/")
                .append("?api_token=").append(apiToken)
                .toString();

        HttpResponse<String> response = payload == null
                ? delete ? new HttpRequestFactory().deleteRequest(uri) : new HttpRequestFactory().getRequest(uri)
                : new HttpRequestFactory().postRequest(uri, jsonConverter.convertToJson(payload));

        return jsonConverter.jsonToType(response.body(), responseType);
    }

    protected <T> T postRequest(Object payload, String endpoint, Class<T> responseType) throws Exception {
        return createRequest(payload, endpoint, responseType, false);
    }

    protected <T> T getRequest(String endpoint, Class<T> responseType) throws Exception {
        return createRequest(null, endpoint, responseType, false);
    }

    protected <T> T deleteRequest(String endpoint, Class<T> responseType) throws Exception {
        return createRequest(null, endpoint, responseType, true);
    }

    public String getTokenApi() {
        return apiToken;
    }

    public void setTokenApi(String apiToken) {
        this.apiToken = apiToken;
    }
}
