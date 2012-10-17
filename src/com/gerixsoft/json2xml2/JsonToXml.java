package com.gerixsoft.json2xml2;

import java.io.File;
import java.io.IOException;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class JsonToXml {

	public static void main(String[] args) throws IOException, SAXException, TransformerException {
		if (args.length != 2) {
			System.err.println("usage: <input-json-file-or-directory> <output-xml-file-or-directory>");
			System.exit(-1);
		}
		new JsonToXml().transform(new File(args[0]), new File(args[1]));
		System.out.println("ok");
	}

	private Transformer transformer;
	private Validator validator;

	JsonToXml() throws SAXException, TransformerConfigurationException {
		transformer = TransformerFactory.newInstance().newTransformer();

		SchemaFactory schemaFactory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
		Schema schema = schemaFactory.newSchema(new StreamSource(JsonToXml.class.getResourceAsStream("json.xsd")));
		validator = schema.newValidator();
		validator.setErrorHandler(new __ErrorHandler());
	}

	public void transform(File input, File output) throws SAXException, IOException, TransformerException {
		if (input.isDirectory()) {
			output.mkdir();
			for (File child : input.listFiles()) {
				if (child.isDirectory()) {
					transform(child, new File(output, child.getName()));
				} else if (child.getName().endsWith(".json")) {
					transform(child, new File(output, child.getName().concat(".xml")));
				}
			}
			return;
		}
		transformer.transform(new SAXSource(new JsonSaxParser(), new InputSource(input.toString())), new StreamResult(output));
		validator.validate(new StreamSource(output));
	}

	private static final class __ErrorHandler implements ErrorHandler {
		@Override
		public void warning(SAXParseException exception) throws SAXException {
			log("warning", exception);
		}

		@Override
		public void fatalError(SAXParseException exception) throws SAXException {
			log("fatal error", exception);
		}

		@Override
		public void error(SAXParseException exception) throws SAXException {
			log("error", exception);
		}

		public void log(String type, SAXParseException exception) {
			System.err.println(type + " at line: " + exception.getLineNumber() + " col:" + exception.getColumnNumber() + " message: " + exception.getMessage());
		}
	}

}
