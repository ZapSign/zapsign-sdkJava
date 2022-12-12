package body.doc;
import body.signer.Signer;
import lombok.Builder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Doc {
    private boolean sandbox;
    private String name;
    private String lang;
    private boolean disable_signer_emails;
    private boolean signed_file_only_finished;
    private String brand_logo;
    private String brand_primary_color;
    private String brand_name;
    private String external_id;
    private String folder_path;
    private Date date_limit_to_sign;
    private boolean signature_order_active;
    private ArrayList<String> observers;
    private List<Signer> signers;
    private int reminder_every_n_days;

    public Doc() {
        this.sandbox = false;
        this.name = "";
        this.lang = "pt-br";
        this.disable_signer_emails = false;
        this.signed_file_only_finished = false;
        this.brand_logo = "";
        this.brand_primary_color = "";
        this.brand_name = "";
        this.external_id = "";
        this.folder_path = "/";
        this.date_limit_to_sign = null;
        this.signature_order_active = false;
        this.signers = new ArrayList<Signer>();
        this.observers = new ArrayList<String>();
    }

    @Builder(builderMethodName = "docBuilder")
    public Doc(
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
            int reminder_every_n_days
    ) {
        this.sandbox = sandbox;
        this.name = name;
        this.lang = lang;
        this.disable_signer_emails = disable_signer_emails;
        this.signed_file_only_finished = signed_file_only_finished;
        this.brand_logo = brand_logo;
        this.brand_primary_color = brand_primary_color;
        this.brand_name = brand_name;
        this.external_id = external_id;
        this.folder_path = folder_path;
        this.date_limit_to_sign = date_limit_to_sign;
        this.signature_order_active = signature_order_active;
        this.observers = observers;
        this.reminder_every_n_days = reminder_every_n_days;
    }

    @Builder(builderMethodName = "docWithSignerBuilder")
    public Doc(
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
            List<Signer> signers
    ) {
        this.sandbox = sandbox;
        this.name = name;
        this.lang = lang;
        this.disable_signer_emails = disable_signer_emails;
        this.signed_file_only_finished = signed_file_only_finished;
        this.brand_logo = brand_logo;
        this.brand_primary_color = brand_primary_color;
        this.brand_name = brand_name;
        this.external_id = external_id;
        this.folder_path = folder_path;
        this.date_limit_to_sign = date_limit_to_sign;
        this.signature_order_active = signature_order_active;
        this.observers = observers;
        this.reminder_every_n_days = reminder_every_n_days;
        this.signers = signers;
    }

    public boolean isSandbox() {
        return sandbox;
    }

    public void setSandbox(boolean sandbox) {
        this.sandbox = sandbox;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public boolean isDisable_signer_emails() {
        return disable_signer_emails;
    }

    public void setDisable_signer_emails(boolean disable_signer_emails) {
        this.disable_signer_emails = disable_signer_emails;
    }

    public boolean isSigned_file_only_finished() {
        return signed_file_only_finished;
    }

    public void setSigned_file_only_finished(boolean signed_file_only_finished) {
        this.signed_file_only_finished = signed_file_only_finished;
    }

    public String getBrand_logo() {
        return brand_logo;
    }

    public void setBrand_logo(String brand_logo) {
        this.brand_logo = brand_logo;
    }

    public String getBrand_primary_color() {
        return brand_primary_color;
    }

    public void setBrand_primary_color(String brand_primary_color) {
        this.brand_primary_color = brand_primary_color;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public String getFolder_path() {
        return folder_path;
    }

    public void setFolder_path(String folder_path) {
        this.folder_path = folder_path;
    }

    public Date getDate_limit_to_sign() {
        return date_limit_to_sign;
    }

    public void setDate_limit_to_sign(Date date_limit_to_sign) {
        this.date_limit_to_sign = date_limit_to_sign;
    }

    public boolean isSignature_order_active() {
        return signature_order_active;
    }

    public void setSignature_order_active(boolean signature_order_active) {
        this.signature_order_active = signature_order_active;
    }

    public ArrayList<String> getObservers() {
        return observers;
    }

    public void setObservers(ArrayList<String> observers) {
        this.observers = observers;
    }

    public int getReminder_every_n_days() {
        return reminder_every_n_days;
    }

    public void setReminder_every_n_days(int reminder_every_n_days) {
        this.reminder_every_n_days = reminder_every_n_days;
    }

    public List<Signer> getSigners() throws Exception {
        return signers;
    }

    public void setSigners(List<Signer> signers) throws Exception {
        this.signers = signers;
    }
}
