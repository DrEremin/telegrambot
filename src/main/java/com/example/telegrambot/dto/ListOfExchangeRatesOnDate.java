package com.example.telegrambot.dto;

import lombok.Data;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;
import java.util.ArrayList;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ListOfExchangeRatesOnDate")
@Data
public class ListOfExchangeRatesOnDate {

    @XmlElementWrapper(name = "ListOfExchangeRatesOnDate", namespace = "")
    @XmlElement(name = "ExchangeRateOnDate", namespace = "")
    private List<ExchangeRateOnDate> exchangeRatesOnDate = new ArrayList<>();
}
