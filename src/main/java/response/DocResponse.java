package response;

import body.Answers;
import body.CreateBy;
import body.Template;
import body.doc.Doc;

import java.util.ArrayList;

public class DocResponse extends Doc {
    private int open_id;
    private String token;
    private String status;
    private String original_file;
    private String signed_file;
    private String created_through;
    private ArrayList<ExtraDocResponse> extra_docs;
    private boolean deleted;
    private String deleted_at;
    private String created_at;
    private String last_update_at;
    private Template template;
    private ArrayList<Answers> answers;
    private int auto_reminder;

    public DocResponse() {
        super();
    }

    public int getOpen_id() {
        return open_id;
    }

    public void setOpen_id(int open_id) {
        this.open_id = open_id;
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

    public String getOriginal_file() {
        return original_file;
    }

    public void setOriginal_file(String original_file) {
        this.original_file = original_file;
    }

    public String getSigned_file() {
        return signed_file;
    }

    public void setSigned_file(String signed_file) {
        this.signed_file = signed_file;
    }

    public String getCreated_through() {
        return created_through;
    }

    public void setCreated_through(String created_through) {
        this.created_through = created_through;
    }

    public ArrayList<ExtraDocResponse> getExtra_docs() {
        return extra_docs;
    }

    public void setExtra_docs(ArrayList<ExtraDocResponse> extra_docs) {
        this.extra_docs = extra_docs;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(String deleted_at) {
        this.deleted_at = deleted_at;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getLast_update_at() {
        return last_update_at;
    }

    public void setLast_update_at(String last_update_at) {
        this.last_update_at = last_update_at;
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public ArrayList<Answers> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<Answers> answers) {
        this.answers = answers;
    }

    public int getAuto_reminder() {
        return auto_reminder;
    }

    public void setAuto_reminder(int auto_reminder) {
        this.auto_reminder = auto_reminder;
    }
}
