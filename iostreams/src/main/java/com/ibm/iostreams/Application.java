package com.ibm.iostreams;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application
{
	public static void main( String[] args )
	{
//		File file1 = new File("./src/main/resources/ibm/file1.txt");
//		
//		System.out.println(file1.exists());
//		System.out.println(file1.isFile());
//		System.out.println(file1.isDirectory());
		
//		FileInputStream inputStream = null;
//		FileOutputStream outputStream = null;
//		
//		try {
//			inputStream=new FileInputStream("./src/main/resources/ibm/file1.txt");
//			outputStream = new FileOutputStream("./src/main/resources/ibm/file2.txt");
//			byte c;
//			
//			while((c=(byte) inputStream.read())!=-1) {
//				outputStream.write(c);
//			}
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			if(inputStream != null) {
//				try {
//					inputStream.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			if(outputStream!=null) {
//				try {
//					outputStream.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
		
//		try(FileReader inputFileReader = new FileReader("./src/main/resources/ibm/file1.txt");
//			FileWriter outputFileWriter = new FileWriter("./src/main/resources/ibm/file2.txt");){
//			int c;
//			
//			while((c=inputFileReader.read())!=-1) {
//				outputFileWriter.write(c);
//			}
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		short data=1;
		try(DataOutputStream outputStream = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream("./src/main/resources/ibm/file3.txt")));){
			
			outputStream.writeShort(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}