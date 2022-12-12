package body.doc;

import lombok.Builder;

public class Rubrica {
    private int page;
    private double relative_position_bottom;
    private double relative_position_left;
    private double relative_size_x;
    private double relative_size_y;
    private String type;
    private String signer_token;

    @Builder
    public Rubrica(int page, double relative_position_bottom, double relative_position_left, double relative_size_x, double relative_size_y, String type, String signer_token) {
        this.page = page;
        this.relative_position_bottom = relative_position_bottom;
        this.relative_position_left = relative_position_left;
        this.relative_size_x = relative_size_x;
        this.relative_size_y = relative_size_y;
        this.type = type;
        this.signer_token = signer_token;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public double getRelative_position_bottom() {
        return relative_position_bottom;
    }

    public void setRelative_position_bottom(double relative_position_bottom) {
        this.relative_position_bottom = relative_position_bottom;
    }

    public double getRelative_position_left() {
        return relative_position_left;
    }

    public void setRelative_position_left(double relative_position_left) {
        this.relative_position_left = relative_position_left;
    }

    public double getRelative_size_x() {
        return relative_size_x;
    }

    public void setRelative_size_x(double relative_size_x) {
        this.relative_size_x = relative_size_x;
    }

    public double getRelative_size_y() {
        return relative_size_y;
    }

    public void setRelative_size_y(double relative_size_y) {
        this.relative_size_y = relative_size_y;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSigner_token() {
        return signer_token;
    }

    public void setSigner_token(String signer_token) {
        this.signer_token = signer_token;
    }
}
