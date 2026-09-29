package body.doc;

import body.CreateBy;
import body.signer.Signer;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DocFromDocxBase64 extends Doc {
    private String base64_docx;

    @Builder(builderMethodName = "docFromDocxBase64Builder")
    public DocFromDocxBase64(
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
            List<Signer> signers,
            String base64_docx,
            CreateBy created_by
    ) {
        super(name, lang, disable_signer_emails, signed_file_only_finished, brand_logo, brand_primary_color, brand_name, external_id, folder_path, date_limit_to_sign, signature_order_active, observers, reminder_every_n_days, signers, created_by);
        this.base64_docx = base64_docx;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBase64_docx() {
        return base64_docx;
    }
    public void setBase64_docx(String base64_docx) {
        this.base64_docx = base64_docx;
    }
}
