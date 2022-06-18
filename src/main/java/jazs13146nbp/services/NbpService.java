package jazs13146nbp.services;

import jazs13146nbp.model.Rate;
import jazs13146nbp.model.Root;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class NbpService {
    private RestTemplate restTemplate;

    public NbpService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public Root getAvgList(String currency, String startData, String endData) {
        String url = String.format("https://api.nbp.pl/api/exchangerates/rates/a/%s/%s/%s/?format=json", currency, startData, endData);
        return restTemplate.getForObject(url, Root.class);
    }

    public double getAvgCurrency(String currency, String startData, String endData) {
        Root root = getAvgList(currency, startData, endData);
        List<Rate> rates = root.getRates();
        double amount = 0;
        for (Rate rat : rates) {
            amount += rat.getMid();
        }
        return amount / rates.size();
    }

}
