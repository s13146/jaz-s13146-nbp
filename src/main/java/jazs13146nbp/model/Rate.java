package jazs13146nbp.model;

import io.swagger.annotations.ApiModelProperty;

public class Rate {
    @ApiModelProperty (name="no", dataType = "String")
    private String no;
    @ApiModelProperty (name="no", dataType = "String")
    private String effectiveDate;
    @ApiModelProperty (name = "mid", dataType = "double", example = "3,5")
    private double mid;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public double getMid() {
        return mid;
    }

    public void setMid(double mid) {
        this.mid = mid;
    }
}

