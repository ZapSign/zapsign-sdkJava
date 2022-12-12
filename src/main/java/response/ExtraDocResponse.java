package response;

public class ExtraDocResponse {
    private String open_id;
    private String token;
    private String name;
    private String original_file;
    private String signed_file;

    public String getOpen_id() {
        return open_id;
    }

    public void setOpen_id(String open_id) {
        this.open_id = open_id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
