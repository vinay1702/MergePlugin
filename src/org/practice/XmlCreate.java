package org.practice;

import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class XmlCreate {

	public static void main(String[] args) {
		
		try {
			JAXBContext context = JAXBContext.newInstance(Employee.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			Employee employee = new Employee(1,"Vinay","Technology","Software Developer",30000);
			marshaller.marshal(employee, new FileOutputStream("employee.xml"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
