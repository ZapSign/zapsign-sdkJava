package body.doc;

import body.CreateBy;
import body.signer.Signer;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DocFromPdfBase64 extends Doc {
    private String base64_pdf;

    @Builder(builderMethodName = "docFromPdfBase64Builder")
    public DocFromPdfBase64(
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
            List<Signer> signers,
            String base64_pdf,
            CreateBy created_by
    ) {
        super(sandbox, name, lang, disable_signer_emails, signed_file_only_finished, brand_logo, brand_primary_color, brand_name, external_id, folder_path, date_limit_to_sign, signature_order_active, observers, reminder_every_n_days, signers, created_by);
        this.base64_pdf = base64_pdf;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBase64_pdf() {
        return base64_pdf;
    }
    public void setBase64_pdf(String base64_pdf) {
        this.base64_pdf = base64_pdf;
    }
}
