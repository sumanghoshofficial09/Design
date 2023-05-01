import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;

public class Client {
	
	public static void main(String args[])
	{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		System.out.println(factory.getClass().getName());
		
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			
			System.out.println(builder.getClass().getName());
			
			Document doc = builder.newDocument();
			
			System.out.println(doc.toString());
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
