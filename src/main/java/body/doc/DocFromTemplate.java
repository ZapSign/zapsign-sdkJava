package body.doc;

import body.signer.Signer;
import lombok.Builder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DocFromTemplate extends Doc {
    private String signer_name;
    private String template_id;
    private List<DeParaTemplate> data;

    @Builder(builderMethodName = "docFromTemplateBuilder")
    public DocFromTemplate(
            boolean sandbox,
            String name,
            String lang,
            boolean disable_signer_emails,
            boolean signed_file_only_finished,
            String brand_logo,
            String brand_primary_color,
            String brand_name,
            String external_id,
            String folder_path,
            Date date_limit_to_sign,
            boolean signature_order_active,
            ArrayList<String> observers,
            int reminder_every_n_days,
            String signer_name,
            String template_id,
            List<DeParaTemplate> data
    ) {
        super(sandbox, name, lang, disable_signer_emails, signed_file_only_finished, brand_logo, brand_primary_color, brand_name, external_id, folder_path, date_limit_to_sign, signature_order_active, observers, reminder_every_n_days);
        this.signer_name = signer_name;
        this.template_id = template_id;
        this.data = data;
    }

    @Override
    public List<Signer> getSigners() {
        return null;
    }

    @Override
    public void setSigners(List<Signer> signers) throws Exception {
        throw new Exception("you can not set signers in DocFromTemplate, try setSigner_name");
    }

    public String getSigner_name() {
        return signer_name;
    }

    public void setSigner_name(String signer_name) {
        this.signer_name = signer_name;
    }

    public String getTemplate_id() {
        return template_id;
    }
    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    public List<DeParaTemplate> getData() {
        return data;
    }

    public void setData(List<DeParaTemplate> data) {
        this.data = data;
    }
}
