package com.osf.web;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlPaserTest {

	public static void main(String[] args) {

		String path = "C:\\Users\\Administrator\\git\\osf-spweb\\src\\main\\resources\\spring\\application-config.xml";
		// application-config.xml 경로
		File f = new File(path);
		DocumentBuilderFactory dBuildFactory = DocumentBuilderFactory.newInstance();

		try {
			DocumentBuilder dBuilder = dBuildFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(f);
			Element root = doc.getDocumentElement();
			//System.out.println(root.getAttribute("xsi:schemaLocation"));
			NodeList nodes = root.getElementsByTagName("bean");
			for (int i = 0; i < nodes.getLength(); i++) {
				Element bean = (Element) nodes.item(i);
				System.out.println(bean.getAttribute("id"));
				System.out.println(bean.getAttribute("class"));
			}

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
