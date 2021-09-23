package com.example.telegrambot.dto;

import lombok.Data;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ExchangeRateOnDate")
@Data
public class ExchangeRateOnDate {

    @XmlElement(name = "NameCurrency")
    private String currencyName;

    @XmlElement(name = "NominalCurrency")
    private int currencyNominal;

    @XmlElement(name = "RateCurrency")
    private double currencyRate;

    @XmlElement(name = "Vcode")
    private String code;

    @XmlElement(name = "VchCode")
    private String chCode;
}
