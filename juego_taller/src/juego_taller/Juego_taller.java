/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_taller;

import java.util.Scanner;


public class Juego_taller {
    

    public static void main(String[] args) {
        
        Scanner datos;
        int player =0,op=0,p1=0,p2=0,p3=0,p4=0,dado=0,i=0,numero=0,numero2=0,j1=0;
        datos = new Scanner(System.in);
        
        //SELECIONAR LA CANTIDAD DE JUGADORES  
        System.out.println("------------------------------------------");
        System.out.println(".:::::::::: NUMERO DE JUGADORES :::::::::.");
        System.out.println("------------------------------------------");
        System.out.println("");
        System.out.println("selecione la cantidad de jugadores: ");
        System.out.println("minimo [2] y maximo [4]");
        player = datos.nextInt();
        
        //SELECIONAR LA DIFICULTAD
        System.out.println("");
        System.out.println("------------------------------------------");
        System.out.println(".::::::::::::: DIFICULTAD :::::::::::::::.");
        System.out.println("------------------------------------------");
        System.out.println("");
        System.out.println("selecione la dificultad:"); 
        System.out.println("nivel basico     [1]");
        System.out.println("nivel intermedio [2]");
        System.out.println("nivel avanzado   [3]");
        op = datos.nextInt();
        
        //AREGLAR LA CANTIDAD CUN EXEDE LAS CANTIDADES DE JUGADORES Y DIFICULTAD
        if(player>4 || player<2){
            
            //ARREGLAR LA CANTIDAD
            while(player!=4 && player!=2 && player!=3){
               System.out.println("");
               System.out.println("------------------------------------------");
               System.out.println(".::::::::::::::::: ERROR ::::::::::::::::.");
               System.out.println("------------------------------------------");
               System.out.println("");
               System.out.println("NO SE PUEDEN ["+player+"] "+"JUGADORES");
               System.out.println("");
               System.out.println("selececione una cantidad valida: ");
               System.out.println("minimo [2] y maximo [4]");
               player = datos.nextInt();
            }    
        }
        if(op>3 || op<1){
            
            //ARREGLAR LA DIFICULTAD
            while(op!=3 && op!=2 && op!=1){
               System.out.println("");
               System.out.println("------------------------------------------");
               System.out.println(".::::::::::::::::: ERROR ::::::::::::::::.");
               System.out.println("------------------------------------------");
               
               System.out.println("NO SE PUEDEN ["+op+"] "+"DIFICULTAD");
               System.out.println("");
               System.out.println("selecione la dificultad:"); 
               System.out.println("nivel basico     [1]");
               System.out.println("nivel intermedio [2]");
               System.out.println("nivel avanzado   [3]");
               op = datos.nextInt();  
            }
        }
        
        //INICIO DEL CODIGO SEGUN LA DIFICULTAD Y LA CANTIDAD DE JUGADORES
        if (player>=2 && player<=4){
            
            System.out.println(""); 
            System.out.println("--------------------------------------");
            System.out.println(".::::::::: CARRERA NUMERICA :::::::::.");
            System.out.println("--------------------------------------");
            System.out.println("");
            //INICIO LA PRIMERA OPCION
            if (player==2 && op==1){
                
                System.out.println("Nivel [BASICO]");
                System.out.println("Numero de jugadores: ["+player+"]");
                
                while(p1!=20 && p2!=20){
                    
                    //PLAYER 1
                    if(p1<14){
                        
                        //GENERAR LOS DADOS
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 1 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR LOS DADOS");
                        dado= datos.nextInt();
                        
                        for(i=1; i<=1; i++){
                            numero = (int) (Math.random()*6+1);
                            p1=p1+numero;
                        }
                        for(i=1; i<=1; i++){
                            numero2 = (int) (Math.random()*6+1); 
                            p1=p1+numero2;
                        }
                        
                        System.out.println("PRIMER DADO SALIO: "+numero);
                        System.out.println("SEGUNDO2 DADO SALIO: "+numero2);
                         
             
                        //VALIDAR SI SALIERON PARES Y SI SON 3 GANA DIRECTAMENTE
                        if (numero==numero2){

                            System.out.println(".:[SACASTE PAR]:.");
                            j1++;
                     
                        }else{
                            j1=0;
                        }
                        if(j1==3){
                            p1=20;
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 1 AVANSO "+p1+" CASILLAS");
                        
                    }else if(p1<20 && p1>=14){
                        
                        //LANZAR UN SOLO DADO SI LA CANTIDAD ESTA EN 14
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 1 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR EL DADO");
                        dado= datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){
                            
                           numero = (int) (Math.random()*6+1);
                           System.out.println("DADO NUMERO: "+numero);
                           
                           //VERIFICAR QUE EL NUMERO QUE SALIO SEA MENOR A LAS CASILLAS
                            if(p1+numero>20){
                                
                                System.out.println(".:[NO PUEDE AVANSAR CON [" +numero+"]SE PASA]:.");
                            }else{
                                
                                p1=p1+numero;
                            }  
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 1 ESTA EN LA CASILLA ["+p1+"]");
                        
                    }
                    //PLAYER 2
                    if(p2<14){
                        
                        //GENERAR LOS DADOS
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 2 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR LOS DADOS");
                        dado= datos.nextInt();
                        
                        for(i=1; i<=1; i++){
                            numero = (int) (Math.random()*6+1);
                            p2=p2+numero;
                        }
                        for(i=1; i<=1; i++){
                            numero2 = (int) (Math.random()*6+1); 
                            p2=p2+numero2;
                        }
                        
                        System.out.println("PRIMER DADO SALIO: "+numero);
                        System.out.println("SEGUNDO2 DADO SALIO: "+numero2);
             
                        //VALIDAR SI SALIERON PARES Y SI SON 3 GANA DIRECTAMENTE
                        if (numero==numero2){

                            System.out.println(".:[SACASTE PAR]:.");
                            j1++;
                     
                        }else{
                            j1=0;
                        }
                        if(j1==3){
                            p2=20;
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 1 AVANSO "+p2+" CASILLAS");
                        
                    }else if(p2<20 && p2>=14){
                        
                        //LANZAR UN SOLO DADO SI LA CANTIDAD ESTA EN 14
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 2 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR EL DADO");
                        dado= datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){
                            
                           numero = (int) (Math.random()*6+1);
                           System.out.println("DADO NUMERO: "+numero);
                           
                            //VERIFICAR QUE EL NUMERO QUE SALIO SEA MENOR A LAS CASILLAS
                            if(p2+numero>20){
                                
                                System.out.println(".:[NO PUEDE AVANSAR CON [" +numero+"]SE PASA]:.");
                            }else{
                                
                                p2=p2+numero;
                            }  
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 2 ESTA EN LA CASILLA ["+p2+"]");
                    }
                }
              //SEGUNDA OPCION      
            }else if(player==3 && op==1){
                
                System.out.println("NIVEL [BASICO]");
                System.out.println("NUMERO DE JUGADORES: ["+player+"]");

                while(p1!=20 && p2!=20 && p3!=20){
                    
                    //PLAYER 1
                    if(p1<14){
                        
                        //GENERAR LOS DADOS
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 1 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR LOS DADOS");
                        dado= datos.nextInt();
                        
                        for(i=1; i<=1; i++){
                            numero = (int) (Math.random()*6+1);
                            p1=p1+numero;
                        }
                        for(i=1; i<=1; i++){
                            numero2 = (int) (Math.random()*6+1); 
                            p1=p1+numero2;
                        }
                        
                        System.out.println("PRIMER DADO SALIO: "+numero);
                        System.out.println("SEGUNDO2 DADO SALIO: "+numero2);
             
                        //VALIDAR SI SALIERON PARES Y SI SON 3 GANA DIRECTAMENTE
                        if (numero==numero2){

                            System.out.println(".:[SACASTE PAR]:.");
                            j1++;
                     
                        }else{
                            j1=0;
                        }
                        if(j1==3){
                            p1=20;
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 1 AVANSO "+p1+" CASILLAS");
                        
                    }else if(p1<20 && p1>=14){
                        
                        //LANZAR UN SOLO DADO SI LA CANTIDAD ESTA EN 14
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 1 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR EL DADO");
                        dado= datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){
                            
                           numero = (int) (Math.random()*6+1);
                           System.out.println("DADO NUMERO: "+numero);
                           
                           //VERIFICAR QUE EL NUMERO QUE SALIO SEA MENOR A LAS CASILLAS
                            if(p1+numero>20){
                                
                                System.out.println(".:[NO PUEDE AVANSAR CON [" +numero+"]SE PASA]:.");
                            }else{
                                
                                p1=p1+numero;
                            }  
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 1 ESTA EN LA CASILLA ["+p1+"]");
                        
                    }
                
                    //PLAYER 2
                    if(p2<14){
                        
                        //GENERAR LOS DADOS
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 2 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR LOS DADOS");
                        dado= datos.nextInt();
                        
                        for(i=1; i<=1; i++){
                            numero = (int) (Math.random()*6+1);
                            p2=p2+numero;
                        }
                        for(i=1; i<=1; i++){
                            numero2 = (int) (Math.random()*6+1); 
                            p2=p2+numero2;
                        }
                        
                        System.out.println("PRIMER DADO SALIO: "+numero);
                        System.out.println("SEGUNDO2 DADO SALIO: "+numero2);
             
                        //VALIDAR SI SALIERON PARES Y SI SON 3 GANA DIRECTAMENTE
                        if (numero==numero2){

                            System.out.println(".:[SACASTE PAR]:.");
                            j1++;
                     
                        }else{
                            j1=0;
                        }
                        if(j1==3){
                            p2=20;
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 2 AVANSO "+p2+" CASILLAS");
                        
                    }else if(p2<20 && p2>=14){
                        
                        //LANZAR UN SOLO DADO SI LA CANTIDAD ESTA EN 14
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 2 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR EL DADO");
                        dado= datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){
                            
                           numero = (int) (Math.random()*6+1);
                           System.out.println("DADO NUMERO: "+numero);
                           
                            //VERIFICAR QUE EL NUMERO QUE SALIO SEA MENOR A LAS CASILLAS
                            if(p2+numero>20){
                                
                                System.out.println(".:[NO PUEDE AVANSAR CON [" +numero+"]SE PASA]:.");
                            }else{
                                
                                p2=p2+numero;
                            }  
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 2 ESTA EN LA CASILLA ["+p2+"]");
                    }
                    
                    //PLATER 3
                    if(p3<14){
                        
                        //GENERAR LOS DADOS
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 3 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR LOS DADOS");
                        dado= datos.nextInt();
                        
                        for(i=1; i<=1; i++){
                            numero = (int) (Math.random()*6+1);
                            p3=p3+numero;
                        }
                        for(i=1; i<=1; i++){
                            numero2 = (int) (Math.random()*6+1); 
                            p3=p3+numero2;
                        }
                        
                        System.out.println("PRIMER DADO SALIO: "+numero);
                        System.out.println("SEGUNDO2 DADO SALIO: "+numero2);
             
                        //VALIDAR SI SALIERON PARES Y SI SON 3 GANA DIRECTAMENTE
                        if (numero==numero2){

                            System.out.println(".:[SACASTE PAR]:.");
                            j1++;
                     
                        }else{
                            j1=0;
                        }
                        if(j1==3){
                            p3=20;
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 3 AVANSO "+p3+" CASILLAS");
                        
                    }else if(p3<20 && p3>=14){
                        
                        //LANZAR UN SOLO DADO SI LA CANTIDAD ESTA EN 14
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 3 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR EL DADO");
                        dado= datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){
                            
                           numero = (int) (Math.random()*6+1);
                           System.out.println("DADO NUMERO: "+numero);
                           
                            //VERIFICAR QUE EL NUMERO QUE SALIO SEA MENOR A LAS CASILLAS
                            if(p3+numero>20){
                                
                                System.out.println(".:[NO PUEDE AVANSAR CON [" +numero+"]SE PASA]:.");
                            }else{
                                
                                p3=p3+numero;
                            }  
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 3 ESTA EN LA CASILLA ["+p3+"]");
                    }
                }
                
              //TERCER OPCION
            }else if(player==4 && op==1){    
                
                System.out.println("NIVEL [BASICO]");
                System.out.println("NUMERO DE JUGADORES: ["+player+"]");
                
                while(p1!=20 && p2!=20 && p3!=20 && p4!=20){
                    
                    //PLAYER 1
                    if(p1<14){
                        
                        //GENERAR LOS DADOS
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 1 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR LOS DADOS");
                        dado= datos.nextInt();
                        
                        for(i=1; i<=1; i++){
                            numero = (int) (Math.random()*6+1);
                            p1=p1+numero;
                        }
                        for(i=1; i<=1; i++){
                            numero2 = (int) (Math.random()*6+1); 
                            p1=p1+numero2;
                        }
                        
                        System.out.println("PRIMER DADO SALIO: "+numero);
                        System.out.println("SEGUNDO2 DADO SALIO: "+numero2);
             
                        //VALIDAR SI SALIERON PARES Y SI SON 3 GANA DIRECTAMENTE
                        if (numero==numero2){

                            System.out.println(".:[SACASTE PAR]:.");
                            j1++;
                     
                        }else{
                            j1=0;
                        }
                        if(j1==3){
                            p1=20;
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 1 AVANSO "+p1+" CASILLAS");
                        
                    }else if(p1<20 && p1>=14){
                        
                        //LANZAR UN SOLO DADO SI LA CANTIDAD ESTA EN 14
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 1 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR EL DADO");
                        dado= datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){
                            
                           numero = (int) (Math.random()*6+1);
                           System.out.println("DADO NUMERO: "+numero);
                           
                           //VERIFICAR QUE EL NUMERO QUE SALIO SEA MENOR A LAS CASILLAS
                            if(p1+numero>20){
                                
                                System.out.println(".:[NO PUEDE AVANSAR CON [" +numero+"]SE PASA]:.");
                            }else{
                                
                                p1=p1+numero;
                            }  
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 1 ESTA EN LA CASILLA ["+p1+"]");
                        
                    }
                    //PLAYER 2
                    if(p2<14){
                        
                        //GENERAR LOS DADOS
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 2 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR LOS DADOS");
                        dado= datos.nextInt();
                        
                        for(i=1; i<=1; i++){
                            numero = (int) (Math.random()*6+1);
                            p2=p2+numero;
                        }
                        for(i=1; i<=1; i++){
                            numero2 = (int) (Math.random()*6+1); 
                            p2=p2+numero2;
                        }
                        
                        System.out.println("PRIMER DADO SALIO: "+numero);
                        System.out.println("SEGUNDO2 DADO SALIO: "+numero2);
             
                        //VALIDAR SI SALIERON PARES Y SI SON 3 GANA DIRECTAMENTE
                        if (numero==numero2){

                            System.out.println(".:[SACASTE PAR]:.");
                            j1++;
                     
                        }else{
                            j1=0;
                        }
                        if(j1==3){
                            p2=20;
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 2 AVANSO "+p2+" CASILLAS");
                        
                    }else if(p2<20 && p2>=14){
                        
                        //LANZAR UN SOLO DADO SI LA CANTIDAD ESTA EN 14
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 2 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR EL DADO");
                        dado= datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){
                            
                           numero = (int) (Math.random()*6+1);
                           System.out.println("DADO NUMERO: "+numero);
                           
                            //VERIFICAR QUE EL NUMERO QUE SALIO SEA MENOR A LAS CASILLAS
                            if(p2+numero>20){
                                
                                System.out.println(".:[NO PUEDE AVANSAR CON [" +numero+"]SE PASA]:.");
                            }else{
                                
                                p2=p2+numero;
                            }  
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 2 ESTA EN LA CASILLA ["+p2+"]");
                    }
                    
                    //PLATER 3
                    if(p3<14){
                        
                        //GENERAR LOS DADOS
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 3 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR LOS DADOS");
                        dado= datos.nextInt();
                        
                        for(i=1; i<=1; i++){
                            numero = (int) (Math.random()*6+1);
                            p3=p3+numero;
                        }
                        for(i=1; i<=1; i++){
                            numero2 = (int) (Math.random()*6+1); 
                            p3=p3+numero2;
                        }
                        
                        System.out.println("PRIMER DADO SALIO: "+numero);
                        System.out.println("SEGUNDO2 DADO SALIO: "+numero2);
             
                        //VALIDAR SI SALIERON PARES Y SI SON 3 GANA DIRECTAMENTE
                        if (numero==numero2){

                            System.out.println(".:[SACASTE PAR]:.");
                            j1++;
                     
                        }else{
                            j1=0;
                        }
                        if(j1==3){
                            p3=20;
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 3 AVANSO "+p3+" CASILLAS");
                        
                    }else if(p3<20 && p3>=14){
                        
                        //LANZAR UN SOLO DADO SI LA CANTIDAD ESTA EN 14
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 3 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR EL DADO");
                        dado= datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){
                            
                           numero = (int) (Math.random()*6+1);
                           System.out.println("DADO NUMERO: "+numero);
                           
                            //VERIFICAR QUE EL NUMERO QUE SALIO SEA MENOR A LAS CASILLAS
                            if(p3+numero>20){
                                
                                System.out.println(".:[NO PUEDE AVANSAR CON [" +numero+"]SE PASA]:.");
                            }else{
                                
                                p3=p3+numero;
                            }  
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 3 ESTA EN LA CASILLA ["+p3+"]");
                    }
                    //PLATER 4
                    if(p4<14){
                        
                        //GENERAR LOS DADOS
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 4 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR LOS DADOS");
                        dado= datos.nextInt();
                        
                        for(i=1; i<=1; i++){
                            numero = (int) (Math.random()*6+1);
                            p4=p4+numero;
                        }
                        for(i=1; i<=1; i++){
                            numero2 = (int) (Math.random()*6+1); 
                            p4=p4+numero2;
                        }
                        
                        System.out.println("PRIMER DADO SALIO: "+numero);
                        System.out.println("SEGUNDO2 DADO SALIO: "+numero2);
             
                        //VALIDAR SI SALIERON PARES Y SI SON 3 GANA DIRECTAMENTE
                        if (numero==numero2){

                            System.out.println(".:[SACASTE PAR]:.");
                            j1++;
                     
                        }else{
                            j1=0;
                        }
                        if(j1==3){
                            p4=20;
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 4 AVANSO "+p4+" CASILLAS");
                        
                    }else if(p4<20 && p4>=14){
                        
                        //LANZAR UN SOLO DADO SI LA CANTIDAD ESTA EN 14
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 4 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR EL DADO");
                        dado= datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){
                            
                           numero = (int) (Math.random()*6+1);
                           System.out.println("DADO NUMERO: "+numero);
                           
                            //VERIFICAR QUE EL NUMERO QUE SALIO SEA MENOR A LAS CASILLAS
                            if(p4+numero>20){
                                
                                System.out.println(".:[NO PUEDE AVANSAR CON [" +numero+"]SE PASA]:.");
                            }else{
                                
                                p4=p4+numero;
                            }  
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 4 ESTA EN LA CASILLA ["+p4+"]");
                    }
                }
            }else if(player==2 && op==2){
                
                System.out.println("NIVEL [INTERMEDIO]");
                System.out.println("NUMERO DE JUGADORES: ["+player+"]");
                
                while(p1!=30 && p2!=30){
                    
                    //PLAYER 1
                    if(p1<24){
                        
                        //GENERAR LOS DADOS
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 1 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR LOS DADOS");
                        dado= datos.nextInt();
                        
                        for(i=1; i<=1; i++){
                            numero = (int) (Math.random()*6+1);
                            p1=p1+numero;
                        }
                        for(i=1; i<=1; i++){
                            numero2 = (int) (Math.random()*6+1); 
                            p1=p1+numero2;
                        }
                        
                        System.out.println("PRIMER DADO SALIO: "+numero);
                        System.out.println("SEGUNDO2 DADO SALIO: "+numero2);
             
                        //VALIDAR SI SALIERON PARES Y SI SON 3 GANA DIRECTAMENTE
                        if (numero==numero2){

                            System.out.println(".:[SACASTE PAR]:.");
                            j1++;
                     
                        }else{
                            j1=0;
                        }
                        if(j1==3){
                            p1=30;
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 1 AVANSO "+p1+" CASILLAS");
                        
                    }else if(p1<30 && p1>=24){
                        
                        //LANZAR UN SOLO DADO SI LA CANTIDAD ESTA EN 14
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 1 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR EL DADO");
                        dado= datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){
                            
                           numero = (int) (Math.random()*6+1);
                           System.out.println("DADO NUMERO: "+numero);
                           
                           //VERIFICAR QUE EL NUMERO QUE SALIO SEA MENOR A LAS CASILLAS
                            if(p1+numero>30){
                                
                                System.out.println(".:[NO PUEDE AVANSAR CON [" +numero+"]SE PASA]:.");
                            }else{
                                
                                p1=p1+numero;
                            }  
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 1 ESTA EN LA CASILLA ["+p1+"]");
                        
                    }
                
                    //PLAYER 2
                    if(p2<24){
                        
                        //GENERAR LOS DADOS
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 2 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR LOS DADOS");
                        dado= datos.nextInt();
                        
                        for(i=1; i<=1; i++){
                            numero = (int) (Math.random()*6+1);
                            p2=p2+numero;
                        }
                        for(i=1; i<=1; i++){
                            numero2 = (int) (Math.random()*6+1); 
                            p2=p2+numero2;
                        }
                        
                        System.out.println("PRIMER DADO SALIO: "+numero);
                        System.out.println("SEGUNDO2 DADO SALIO: "+numero2);
             
                        //VALIDAR SI SALIERON PARES Y SI SON 3 GANA DIRECTAMENTE
                        if (numero==numero2){

                            System.out.println(".:[SACASTE PAR]:.");
                            j1++;
                     
                        }else{
                            j1=0;
                        }
                        if(j1==3){
                            p2=30;
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 2 AVANSO "+p2+" CASILLAS");
                        
                    }else if(p2<30 && p2>=24){
                        
                        //LANZAR UN SOLO DADO SI LA CANTIDAD ESTA EN 14
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 2 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR EL DADO");
                        dado= datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){
                            
                           numero = (int) (Math.random()*6+1);
                           System.out.println("DADO NUMERO: "+numero);
                           
                            //VERIFICAR QUE EL NUMERO QUE SALIO SEA MENOR A LAS CASILLAS
                            if(p2+numero>30){
                                
                                System.out.println(".:[NO PUEDE AVANSAR CON [" +numero+"]SE PASA]:.");
                            }else{
                                
                                p2=p2+numero;
                            }  
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 2 ESTA EN LA CASILLA ["+p2+"]");
                    }
                }
              //CUARTA OPCION
            }else if(player==3 && op==2){
                
                System.out.println("NIVEL [INTERMEDIO]");
                System.out.println("NUMERO DE JUGADORES: ["+player+"]");
                
                while(p1!=30 && p2!=30 && p3!=30){
                    
                    //PLAYER 1
                    if(p1<24){
                        
                        //GENERAR LOS DADOS
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 1 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR LOS DADOS");
                        dado= datos.nextInt();
                        
                        for(i=1; i<=1; i++){
                            numero = (int) (Math.random()*6+1);
                            p1=p1+numero;
                        }
                        for(i=1; i<=1; i++){
                            numero2 = (int) (Math.random()*6+1); 
                            p1=p1+numero2;
                        }
                        
                        System.out.println("PRIMER DADO SALIO: "+numero);
                        System.out.println("SEGUNDO2 DADO SALIO: "+numero2);
             
                        //VALIDAR SI SALIERON PARES Y SI SON 3 GANA DIRECTAMENTE
                        if (numero==numero2){

                            System.out.println(".:[SACASTE PAR]:.");
                            j1++;
                     
                        }else{
                            j1=0;
                        }
                        if(j1==3){
                            p1=30;
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 1 AVANSO "+p1+" CASILLAS");
                        
                    }else if(p1<30 && p1>=24){
                        
                        //LANZAR UN SOLO DADO SI LA CANTIDAD ESTA EN 14
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 1 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR EL DADO");
                        dado= datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){
                            
                           numero = (int) (Math.random()*6+1);
                           System.out.println("DADO NUMERO: "+numero);
                           
                           //VERIFICAR QUE EL NUMERO QUE SALIO SEA MENOR A LAS CASILLAS
                            if(p1+numero>30){
                                
                                System.out.println(".:[NO PUEDE AVANSAR CON [" +numero+"]SE PASA]:.");
                            }else{
                                
                                p1=p1+numero;
                            }  
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 1 ESTA EN LA CASILLA ["+p1+"]");
                        
                    }
                
                    //PLAYER 2
                    if(p2<24){
                        
                        //GENERAR LOS DADOS
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 2 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR LOS DADOS");
                        dado= datos.nextInt();
                        
                        for(i=1; i<=1; i++){
                            numero = (int) (Math.random()*6+1);
                            p2=p2+numero;
                        }
                        for(i=1; i<=1; i++){
                            numero2 = (int) (Math.random()*6+1); 
                            p2=p2+numero2;
                        }
                        
                        System.out.println("PRIMER DADO SALIO: "+numero);
                        System.out.println("SEGUNDO2 DADO SALIO: "+numero2);
             
                        //VALIDAR SI SALIERON PARES Y SI SON 3 GANA DIRECTAMENTE
                        if (numero==numero2){

                            System.out.println(".:[SACASTE PAR]:.");
                            j1++;
                     
                        }else{
                            j1=0;
                        }
                        if(j1==3){
                            p2=30;
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 2 AVANSO "+p2+" CASILLAS");
                        
                    }else if(p2<30 && p2>=24){
                        
                        //LANZAR UN SOLO DADO SI LA CANTIDAD ESTA EN 14
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 2 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR EL DADO");
                        dado= datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){
                            
                           numero = (int) (Math.random()*6+1);
                           System.out.println("DADO NUMERO: "+numero);
                           
                            //VERIFICAR QUE EL NUMERO QUE SALIO SEA MENOR A LAS CASILLAS
                            if(p2+numero>30){
                                
                                System.out.println(".:[NO PUEDE AVANSAR CON [" +numero+"]SE PASA]:.");
                            }else{
                                
                                p2=p2+numero;
                            }  
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 2 ESTA EN LA CASILLA ["+p2+"]");
                    }
                    
                    //PLATER 3
                    if(p3<24){
                        
                        //GENERAR LOS DADOS
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 3 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR LOS DADOS");
                        dado= datos.nextInt();
                        
                        for(i=1; i<=1; i++){
                            numero = (int) (Math.random()*6+1);
                            p3=p3+numero;
                        }
                        for(i=1; i<=1; i++){
                            numero2 = (int) (Math.random()*6+1); 
                            p3=p3+numero2;
                        }
                        
                        System.out.println("PRIMER DADO SALIO: "+numero);
                        System.out.println("SEGUNDO2 DADO SALIO: "+numero2);
             
                        //VALIDAR SI SALIERON PARES Y SI SON 3 GANA DIRECTAMENTE
                        if (numero==numero2){

                            System.out.println(".:[SACASTE PAR]:.");
                            j1++;
                     
                        }else{
                            j1=0;
                        }
                        if(j1==3){
                            p3=30;
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 3 AVANSO "+p3+" CASILLAS");
                        
                    }else if(p3<30 && p3>=24){
                        
                        //LANZAR UN SOLO DADO SI LA CANTIDAD ESTA EN 14
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 3 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR EL DADO");
                        dado= datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){
                            
                           numero = (int) (Math.random()*6+1);
                           System.out.println("DADO NUMERO: "+numero);
                           
                            //VERIFICAR QUE EL NUMERO QUE SALIO SEA MENOR A LAS CASILLAS
                            if(p3+numero>30){
                                
                                System.out.println(".:[NO PUEDE AVANSAR CON [" +numero+"]SE PASA]:.");
                            }else{
                                
                                p3=p3+numero;
                            }  
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 3 ESTA EN LA CASILLA ["+p3+"]");
                    }
                }
            }else if(player==4 && op==2){    
                
                System.out.println("NIVEL [INTERMEDIO]");
                System.out.println("NUMERO DE JUGADORES: ["+player+"]");
                System.out.println("");
                while(p1!=30 && p2!=30 && p3!=30 && p4!=30){
                    
                    //PLAYER 1
                    if(p1<24){
                        
                        //GENERAR LOS DADOS
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 1 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR LOS DADOS");
                        dado= datos.nextInt();
                        
                        for(i=1; i<=1; i++){
                            numero = (int) (Math.random()*6+1);
                            p1=p1+numero;
                        }
                        for(i=1; i<=1; i++){
                            numero2 = (int) (Math.random()*6+1); 
                            p1=p1+numero2;
                        }
                        
                        System.out.println("PRIMER DADO SALIO: "+numero);
                        System.out.println("SEGUNDO2 DADO SALIO: "+numero2);
             
                        //VALIDAR SI SALIERON PARES Y SI SON 3 GANA DIRECTAMENTE
                        if (numero==numero2){

                            System.out.println(".:[SACASTE PAR]:.");
                            j1++;
                     
                        }else{
                            j1=0;
                        }
                        if(j1==3){
                            p1=30;
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 1 AVANSO "+p1+" CASILLAS");
                        
                    }else if(p1<30 && p1>=24){
                        
                        //LANZAR UN SOLO DADO SI LA CANTIDAD ESTA EN 14
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 1 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR EL DADO");
                        dado= datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){
                            
                           numero = (int) (Math.random()*6+1);
                           System.out.println("DADO NUMERO: "+numero);
                           
                           //VERIFICAR QUE EL NUMERO QUE SALIO SEA MENOR A LAS CASILLAS
                            if(p1+numero>30){
                                
                                System.out.println(".:[NO PUEDE AVANSAR CON [" +numero+"]SE PASA]:.");
                            }else{
                                
                                p1=p1+numero;
                            }  
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 1 ESTA EN LA CASILLA ["+p1+"]");
                        
                    }
                
                    //PLAYER 2
                    if(p2<24){
                        
                        //GENERAR LOS DADOS
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 2 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR LOS DADOS");
                        dado= datos.nextInt();
                        
                        for(i=1; i<=1; i++){
                            numero = (int) (Math.random()*6+1);
                            p2=p2+numero;
                        }
                        for(i=1; i<=1; i++){
                            numero2 = (int) (Math.random()*6+1); 
                            p2=p2+numero2;
                        }
                        
                        System.out.println("PRIMER DADO SALIO: "+numero);
                        System.out.println("SEGUNDO2 DADO SALIO: "+numero2);
             
                        //VALIDAR SI SALIERON PARES Y SI SON 3 GANA DIRECTAMENTE
                        if (numero==numero2){

                            System.out.println(".:[SACASTE PAR]:.");
                            j1++;
                     
                        }else{
                            j1=0;
                        }
                        if(j1==3){
                            p2=30;
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 2 AVANSO "+p2+" CASILLAS");
                        
                    }else if(p2<30 && p2>=24){
                        
                        //LANZAR UN SOLO DADO SI LA CANTIDAD ESTA EN 14
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 2 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR EL DADO");
                        dado= datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){
                            
                           numero = (int) (Math.random()*6+1);
                           System.out.println("DADO NUMERO: "+numero);
                           
                            //VERIFICAR QUE EL NUMERO QUE SALIO SEA MENOR A LAS CASILLAS
                            if(p2+numero>30){
                                
                                System.out.println(".:[NO PUEDE AVANSAR CON [" +numero+"]SE PASA]:.");
                            }else{
                                
                                p2=p2+numero;
                            }  
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 2 ESTA EN LA CASILLA ["+p2+"]");
                    }
                    
                    //PLATER 3
                    if(p3<24){
                        
                        //GENERAR LOS DADOS
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 3 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR LOS DADOS");
                        dado= datos.nextInt();
                        
                        for(i=1; i<=1; i++){
                            numero = (int) (Math.random()*6+1);
                            p3=p3+numero;
                        }
                        for(i=1; i<=1; i++){
                            numero2 = (int) (Math.random()*6+1); 
                            p3=p3+numero2;
                        }
                        
                        System.out.println("PRIMER DADO SALIO: "+numero);
                        System.out.println("SEGUNDO2 DADO SALIO: "+numero2);
             
                        //VALIDAR SI SALIERON PARES Y SI SON 3 GANA DIRECTAMENTE
                        if (numero==numero2){

                            System.out.println(".:[SACASTE PAR]:.");
                            j1++;
                     
                        }else{
                            j1=0;
                        }
                        if(j1==3){
                            p3=30;
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 3 AVANSO "+p3+" CASILLAS");
                        
                    }else if(p3<30 && p3>=24){
                        
                        //LANZAR UN SOLO DADO SI LA CANTIDAD ESTA EN 14
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 3 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR EL DADO");
                        dado= datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){
                            
                           numero = (int) (Math.random()*6+1);
                           System.out.println("DADO NUMERO: "+numero);
                           
                            //VERIFICAR QUE EL NUMERO QUE SALIO SEA MENOR A LAS CASILLAS
                            if(p3+numero>30){
                                
                                System.out.println(".:[NO PUEDE AVANSAR CON [" +numero+"]SE PASA]:.");
                            }else{
                                
                                p3=p3+numero;
                            }  
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 3 ESTA EN LA CASILLA ["+p3+"]");
                    }
                    //PLATER 4
                    if(p4<24){
                        
                        //GENERAR LOS DADOS
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 4 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR LOS DADOS");
                        dado= datos.nextInt();
                        
                        for(i=1; i<=1; i++){
                            numero = (int) (Math.random()*6+1);
                            p4=p4+numero;
                        }
                        for(i=1; i<=1; i++){
                            numero2 = (int) (Math.random()*6+1); 
                            p4=p4+numero2;
                        }
                        
                        System.out.println("PRIMER DADO SALIO: "+numero);
                        System.out.println("SEGUNDO2 DADO SALIO: "+numero2);
             
                        //VALIDAR SI SALIERON PARES Y SI SON 3 GANA DIRECTAMENTE
                        if (numero==numero2){

                            System.out.println(".:[SACASTE PAR]:.");
                            j1++;
                     
                        }else{
                            j1=0;
                        }
                        if(j1==3){
                            p4=30;
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 4 AVANSO "+p4+" CASILLAS");
                        
                    }else if(p4<30 && p4>=24){
                        
                        //LANZAR UN SOLO DADO SI LA CANTIDAD ESTA EN 14
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 4 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR EL DADO");
                        dado= datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){
                            
                           numero = (int) (Math.random()*6+1);
                           System.out.println("DADO NUMERO: "+numero);
                           
                            //VERIFICAR QUE EL NUMERO QUE SALIO SEA MENOR A LAS CASILLAS
                            if(p4+numero>30){
                                
                                System.out.println(".:[NO PUEDE AVANSAR CON [" +numero+"]SE PASA]:.");
                            }else{
                                
                                p4=p4+numero;
                            }  
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 4 ESTA EN LA CASILLA ["+p4+"]");
                    }
                }
            }else if(player==2 && op==3){
                
                System.out.println("NIVEL [INTERMEDIO]");
                System.out.println("NUMERO DE JUGADORES: ["+player+"]");
                System.out.println("");
                while(p1!=50 && p2!=50){
                    
                    //PLAYER 1
                    if(p1<44){
                        
                        //GENERAR LOS DADOS
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 1 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR LOS DADOS");
                        dado= datos.nextInt();
                        
                        for(i=1; i<=1; i++){
                            numero = (int) (Math.random()*6+1);
                            p1=p1+numero;
                        }
                        for(i=1; i<=1; i++){
                            numero2 = (int) (Math.random()*6+1); 
                            p1=p1+numero2;
                        }
                        
                        System.out.println("PRIMER DADO SALIO: "+numero);
                        System.out.println("SEGUNDO2 DADO SALIO: "+numero2);
             
                        //VALIDAR SI SALIERON PARES Y SI SON 3 GANA DIRECTAMENTE
                        if (numero==numero2){

                            System.out.println(".:[SACASTE PAR]:.");
                            j1++;
                     
                        }else{
                            j1=0;
                        }
                        if(j1==3){
                            p1=50;
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 1 AVANSO "+p1+" CASILLAS");
                        
                    }else if(p1<50 && p1>=44){
                        
                        //LANZAR UN SOLO DADO SI LA CANTIDAD ESTA EN 14
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 1 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR EL DADO");
                        dado= datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){
                            
                           numero = (int) (Math.random()*6+1);
                           System.out.println("DADO NUMERO: "+numero);
                           
                           //VERIFICAR QUE EL NUMERO QUE SALIO SEA MENOR A LAS CASILLAS
                            if(p1+numero>50){
                                
                                System.out.println(".:[NO PUEDE AVANSAR CON [" +numero+"]SE PASA]:.");
                            }else{
                                
                                p1=p1+numero;
                            }  
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 1 ESTA EN LA CASILLA ["+p1+"]");
                        
                    }
                
                    //PLAYER 2
                    if(p2<44){
                        
                        //GENERAR LOS DADOS
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 2 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR LOS DADOS");
                        dado= datos.nextInt();
                        
                        for(i=1; i<=1; i++){
                            numero = (int) (Math.random()*6+1);
                            p2=p2+numero;
                        }
                        for(i=1; i<=1; i++){
                            numero2 = (int) (Math.random()*6+1); 
                            p2=p2+numero2;
                        }
                        
                        System.out.println("PRIMER DADO SALIO: "+numero);
                        System.out.println("SEGUNDO2 DADO SALIO: "+numero2);
             
                        //VALIDAR SI SALIERON PARES Y SI SON 3 GANA DIRECTAMENTE
                        if (numero==numero2){

                            System.out.println(".:[SACASTE PAR]:.");
                            j1++;
                     
                        }else{
                            j1=0;
                        }
                        if(j1==3){
                            p2=50;
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 2 AVANSO "+p2+" CASILLAS");
                        
                    }else if(p2<50 && p2>=44){
                        
                        //LANZAR UN SOLO DADO SI LA CANTIDAD ESTA EN 14
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 2 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR EL DADO");
                        dado= datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){
                            
                           numero = (int) (Math.random()*6+1);
                           System.out.println("DADO NUMERO: "+numero);
                           
                            //VERIFICAR QUE EL NUMERO QUE SALIO SEA MENOR A LAS CASILLAS
                            if(p2+numero>50){
                                
                                System.out.println(".:[NO PUEDE AVANSAR CON [" +numero+"]SE PASA]:.");
                            }else{
                                
                                p2=p2+numero;
                            }  
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 2 ESTA EN LA CASILLA ["+p2+"]");
                    }
                }
              //CUARTA OPCION
            }else if(player==3 && op==3){
                
                System.out.println("NIVEL [DIFICIL]");
                System.out.println("NUMERO DE JUGADORES: ["+player+"]");
                System.out.println("");
                while(p1!=50 && p2!=50 && p3!=50){
                    
                    //PLAYER 1
                    if(p1<44){
                        
                        //GENERAR LOS DADOS
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 1 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR LOS DADOS");
                        dado= datos.nextInt();
                        
                        for(i=1; i<=1; i++){
                            numero = (int) (Math.random()*6+1);
                            p1=p1+numero;
                        }
                        for(i=1; i<=1; i++){
                            numero2 = (int) (Math.random()*6+1); 
                            p1=p1+numero2;
                        }
                        
                        System.out.println("PRIMER DADO SALIO: "+numero);
                        System.out.println("SEGUNDO2 DADO SALIO: "+numero2);
             
                        //VALIDAR SI SALIERON PARES Y SI SON 3 GANA DIRECTAMENTE
                        if (numero==numero2){

                            System.out.println(".:[SACASTE PAR]:.");
                            j1++;
                     
                        }else{
                            j1=0;
                        }
                        if(j1==3){
                            p1=50;
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 1 AVANSO "+p1+" CASILLAS");
                        
                    }else if(p1<50 && p1>=44){
                        
                        //LANZAR UN SOLO DADO SI LA CANTIDAD ESTA EN 14
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 1 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR EL DADO");
                        dado= datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){
                            
                           numero = (int) (Math.random()*6+1);
                           System.out.println("DADO NUMERO: "+numero);
                           
                           //VERIFICAR QUE EL NUMERO QUE SALIO SEA MENOR A LAS CASILLAS
                            if(p1+numero>50){
                                
                                System.out.println(".:[NO PUEDE AVANSAR CON [" +numero+"]SE PASA]:.");
                            }else{
                                
                                p1=p1+numero;
                            }  
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 1 ESTA EN LA CASILLA ["+p1+"]");
                        
                    }
                
                    //PLAYER 2
                    if(p2<44){
                        
                        //GENERAR LOS DADOS
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 2 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR LOS DADOS");
                        dado= datos.nextInt();
                        
                        for(i=1; i<=1; i++){
                            numero = (int) (Math.random()*6+1);
                            p2=p2+numero;
                        }
                        for(i=1; i<=1; i++){
                            numero2 = (int) (Math.random()*6+1); 
                            p2=p2+numero2;
                        }
                        
                        System.out.println("PRIMER DADO SALIO: "+numero);
                        System.out.println("SEGUNDO2 DADO SALIO: "+numero2);
             
                        //VALIDAR SI SALIERON PARES Y SI SON 3 GANA DIRECTAMENTE
                        if (numero==numero2){

                            System.out.println(".:[SACASTE PAR]:.");
                            j1++;
                     
                        }else{
                            j1=0;
                        }
                        if(j1==3){
                            p2=50;
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 2 AVANSO "+p2+" CASILLAS");
                        
                    }else if(p2<50 && p2>=44){
                        
                        //LANZAR UN SOLO DADO SI LA CANTIDAD ESTA EN 14
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 2 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR EL DADO");
                        dado= datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){
                            
                           numero = (int) (Math.random()*6+1);
                           System.out.println("DADO NUMERO: "+numero);
                           
                            //VERIFICAR QUE EL NUMERO QUE SALIO SEA MENOR A LAS CASILLAS
                            if(p2+numero>50){
                                
                                System.out.println(".:[NO PUEDE AVANSAR CON [" +numero+"]SE PASA]:.");
                            }else{
                                
                                p2=p2+numero;
                            }  
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 2 ESTA EN LA CASILLA ["+p2+"]");
                    }
                    
                    //PLATER 3
                    if(p3<44){
                        
                        //GENERAR LOS DADOS
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 3 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR LOS DADOS");
                        dado= datos.nextInt();
                        
                        for(i=1; i<=1; i++){
                            numero = (int) (Math.random()*6+1);
                            p3=p3+numero;
                        }
                        for(i=1; i<=1; i++){
                            numero2 = (int) (Math.random()*6+1); 
                            p3=p3+numero2;
                        }
                        
                        System.out.println("PRIMER DADO SALIO: "+numero);
                        System.out.println("SEGUNDO2 DADO SALIO: "+numero2);
             
                        //VALIDAR SI SALIERON PARES Y SI SON 3 GANA DIRECTAMENTE
                        if (numero==numero2){

                            System.out.println(".:[SACASTE PAR]:.");
                            j1++;
                     
                        }else{
                            j1=0;
                        }
                        if(j1==3){
                            p3=50;
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 3 AVANSO "+p3+" CASILLAS");
                        
                    }else if(p3<50 && p3>=44){
                        
                        //LANZAR UN SOLO DADO SI LA CANTIDAD ESTA EN 14
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 3 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR EL DADO");
                        dado= datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){
                            
                           numero = (int) (Math.random()*6+1);
                           System.out.println("DADO NUMERO: "+numero);
                           
                            //VERIFICAR QUE EL NUMERO QUE SALIO SEA MENOR A LAS CASILLAS
                            if(p3+numero>50){
                                
                                System.out.println(".:[NO PUEDE AVANSAR ES UN NUMERO MUY ALTO]:.");
                            }else{
                                
                                p3=p3+numero;
                            }  
                        }
                        System.out.println("");
                        System.out.println(".:[NO PUEDE AVANSAR CON [" +numero+"]SE PASA]:.");
                    }
                }
            }else if(player==4 && op==3){    
                
                System.out.println("NIVEL [INTERMEDIO]");
                System.out.println("NUMERO DE JUGADORES: ["+player+"]");
                System.out.println("");
                while(p1!=50 && p2!=50 && p3!=50 && p4!=50){
                    
                    //PLAYER 1
                    if(p1<44){
                        
                        //GENERAR LOS DADOS
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 1 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR LOS DADOS");
                        dado= datos.nextInt();
                        
                        for(i=1; i<=1; i++){
                            numero = (int) (Math.random()*6+1);
                            p1=p1+numero;
                        }
                        for(i=1; i<=1; i++){
                            numero2 = (int) (Math.random()*6+1); 
                            p1=p1+numero2;
                        }
                        
                        System.out.println("PRIMER DADO SALIO: "+numero);
                        System.out.println("SEGUNDO2 DADO SALIO: "+numero2);
             
                        //VALIDAR SI SALIERON PARES Y SI SON 3 GANA DIRECTAMENTE
                        if (numero==numero2){

                            System.out.println(".:[SACASTE PAR]:.");
                            j1++;
                     
                        }else{
                            j1=0;
                        }
                        if(j1==3){
                            p1=50;
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 1 AVANSO "+p1+" CASILLAS");
                        
                    }else if(p1<50 && p1>=44){
                        
                        //LANZAR UN SOLO DADO SI LA CANTIDAD ESTA EN 14
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 1 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR EL DADO");
                        dado= datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){
                            
                           numero = (int) (Math.random()*6+1);
                           System.out.println("DADO NUMERO: "+numero);
                           
                           //VERIFICAR QUE EL NUMERO QUE SALIO SEA MENOR A LAS CASILLAS
                            if(p1+numero>50){
                                
                                System.out.println(".:[NO PUEDE AVANSAR CON [" +numero+"]SE PASA]:.");
                            }else{
                                
                                p1=p1+numero;
                            }  
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 1 ESTA EN LA CASILLA ["+p1+"]");
                        
                    }
                
                    //PLAYER 2
                    if(p2<44){
                        
                        //GENERAR LOS DADOS
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 2 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR LOS DADOS");
                        dado= datos.nextInt();
                        
                        for(i=1; i<=1; i++){
                            numero = (int) (Math.random()*6+1);
                            p2=p2+numero;
                        }
                        for(i=1; i<=1; i++){
                            numero2 = (int) (Math.random()*6+1); 
                            p2=p2+numero2;
                        }
                        
                        System.out.println("PRIMER DADO SALIO: "+numero);
                        System.out.println("SEGUNDO2 DADO SALIO: "+numero2);
             
                        //VALIDAR SI SALIERON PARES Y SI SON 3 GANA DIRECTAMENTE
                        if (numero==numero2){

                            System.out.println(".:[SACASTE PAR]:.");
                            j1++;
                     
                        }else{
                            j1=0;
                        }
                        if(j1==3){
                            p2=50;
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 2 AVANSO "+p2+" CASILLAS");
                        
                    }else if(p2<50 && p2>=44){
                        
                        //LANZAR UN SOLO DADO SI LA CANTIDAD ESTA EN 14
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 2 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR EL DADO");
                        dado= datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){
                            
                           numero = (int) (Math.random()*6+1);
                           System.out.println("DADO NUMERO: "+numero);
                           
                            //VERIFICAR QUE EL NUMERO QUE SALIO SEA MENOR A LAS CASILLAS
                            if(p2+numero>30){
                                
                                System.out.println(".:[NO PUEDE AVANSAR CON [" +numero+"]SE PASA]:.");
                            }else{
                                
                                p2=p2+numero;
                            }  
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 2 ESTA EN LA CASILLA ["+p2+"]");
                    }
                    
                    //PLATER 3
                    if(p3<44){
                        
                        //GENERAR LOS DADOS
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 3 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR LOS DADOS");
                        dado= datos.nextInt();
                        
                        for(i=1; i<=1; i++){
                            numero = (int) (Math.random()*6+1);
                            p3=p3+numero;
                        }
                        for(i=1; i<=1; i++){
                            numero2 = (int) (Math.random()*6+1); 
                            p3=p3+numero2;
                        }
                        
                        System.out.println("PRIMER DADO SALIO: "+numero);
                        System.out.println("SEGUNDO2 DADO SALIO: "+numero2);
             
                        //VALIDAR SI SALIERON PARES Y SI SON 3 GANA DIRECTAMENTE
                        if (numero==numero2){

                            System.out.println(".:[SACASTE PAR]:.");
                            j1++;
                     
                        }else{
                            j1=0;
                        }
                        if(j1==3){
                            p3=50;
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 3 AVANSO "+p3+" CASILLAS");
                        
                    }else if(p3<50 && p3>=44){
                        
                        //LANZAR UN SOLO DADO SI LA CANTIDAD ESTA EN 14
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 3 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR EL DADO");
                        dado= datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){
                            
                           numero = (int) (Math.random()*6+1);
                           System.out.println("DADO NUMERO: "+numero);
                           
                            //VERIFICAR QUE EL NUMERO QUE SALIO SEA MENOR A LAS CASILLAS
                            if(p3+numero>50){
                                
                                System.out.println(".:[NO PUEDE AVANSAR CON [" +numero+"]SE PASA]:.");
                            }else{
                                
                                p3=p3+numero;
                            }  
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 3 ESTA EN LA CASILLA ["+p3+"]");
                    }
                    //PLATER 4
                    if(p4<44){
                        
                        //GENERAR LOS DADOS
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 4 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR LOS DADOS");
                        dado= datos.nextInt();
                        
                        for(i=1; i<=1; i++){
                            numero = (int) (Math.random()*6+1);
                            p4=p4+numero;
                        }
                        for(i=1; i<=1; i++){
                            numero2 = (int) (Math.random()*6+1); 
                            p4=p4+numero2;
                        }
                        
                        System.out.println("PRIMER DADO SALIO: "+numero);
                        System.out.println("SEGUNDO2 DADO SALIO: "+numero2);
             
                        //VALIDAR SI SALIERON PARES Y SI SON 3 GANA DIRECTAMENTE
                        if (numero==numero2){

                            System.out.println(".:[SACASTE PAR]:.");
                            j1++;
                     
                        }else{
                            j1=0;
                        }
                        if(j1==3){
                            p4=50;
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 4 AVANSO "+p4+" CASILLAS");
                        
                    }else if(p4<50 && p4>=44){
                        
                        //LANZAR UN SOLO DADO SI LA CANTIDAD ESTA EN 14
                        System.out.println("");
                        System.out.println("------------------------------------------");    
                        System.out.println(".::::::::::: TURNO JUGADOR 4 ::::::::::::.");
                        System.out.println("------------------------------------------"); 
                        System.out.println(""); 
                        System.out.println("PRESIONE UN NUMERO PARA LANZAR EL DADO");
                        dado= datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){
                            
                           numero = (int) (Math.random()*6+1);
                           System.out.println("DADO NUMERO: "+numero);
                           
                            //VERIFICAR QUE EL NUMERO QUE SALIO SEA MENOR A LAS CASILLAS
                            if(p4+numero>50){
                                
                                System.out.println(".:[NO PUEDE AVANSAR CON [" +numero+"]SE PASA]:.");
                            }else{
                                
                                p4=p4+numero;
                            }  
                        }
                        System.out.println("");
                        System.out.println("EL JUGADOR 4 ESTA EN LA CASILLA ["+p4+"]");
                    }
                }
            }       
        }
        if (p1==20 || p1==30 || p1==50){
            System.out.println("");
            System.out.println("------------------------------------------");
            System.out.println("EL GANADOES ES: [EL JUGADOR 1]");
            System.out.println("------------------------------------------");
					
        }else if(p2==20 || p2==30 || p2==50){
            System.out.println("");
            System.out.println("------------------------------------------");
            System.out.println("EL GANADOE ES: [EL JUGADOR 2]");
            System.out.println("------------------------------------------");
        }else if(p3==20 || p3==30 || p3==50){
            System.out.println("");
            System.out.println("------------------------------------------");
            System.out.println("EL GANADOE ES: [EL JUGADOR 3]");
            System.out.println("------------------------------------------");
        }else if(p4==20 || p4==30 || p4==50){
            System.out.println("");
            System.out.println("------------------------------------------");
            System.out.println("EL GANADOE ES: [EL JUGADOR 4]");
            System.out.println("------------------------------------------");
        }
    }
}
    

