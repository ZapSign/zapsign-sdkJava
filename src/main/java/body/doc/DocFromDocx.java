package body.doc;

import body.signer.Signer;
import lombok.Builder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DocFromDocx extends Doc {
    private String url_docx;

    @Builder(builderMethodName = "docFromDocxBuilder")
    public DocFromDocx(
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
            String url_docx
    ) {
        super(sandbox, name, lang, disable_signer_emails, signed_file_only_finished, brand_logo, brand_primary_color, brand_name, external_id, folder_path, date_limit_to_sign, signature_order_active, observers, reminder_every_n_days, signers);
        this.url_docx = url_docx;
    }

    public String getUrl_docx() {
        return url_docx;
    }
    public void SetUrl_docx(String url_docx) {
        this.url_docx = url_docx;
    }
}
