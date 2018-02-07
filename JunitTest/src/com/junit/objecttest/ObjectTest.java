package com.junit.objecttest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.raah.objects.Anchor;
import com.raah.objects.Domain;
import com.raah.objects.WebPage;

public class ObjectTest {

	@Test
	public void webPageLoadFromWeb() {
		checkIfPageIsValid();
		
	} //end of test webPageLoadFromWeb
	
	public void checkIfPageIsValid() {
		Domain domain = new Domain("1234-124","http://jsoup.org/");
		Anchor anchor = new Anchor(domain, "1234-124","http://jsoup.org/");
		WebPage webPage = new WebPage(anchor);
		webPage.loadDocumentFromWeb();
		assertTrue("", webPage.getDocument() != null);
	} //end of class 
	
} //end of test class
