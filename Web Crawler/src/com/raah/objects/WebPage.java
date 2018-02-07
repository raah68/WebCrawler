package com.raah.objects;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.raah.webcrawler.main.WebCrawler;

public class WebPage {
	private Anchor anchor;
	private String webPageHash; 
	private int anchorPageStatus;
	private int emailParseStatus;
	private Document document;
	
	


	public WebPage(Anchor anchor) {
		this.anchor = anchor;
	} //end of constructor
	
	public int getAnchorPageStatus() {
		return anchorPageStatus;
	}
		
	public String getWebPageHash() {
		return webPageHash;
	}

	public int getEmailParseStatus() {
		return emailParseStatus;
	}

	public Document getDocument() {
		return document;
	}

	/**
	 * Method to get the Web site using an URL
	 * @param url an absolute URL to crawl 
	 */
	public void loadDocumentFromWeb() {	
		try {
			document = Jsoup.connect(anchor.getAnchorUrl()).get();
			Elements links = document.select("a");
			for(Element e : links) {
				System.out.println(e.attr("abs:href"));
			}
		} catch (IOException ex) {
			Logger.getLogger(WebCrawler.class.getName()).log(Level.SEVERE, null, ex);
		}
	} //end of method loadDocumentFromWeb
	
	
	
	

}
