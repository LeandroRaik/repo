/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.apache.commons.io.IOUtils;
import org.jsoup.Jsoup;


/**
 *
 * @author Leandro
 */
public class requestpagamento {public static String request() throws IOException {
                        String Bearer = System.getenv("Bearer");
                        String Entid = System.getenv("entityid");
                       URL url = new URL("https://test.oppwa.com/v1/payments");

	HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
	conn.setRequestMethod("POST");
                        conn.setRequestProperty("Authorization", Bearer);
	conn.setDoInput(true);
	conn.setDoOutput(true);

	String data = ""
		+ "entityId="+Entid
		+ "&amount=92.00"
		+ "&currency=BRL"
		+ "&paymentBrand=MASTER"
		+ "&paymentType=PA"
		+ "&card.number=5454545454545454"
		+ "&card.holder=Ednaldo Pereira"
                                                + "&customer.identificationDocType=TAXSTATEMENT "
		+ "&customer.identificationDocId=70383053102 "
		+ "&card.expiryMonth=05"
		+ "&card.expiryYear=2020"
		+ "&card.cvv=123";
                         
	DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
	wr.writeBytes(data);
                        wr.flush();
	wr.close();
	int responseCode = conn.getResponseCode();
	InputStream is;
                

	if (responseCode >= 400) is = conn.getErrorStream();
	else is = conn.getInputStream();
                   
          
     
        return IOUtils.toString (is);
}
        
    
}
