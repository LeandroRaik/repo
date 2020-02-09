/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;



import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import javax.net.ssl.HttpsURLConnection;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author Leandro
 */
public class RequestRF  {
    public static String requestrf(String id) throws IOException {
             String Bearer = System.getenv("Bearer");
                        String Entid = System.getenv("entityid");
                        
	 URL url = new URL("https://test.oppwa.com/v1/payments/"+id);

	HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
	conn.setRequestMethod("POST");
                          conn.setRequestProperty("Authorization", Bearer);
	conn.setDoInput(true);
	conn.setDoOutput(true);

	String data = ""
		+ "entityId="+Entid
		+ "&amount=10.00"
		+ "&currency=BRL"
		+ "&paymentType=RF";

	     
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
    

