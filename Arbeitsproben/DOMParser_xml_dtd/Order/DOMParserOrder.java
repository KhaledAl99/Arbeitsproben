package order;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOMParserOrder {
	
	
	
	static final String FILEPATH_IN = "src/order/Order.xml";
	private static Document doc;
	
	
	 // Methode zum Einlesen der XML-Datei
	public static void read() {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setIgnoringElementContentWhitespace(true);

		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			doc = builder.parse(new File(FILEPATH_IN));

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	 public static List<String[]> extractProducts(Document doc) {
		    List<String[]> products = new ArrayList<>();
		    NodeList productNodes = doc.getElementsByTagName("Product");

		    for (int i = 0; i < productNodes.getLength(); i++) {
		        Element product = (Element) productNodes.item(i);

		        String name = product.getElementsByTagName("Productname").item(0).getTextContent().trim();
		        double price = Double.parseDouble(product.getElementsByTagName("Price").item(0).getTextContent().trim());
		        int quantity = Integer.parseInt(product.getElementsByTagName("Quantity").item(0).getTextContent().trim());
		        double total = price * quantity;

		        products.add(new String[]{name, String.valueOf(price), String.valueOf(quantity), String.valueOf(total)});
		    }

		    return products;
		}
	

	public static void main(String[] args) {
		
		read();
		
		
		List<String[]> products = extractProducts(doc);
		System.out.println(String.format("%-20s %-10s %-10s %-10s", "Name", "Price", "Quantity", "Total"));
		System.out.println("--------------------------------------------");

		for (String[] product : products) {
		    
		    System.out.printf("%-20s %-10s %-10s %-10s%n", 
		        product[0], product[1], product[2], product[3]);
		}
		
		
     
	}

}
