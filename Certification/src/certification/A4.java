package certification;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A4 {
	
	  public A4() {
		    try {

		      Runtime runtime = Runtime.getRuntime();
		      Process proc = runtime.exec("cmd.exe /c set");

		      A4.AfficheFlux afficheFlux = 
		        new AfficheFlux(proc.getInputStream());

		      afficheFlux.start();

		      int exitVal = proc.waitFor();
		      System.out.println("exitVal = " + exitVal);
		    } catch (Exception e) {
		      e.printStackTrace();
		    }
		  }

		  public static void main(String[] args) {
			  
			  int i = 3;
			    int j = 0;
			    try {
			      System.out.println("résultat = " + (i / j));
			    } catch (ArithmeticException e) {
			      System.out.println("getmessage");
			      System.out.println(e.getMessage());
			      System.out.println(" ");
			      System.out.println("toString");
			      System.out.println(e.toString());
			      System.out.println(" ");
			      System.out.println("printStackTrace");
			      e.printStackTrace();
			    }
		  }

		  private class AfficheFlux extends Thread {
		    InputStream is;

		    AfficheFlux(InputStream is) {
		      this.is = is;
		    }

		    public void run() {
		      try {
		        InputStreamReader isr = new InputStreamReader(is);
		        BufferedReader br = new BufferedReader(isr);
		        String line = null;
		        while ((line = br.readLine()) != null)
		          System.out.println(line);
		      } catch (IOException ioe) {
		        ioe.printStackTrace();
		      }
		    }
		  }
	}