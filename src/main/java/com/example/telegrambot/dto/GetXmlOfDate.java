package com.example.telegrambot.dto;

import lombok.Data;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlRootElement(name = "DatesForCurrencyExchange", namespace = "https://web.cbr.ru/")
@Data
public class GetXmlOfDate {

    @XmlElement(name = "OnDate", required = true, namespace = "https://web.cbr.ru/")
    protected XMLGregorianCalendar onDate;
}
