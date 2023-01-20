package body.doc;

import body.CreateBy;
import body.signer.Signer;
import lombok.Builder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DocFromTemplate extends Doc {
    private String signer_name;
    private String template_id;
    private List<DeParaTemplate> data;
    private boolean send_automatic_email;
    private boolean send_automatic_whatsapp;
    private String custom_message;
    private boolean signer_has_incomplete_fields;

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
            List<DeParaTemplate> data,
            boolean send_automatic_email,
            boolean send_automatic_whatsapp,
            String custom_message,
            boolean signer_has_incomplete_fields,
            CreateBy created_by
    ) {
        super(sandbox, name, lang, disable_signer_emails, signed_file_only_finished, brand_logo, brand_primary_color, brand_name, external_id, folder_path, date_limit_to_sign, signature_order_active, observers, reminder_every_n_days, created_by);
        this.signer_name = signer_name;
        this.template_id = template_id;
        this.data = data;
        this.send_automatic_email = send_automatic_email;
        this.send_automatic_whatsapp = send_automatic_whatsapp;
        this.custom_message = custom_message;
        this.signer_has_incomplete_fields = signer_has_incomplete_fields;
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

    public boolean isSend_automatic_email() {
        return send_automatic_email;
    }

    public void setSend_automatic_email(boolean send_automatic_email) {
        this.send_automatic_email = send_automatic_email;
    }

    public boolean isSend_automatic_whatsapp() {
        return send_automatic_whatsapp;
    }

    public void setSend_automatic_whatsapp(boolean send_automatic_whatsapp) {
        this.send_automatic_whatsapp = send_automatic_whatsapp;
    }

    public String getCustom_message() {
        return custom_message;
    }

    public void setCustom_message(String custom_message) {
        this.custom_message = custom_message;
    }

    public boolean isSigner_has_incomplete_fields() {
        return signer_has_incomplete_fields;
    }

    public void setSigner_has_incomplete_fields(boolean signer_has_incomplete_fields) {
        this.signer_has_incomplete_fields = signer_has_incomplete_fields;
    }
}
