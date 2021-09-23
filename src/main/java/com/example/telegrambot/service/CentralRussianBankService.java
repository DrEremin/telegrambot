package com.example.telegrambot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.WebServiceTemplate;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import com.example.telegrambot.dto.ExchangeRateOnDate;
import com.example.telegrambot.dto.GetXmlOfDate;
import com.example.telegrambot.dto.GetListOfExchangeRatesOnDateResponse;

public class CentralRussianBankService extends WebServiceTemplate {

    @Value("${cbr.api.url}")
    private String cbrApiUrl;

    public List<ExchangeRateOnDate> getCurrenciesFromCbr() throws DatatypeConfigurationException {

        final GetXmlOfDate getXmlOfDate = new GetXmlOfDate();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(new Date());
        XMLGregorianCalendar xmlGregCal = DatatypeFactory
                .newInstance()
                .newXMLGregorianCalendar(gregorianCalendar);

        getXmlOfDate.setOnDate(xmlGregCal);

        GetListOfExchangeRatesOnDateResponse response = (GetListOfExchangeRatesOnDateResponse)
                marshalSendAndReceive(cbrApiUrl, getXmlOfDate);

        if (response == null) {
            throw new IllegalStateException("Could not get response from CBR Service");
        }

        final List<ExchangeRateOnDate> exchangeRates = response
                .getGetListOfExchangeRatesOnDate()
                .getExchangeRatesOnDate();

        exchangeRates.forEach(rate -> rate.setCurrencyName(rate.getCurrencyName().trim()));
        return exchangeRates;
    }
}
