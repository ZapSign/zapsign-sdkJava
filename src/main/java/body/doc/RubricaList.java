package body.doc;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;

import java.util.List;

public class RubricaList {
    private List<Rubrica> rubricas;

    @Builder
    public RubricaList(List<Rubrica> rubricas) {
        this.rubricas = rubricas;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Rubrica> getRubricas() {
        return rubricas;
    }

    public void setRubricas(List<Rubrica> rubricas) {
        this.rubricas = rubricas;
    }
}
