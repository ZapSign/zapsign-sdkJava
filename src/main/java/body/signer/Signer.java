package body.signer;

import lombok.Builder;

public class Signer {
    private String name = "";
    private String email = "";
    private String auth_mode = "assinaturaTela";
    private boolean send_automatic_email = false;
    private boolean send_automatic_whatsapp = false;
    private int order_group = 0;
    private String custom_message = "";
    private String phone_country = "";
    private String phone_number = "";
    private boolean lock_email = false;
    private boolean blank_email = false;
    private boolean hide_email = false;
    private boolean lock_phone = false;
    private boolean blank_phone = false;
    private boolean hide_phone = false;
    private boolean lock_name = false;
    private boolean require_selfie_photo = false;
    private String selfie_validation_type = "none";
    private String qualification = "";
    private String external_id = "";
    private String redirect_link = "";
    private String  sign_url;
    private String  token;
    private String  status;
    private int  times_viewed;
    private String  last_view_at;
    private String  signed_at;
    private String  geo_latitude;
    private String  geo_longitude;
    private String  signature_image;
    private String  visto_image;
    private String  document_photo_url;
    private String  document_verse_photo_url;
    private String  selfie_photo_url;
    private String  selfie_photo_url2;
    private String  send_via;
    private String  require_document_photo;

    public Signer() {
    }

    @Builder
    public Signer(
        String name,
        String email,
        String auth_mode,
        boolean send_automatic_email,
        boolean send_automatic_whatsapp,
        int order_group,
        String custom_message,
        String phone_country,
        String phone_number,
        boolean lock_email,
        boolean blank_email,
        boolean hide_email,
        boolean lock_phone,
        boolean blank_phone,
        boolean hide_phone,
        boolean lock_name,
        boolean require_selfie_photo,
        String selfie_validation_type,
        String qualification,
        String external_id,
        String redirect_link
    ) {
        this.name = name;
        this.email = email;
        this.auth_mode = auth_mode;
        this.send_automatic_email = send_automatic_email;
        this.send_automatic_whatsapp = send_automatic_whatsapp;
        this.order_group = order_group;
        this.custom_message = custom_message;
        this.phone_country = phone_country;
        this.phone_number = phone_number;
        this.lock_email = lock_email;
        this.blank_email = blank_email;
        this.hide_email = hide_email;
        this.lock_phone = lock_phone;
        this.blank_phone = blank_phone;
        this.hide_phone = hide_phone;
        this.lock_name = lock_name;
        this.require_selfie_photo = require_selfie_photo;
        this.selfie_validation_type = selfie_validation_type;
        this.qualification = qualification;
        this.external_id = external_id;
        this.redirect_link = redirect_link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAuth_mode() {
        return auth_mode;
    }

    public void setAuth_mode(String auth_mode) {
        this.auth_mode = auth_mode;
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

    public int getOrder_group() {
        return order_group;
    }

    public void setOrder_group(int order_group) {
        this.order_group = order_group;
    }

    public String getCustom_message() {
        return custom_message;
    }

    public void setCustom_message(String custom_message) {
        this.custom_message = custom_message;
    }

    public String getPhone_country() {
        return phone_country;
    }

    public void setPhone_country(String phone_country) {
        this.phone_country = phone_country;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public boolean isLock_email() {
        return lock_email;
    }

    public void setLock_email(boolean lock_email) {
        this.lock_email = lock_email;
    }

    public boolean isBlank_email() {
        return blank_email;
    }

    public void setBlank_email(boolean blank_email) {
        this.blank_email = blank_email;
    }

    public boolean isHide_email() {
        return hide_email;
    }

    public void setHide_email(boolean hide_email) {
        this.hide_email = hide_email;
    }

    public boolean isLock_phone() {
        return lock_phone;
    }

    public void setLock_phone(boolean lock_phone) {
        this.lock_phone = lock_phone;
    }

    public boolean isBlank_phone() {
        return blank_phone;
    }

    public void setBlank_phone(boolean blank_phone) {
        this.blank_phone = blank_phone;
    }

    public boolean isHide_phone() {
        return hide_phone;
    }

    public void setHide_phone(boolean hide_phone) {
        this.hide_phone = hide_phone;
    }

    public boolean isLock_name() {
        return lock_name;
    }

    public void setLock_name(boolean lock_name) {
        this.lock_name = lock_name;
    }

    public boolean isRequire_selfie_photo() {
        return require_selfie_photo;
    }

    public void setRequire_selfie_photo(boolean require_selfie_photo) {
        this.require_selfie_photo = require_selfie_photo;
    }

    public String getSelfie_validation_type() {
        return selfie_validation_type;
    }

    public void setSelfie_validation_type(String selfie_validation_type) {
        this.selfie_validation_type = selfie_validation_type;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public String getRedirect_link() {
        return redirect_link;
    }

    public void setRedirect_link(String redirect_link) {
        this.redirect_link = redirect_link;
    }

    public String getSign_url() {
        return sign_url;
    }

    public void setSign_url(String sign_url) {
        this.sign_url = sign_url;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTimes_viewed() {
        return times_viewed;
    }

    public void setTimes_viewed(int times_viewed) {
        this.times_viewed = times_viewed;
    }

    public String getLast_view_at() {
        return last_view_at;
    }

    public void setLast_view_at(String last_view_at) {
        this.last_view_at = last_view_at;
    }

    public String getSigned_at() {
        return signed_at;
    }

    public void setSigned_at(String signed_at) {
        this.signed_at = signed_at;
    }

    public String getGeo_latitude() {
        return geo_latitude;
    }

    public void setGeo_latitude(String geo_latitude) {
        this.geo_latitude = geo_latitude;
    }

    public String getGeo_longitude() {
        return geo_longitude;
    }

    public void setGeo_longitude(String geo_longitude) {
        this.geo_longitude = geo_longitude;
    }

    public String getSignature_image() {
        return signature_image;
    }

    public void setSignature_image(String signature_image) {
        this.signature_image = signature_image;
    }

    public String getVisto_image() {
        return visto_image;
    }

    public void setVisto_image(String visto_image) {
        this.visto_image = visto_image;
    }

    public String getDocument_photo_url() {
        return document_photo_url;
    }

    public void setDocument_photo_url(String document_photo_url) {
        this.document_photo_url = document_photo_url;
    }

    public String getDocument_verse_photo_url() {
        return document_verse_photo_url;
    }

    public void setDocument_verse_photo_url(String document_verse_photo_url) {
        this.document_verse_photo_url = document_verse_photo_url;
    }

    public String getSelfie_photo_url() {
        return selfie_photo_url;
    }

    public void setSelfie_photo_url(String selfie_photo_url) {
        this.selfie_photo_url = selfie_photo_url;
    }

    public String getSelfie_photo_url2() {
        return selfie_photo_url2;
    }

    public void setSelfie_photo_url2(String selfie_photo_url2) {
        this.selfie_photo_url2 = selfie_photo_url2;
    }

    public String getSend_via() {
        return send_via;
    }

    public void setSend_via(String send_via) {
        this.send_via = send_via;
    }

    public String getRequire_document_photo() {
        return require_document_photo;
    }

    public void setRequire_document_photo(String require_document_photo) {
        this.require_document_photo = require_document_photo;
    }
}
