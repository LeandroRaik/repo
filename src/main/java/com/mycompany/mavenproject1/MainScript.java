/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import static com.mycompany.mavenproject1.RequestCP.requestcp;
import static com.mycompany.mavenproject1.RequestRF.requestrf;
import static com.mycompany.mavenproject1.idmet.idmeta;
import static com.mycompany.mavenproject1.requestpagamento.request;
import java.io.IOException;

/**
 *
 * @author Leandro
 */
public class MainScript {

    private String pagref() throws IOException {     idmet idzada = new idmet();
        String id =  idzada. idmeta();
         System.out.println(id);
    
    
    
    
    return id;
        
    }
   
         

   
    public static void main(String[] args) throws IOException {
        idmet idzada = new idmet();
        String id =  idzada. idmeta();
         System.out.println(id);
     
   
   
        
       RequestCP IDCP= new RequestCP();
       
        String resultadocp= requestcp(id);
        String idcp = resultadocp.substring(7,39);
        System.out.println(resultadocp);
      
        RequestRF IDRF= new RequestRF();
        String  resultadorf = requestrf(idcp);
        
        System.out.println(resultadorf); 
     
    

        
        
       
        
        
        }}

                 
        
    

         
   



