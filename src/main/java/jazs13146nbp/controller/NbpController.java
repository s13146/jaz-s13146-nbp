package jazs13146nbp.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import jazs13146nbp.services.NbpService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NbpController {
    private final NbpService nbpService;

    public NbpController(NbpService nbpService) {
        this.nbpService = nbpService;
    }
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Given currency was not found"),
            @ApiResponse(code = 504, message = "Something wrong with server"),
            @ApiResponse(code = 402, message = "You dont have access"),
            @ApiResponse(code = 403, message = "It is not for you"),
    }
    )
    @ApiOperation(value = "Get average exchange rate of currency from desired date range", notes = "Enter date range and currency code")
    @GetMapping("/nbp/{currency}/{startDate}/{endDate}")
    public ResponseEntity<Double> getAvgCurrency(@ApiParam(value = "Currency code", example = "gpb") @PathVariable String currency,
                                                 @ApiParam(value = "Start date of range", example = "2022-06-01")@PathVariable String startDate,
                                                 @ApiParam(value = "End date of range", example = "2022-06-12") @PathVariable String endDate) {
        return ResponseEntity.ok(nbpService.getAvgCurrency(currency, startDate, endDate));
    }


    //@ApiOperation( alue = "Save currency, start and end date to data base")
    // @PostMapping("/save/{")
    //public();


}
