package com.gerixsoft.json2xml2;

import org.junit.Test;
import org.xml.sax.SAXException;

import javax.xml.transform.TransformerException;

public class TestJsonToXml {
    @Test
    public void testFoo() throws TransformerException, SAXException {
        String filename = Thread.currentThread().getContextClassLoader().getResource("sample.json").toString().replaceFirst("file:", "");
        String output_text = new JsonToXml(true).transform(filename);
        assert output_text != null;
        System.out.println(output_text);
    }
}
