package body.doc;

import lombok.Builder;

import java.util.List;

public class RubricaList {
    private List<Rubrica> rubricas;

    @Builder
    public RubricaList(List<Rubrica> rubricas) {
        this.rubricas = rubricas;
    }

    public List<Rubrica> getRubricas() {
        return rubricas;
    }

    public void setRubricas(List<Rubrica> rubricas) {
        this.rubricas = rubricas;
    }
}
