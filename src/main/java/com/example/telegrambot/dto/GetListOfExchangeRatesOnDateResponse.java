package com.example.telegrambot.dto;

import lombok.Data;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "GetListsOfExchangeRatesOnDateResponse", namespace = "http://web.cbr.ru/")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class GetListOfExchangeRatesOnDateResponse {

    @XmlElement(name = "GetListOfExchangeRatesOnDateResponse", namespace = "http://web.cbr.ru/")
    private ListOfExchangeRatesOnDate getListOfExchangeRatesOnDate;
}
