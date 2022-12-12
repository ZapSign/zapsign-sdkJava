package body.signer;

import lombok.Builder;

import java.util.List;

public class SignBatch {
    private String user_token;
    private List<String> signer_tokens;

    @Builder
    public SignBatch(String user_token, List<String> signer_tokens) {
        this.user_token = user_token;
        this.signer_tokens = signer_tokens;
    }

    public String getUser_token() {
        return user_token;
    }

    public void setUser_token(String user_token) {
        this.user_token = user_token;
    }

    public List<String> getSigner_tokens() {
        return signer_tokens;
    }

    public void setSigner_tokens(List<String> signer_tokens) {
        this.signer_tokens = signer_tokens;
    }
}
