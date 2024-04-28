package com.app.service;

import com.app.model_xml.books.BooksForm;
import com.app.model_xml.books.ObjectFactory;
import jakarta.xml.bind.JAXB;
import jakarta.xml.bind.JAXBElement;

import java.io.StringWriter;

public class JaxbService {
    public static String objectToXmlString(BooksForm booksForm) {
        ObjectFactory objectFactory = new ObjectFactory();
        JAXBElement<BooksForm> books = objectFactory.createBooks(booksForm);

        StringWriter stringWriter = new StringWriter();
        JAXB.marshal(books, stringWriter);
        return stringWriter.toString();
    }

}
