package jazs13146nbp.model;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;

public class Root {
    @ApiModelProperty(name="table", dataType = "String")
    private String table;
    @ApiModelProperty(name="currency", dataType = "String", example = "zl")
    private String currency;
    @ApiModelProperty(name="code", dataType = "String", example="pln")
    private String code;
    @ApiModelProperty(name="rates", dataType ="List<Rate>" )
    private ArrayList<Rate> rates;

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ArrayList<Rate> getRates() {
        return rates;
    }

    public void setRates(ArrayList<Rate> rates) {
        this.rates = rates;
    }
}
