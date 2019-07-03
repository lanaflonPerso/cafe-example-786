package com.xml;

import com.xml.domain.Address;
import com.xml.domain.Color;
import com.xml.domain.Dog;
import com.xml.domain.DogBox;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Demo
{
    public static void main(String[] args) throws Exception
    {


//        convertAddressToXml();
//        convertXmlStringToObject();
//        convertXmlFileToDogBox();

//        convertDogToXml();
//        convertDogBoxToXml();

        readDataTheInternet("http://www.google.com");
    }

    private static void convertXmlStringToObject() throws JAXBException
    {
        System.out.println("====== Address from XML ========\n");


        String addressXml = getAddressXml();
        StringReader reader = new StringReader(addressXml);

        JAXBContext context = JAXBContext.newInstance(Address.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        Address address = (Address) unmarshaller.unmarshal(reader);

        System.out.println(address);

        System.out.println("======================\n");

    }

    private static void convertXmlFileToDogBox() throws Exception
    {
        System.out.println("====== DogBox from XML ========\n");

        System.out.println(new File("src/dogbox.xml").getAbsolutePath());
        FileReader reader = new FileReader("src/dogbox.xml");

        JAXBContext context = JAXBContext.newInstance(Address.class, Dog.class, DogBox.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        DogBox dogBox = (DogBox) unmarshaller.unmarshal(reader);

        System.out.println(dogBox);

        System.out.println("======================\n");

    }

    private static String getAddressXml()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("<address>");
        builder.append("<city>Wroclaw</city>");
        builder.append("<country>Poland</country>");
        builder.append("<home>5</home>");
        builder.append("<id>100</id>");
        builder.append("</address>");

        return builder.toString();
    }


    private static void convertAddressToXml() throws JAXBException
    {
        System.out.println("Address to XML -------->\n");

        JAXBContext context = JAXBContext.newInstance(Address.class);

        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        StringWriter output = new StringWriter();

        Address address = getDemoAddress();

        marshaller.marshal(address, output);

        System.out.println(output.toString());
        System.out.println("======================\n");

    }

    private static void convertDogToXml() throws JAXBException
    {
        System.out.println("Dog to XML -------->\n");


        JAXBContext context = JAXBContext.newInstance(Address.class, Dog.class);

        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        StringWriter output = new StringWriter();


        Dog dog = getDogList().get(0);

        marshaller.marshal(dog, output);

        System.out.println(output.toString());

        System.out.println("======================\n");
    }


    private static void convertDogBoxToXml() throws JAXBException
    {
        System.out.println("DogBox to XML -------->\n");

        JAXBContext context = JAXBContext.newInstance(Address.class, Dog.class, DogBox.class);

        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        StringWriter output = new StringWriter();


        DogBox dogBox = getDogBox();

        marshaller.marshal(dogBox, output);

        System.out.println(output.toString());
        System.out.println("======================\n");

    }

    private static DogBox getDogBox()
    {
        DogBox dogBox = new DogBox();

        dogBox.setDogList(getDogList());

        return dogBox;
    }

    private static List<Dog> getDogList()
    {
        List<Dog> dogList = new ArrayList<>();

        Dog dog = new Dog();

        dog.setId(1000);
        dog.setName("Rex");
        dog.setAge(18);
        dog.setColor(Color.BLACK);
        dog.setAddress(getDemoAddress());

        dogList.add(dog);

        dog = new Dog();

        dog.setId(1001);
        dog.setName("Linda");
        dog.setAge(16);
        dog.setColor(Color.WHITE);
        dog.setAddress(getDemoAddress());

        dogList.add(dog);

        return dogList;
    }

    private static Address getDemoAddress()
    {
        Address address = new Address();

        address.setCountry("Poland");
        address.setCity("Wroclaw");
        address.setHome(5);
        address.setId(100);

        return address;
    }

    private static void readDataTheInternet(String urlString) throws Exception
    {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        InputStreamReader reader = new InputStreamReader(connection.getInputStream());

        BufferedReader bufferedReader = new BufferedReader(reader);

        String line;

        while ((line = bufferedReader.readLine()) != null)
        {
            System.out.println(line);
        }
    }

}
