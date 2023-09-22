package com.javarush.task.task33.task3308;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

/* 
Создание класса по строке xml
*/

public class Solution {
    public static void main(String[] args) throws JAXBException {
        String xmlData =
                """
                        <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                        <shop>
                            <goods>
                                <names>S1</names>
                                <names>S2</names>
                            </goods>
                            <count>12</count>
                            <profit>123.4</profit>
                            <secretData>String1</secretData>
                            <secretData>String2</secretData>
                            <secretData>String3</secretData>
                            <secretData>String4</secretData>
                            <secretData>String5</secretData>
                        </shop>""";

        StringReader reader = new StringReader(xmlData);

        JAXBContext context = JAXBContext.newInstance(getClassName());
        Unmarshaller unmarshaller = context.createUnmarshaller();

        Object o = unmarshaller.unmarshal(reader);

        System.out.println(o.toString());
    }

    public static Class<?> getClassName() {
        return Shop.class;  //your class name
    }
}
