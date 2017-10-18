package com.javabasicsforbegineers;

import java.io.File;
import java.io.IOException;

public class FileHandling {
	
	public static void CreateFolder()
	{
		File fo = new File("C:/Users/PrabhuPushpaKumar/Desktop/SeleniumFolder");
		fo.mkdir();
	}
	
	public static void CheckFolderExists()
	{
		File fo = new File("C:/Users/PrabhuPushpaKumar/Desktop/SeleniumFolder");
		fo.mkdir();
		boolean b = fo.exists();
		if (b==true)
		{
			System.out.println("The Folder Exists on your Machine");
		}
		else
		{
			System.out.println("The Folder Not Exists on your Machine");
		}
	}
	
	public static void DeleteFolder()
	{
		File fo1 = new File("C:/Users/PrabhuPushpaKumar/Desktop/SeleniumFolder_1");
		fo1.mkdir();
		fo1.delete();
	}
	
	public static void CreateNewFile() throws IOException
	{
		File fo1 = new File("C:/Users/PrabhuPushpaKumar/Desktop/SampleFolder_1");
		fo1.mkdir();
		File fo2 = new File("C:/Users/PrabhuPushpaKumar/Desktop/SampleFolder_1/sample.txt");
		fo2.createNewFile();
	}
	
	public static void DeleteFile() throws IOException
	{
		File fo1 = new File("C:/Users/PrabhuPushpaKumar/Desktop/SampleFolder_1");
		fo1.mkdir();
		File fo2 = new File("C:/Users/PrabhuPushpaKumar/Desktop/SampleFolder_1/sample1.txt");
		fo2.createNewFile();
		fo2.delete();
	}
	public static void main(String[] args) throws IOException {
		//CreateFolder;
		//CheckFolderExists;
		//DeleteFolder();
		//CreateNewFile();
		DeleteFile();
	}

}
