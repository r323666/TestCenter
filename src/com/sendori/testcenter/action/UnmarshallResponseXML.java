package com.sendori.testcenter.action;

import com.sendori.testcenter.xsd.LookSmartResults;
import com.sendori.testcenter.xsd.ObjectFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.InputStreamReader;

/**
 * TODO: Enter JavaDoc
 *
 * @since JDK 1.5
 */
public class UnmarshallResponseXML {

    public static void main(String[] args) {

    }

    public static LookSmartResults getJAXB(InputStreamReader in) {
        LookSmartResults element = null;
        try {
            JAXBContext jc = JAXBContext.newInstance(ObjectFactory.class);

            Unmarshaller u = jc.createUnmarshaller();
            element = (LookSmartResults) u.unmarshal(in);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return element;
    }

    public static LookSmartResults getJAXB(File in) {
        LookSmartResults element = null;
        try {
            JAXBContext jc = JAXBContext.newInstance(ObjectFactory.class);

            Unmarshaller u = jc.createUnmarshaller();
            element = (LookSmartResults) u.unmarshal(in);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return element;
    }
}
