/**
 * Project1.java
 * Read, write and append file
 * @author Lamia
 * Computer Science 20
 * Copyright 2021, Centennial High School. All rights reserved.
 */
import java.io.File;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Project1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		try {  
			//creates the file
			File file = new File("C:\\Users\\16285512\\file.txt");
			
			boolean fvar = file.createNewFile();
			 if (fvar){
				 System.out.println("Your file has been created.\n");
			 }else{
				 System.out.println("File already present at the specified location");
			 }
		   	 } catch (IOException e) {
		   		 System.out.println("Exception Occurred:");
			     e.printStackTrace();
			 }
		   
		   System.out.println("Please type what you want stored in this file:");
		   String text = scan.nextLine();
		   
		   try {
			   File file = new File("C:\\Users\\16285512\\file.txt");
			   boolean fvar = file.createNewFile();

				if (fvar){
					System.out.println("\nYour File has been created successfully.");
				}
				}catch (IOException e){
					System.out.println("Exception Occurred:");
					e.printStackTrace();
				}	
		   
		   FileOutputStream fos = null;
		   File file;
		   String mycontent = (text);
			
			try{
			    
				file = new File("C:\\Users\\16285512\\file.txt");
				
				//accesses the file from the users drive
				fos = new FileOutputStream(file);
		  
				if (!file.exists()){
					file.createNewFile();
				}
				
				byte[] bytesArray = mycontent.getBytes();
				fos.write(bytesArray);
				fos.flush();
				System.out.println("\nYour text has been stored successfully.\n");
				
				System.out.println("Please type what you would like to be appended into your file.");
				String text2 = scan.nextLine();
				
				try{
			    	String content = "This is my content which would be appended at the end of the specified file";
			       
			    	//appends the content
			    	File file1 =new File("C:\\Users\\16285512\\file.txt");

			    	if(!file1.exists()){
			    	   file1.createNewFile();
			    	}

			    	
			    	FileWriter fw = new FileWriter(file1,true);
			    	BufferedWriter bw = new BufferedWriter(fw);
			    	bw.write(" " + text2);
			    	bw.close();

			    	System.out.println("Data successfully appended at the end of file\n");
				
			    	System.out.println("\nThis is the data that you have saved in your file.");
					System.out.println(text + " " + text2);
				
					//prints the text
					}catch(IOException ioe){
						System.out.println("Exception occurred:");
						ioe.printStackTrace();
					} finally{
						try{
							if (fos != null) {
								fos.close();
							}
						} catch (IOException ioe){
							System.out.println("Error in closing the Stream");
					}
				}
			
			}finally{
			
			}
	}// end main

}// end class