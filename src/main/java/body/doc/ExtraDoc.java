package body.doc;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;

public class ExtraDoc {
    private String name;
    private String url_pdf;

    @Builder(builderMethodName = "extraDocBuilder")
    public ExtraDoc(String name, String url_pdf) {
        this.name = name;
        this.url_pdf = url_pdf;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUrl_pdf() {
        return url_pdf;
    }

    public void setUrl_pdf(String url_pdf) {
        this.url_pdf = url_pdf;
    }
}
