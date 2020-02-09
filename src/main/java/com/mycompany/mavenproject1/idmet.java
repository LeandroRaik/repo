/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import static com.mycompany.mavenproject1.requestpagamento.request;
import java.io.IOException;

/**
 *
 * @author Leandro
 */
public class idmet {
      public  static String idmeta () throws IOException {
          
         
        requestpagamento IDPAG = new requestpagamento();
        String reqid ;
        reqid = request( );
        String id = reqid.substring(7,39);
            return(id);
            }
      
}

