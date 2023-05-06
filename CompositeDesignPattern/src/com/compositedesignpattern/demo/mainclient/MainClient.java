package com.compositedesignpattern.demo.mainclient;

import com.compositedesignpattern.demo.composite.BinaryFile;
import com.compositedesignpattern.demo.composite.Directory;
import com.compositedesignpattern.demo.composite.File;

public class MainClient {
	
	public static void main(String args[])
	{
		File root1 = createTreeOne();
		
		root1.ls();
		
		System.out.println("==============================");
		
		File root2 = createFileTwo();
		
		root2.ls();
		
		
	}
	
	private static File createTreeOne() {
		File file1 = new BinaryFile("File1", 100);
		
		Directory dir1 = new Directory("dir1");
		file1.setParent(dir1);
		dir1.addFile(file1);
		
		File file2 = new BinaryFile("File2", 600);
		File file3 = new BinaryFile("File3", 400);
		Directory dir2 = new Directory("dir2");
		
		file2.setParent(dir2);
		file3.setParent(dir2);
		dir1.setParent(dir2);
		dir2.addFile(file3);
		dir2.addFile(file2);
		
		dir2.addFile(dir1);
		System.out.println("========================================");
		
		System.out.println("Navigating parent "+file1.getParent().getParent().toString());
		
		return dir2;
		
	}
	
	private static File createFileTwo()
	{
		return new BinaryFile("Another file ", 500);
	}

}
