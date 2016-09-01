package com.omerenlicay.springinterface;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // Araba araba =new Araba();
        
    	BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("springConf.xml"));
        
    	Araba araba =(Araba) beanFactory.getBean("araba");
    	araba.calistir();
    }
}
