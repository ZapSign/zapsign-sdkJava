package body.doc;

import lombok.Builder;

public class DeParaTemplate {
    private String de;
    private String para;


    @Builder(builderMethodName = "deParaTemplateBuilder")
    public DeParaTemplate(String de, String para) {
        this.de = de;
        this.para = para;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }
}
