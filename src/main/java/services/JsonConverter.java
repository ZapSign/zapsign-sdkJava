package services;

import body.doc.*;
import body.signer.SignBatch;
import body.signer.Signer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import response.DocAsyncResponse;
import response.DocResponse;
import response.DocsResponse;
import response.ExtraDocResponse;

import java.io.IOException;

public class JsonConverter {
    ObjectWriter objecWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
    ObjectMapper mapper = new ObjectMapper();

    public String docResponseToJson(DocResponse docResponse) throws JsonProcessingException {
        return objecWriter.writeValueAsString(docResponse);
    }

    public String docsResponseToJson(DocsResponse docsResponse) throws JsonProcessingException {
        return objecWriter.writeValueAsString(docsResponse);
    }

    public String docAsyncResponseToJson(DocAsyncResponse docAsyncResponse) throws JsonProcessingException {
        return objecWriter.writeValueAsString(docAsyncResponse);
    }

    public String extraDocToJson(ExtraDocResponse extraDocResponse) throws JsonProcessingException {
        return objecWriter.writeValueAsString(extraDocResponse);
    }

    public String docFromPdfToJson(DocFromPdf docFromPdf) throws JsonProcessingException {
        return objecWriter.writeValueAsString(docFromPdf);
    }

    public String docFromDocxToJson(DocFromDocx docFromDocx) throws JsonProcessingException {
        return objecWriter.writeValueAsString(docFromDocx);
    }

    public String docFromPdfBase64ToJson(DocFromPdfBase64 docFromPdfBase64) throws JsonProcessingException {
        return objecWriter.writeValueAsString(docFromPdfBase64);
    }

    public String docFromTemplateToJson(DocFromTemplate docFromTemplate) throws JsonProcessingException {
        return objecWriter.writeValueAsString(docFromTemplate);
    }

    public String extraDocsToJson(ExtraDoc extraDoc) throws JsonProcessingException {
        return objecWriter.writeValueAsString(extraDoc);
    }

    public String rubricaListToJson(RubricaList rubricaList) throws JsonProcessingException {
        return objecWriter.writeValueAsString(rubricaList);
    }

    public String signerToJson(Signer signer) throws JsonProcessingException {
        return objecWriter.writeValueAsString(signer);
    }

    public String signBachToJson(SignBatch signBatch) throws JsonProcessingException {
        return objecWriter.writeValueAsString(signBatch);
    }

    public DocResponse jsonToDocResponse(String jsonResponse) throws IOException {
        return this.mapper.readValue(jsonResponse, DocResponse.class);
    }

    public DocsResponse jsonToDocsResponse(String jsonResponse) throws IOException {
        return this.mapper.readValue(jsonResponse, DocsResponse.class);
    }

    public DocAsyncResponse jsonToDocAsyncResponse(String jsonResponse) throws IOException {
        return this.mapper.readValue(jsonResponse, DocAsyncResponse.class);
    }

    public ExtraDocResponse jsonToExtraDocResponse(String jsonResponse) throws IOException {
        return this.mapper.readValue(jsonResponse, ExtraDocResponse.class);
    }

    public Signer jsonToSigner(String jsonResponse) throws IOException {
        return this.mapper.readValue(jsonResponse, Signer.class);
    }

}
