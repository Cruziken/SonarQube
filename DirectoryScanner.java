package sonarqube;

import java.io.File;

	public class DirectoryScanner {
		//private static File folder = new File("C:\\Users\\fz3\\workspace");
		private static String dirContent;
		private static int numOfSubfolders;
		//public static void listFilesForFolder(final File folder) {
		  /*  for (final File fileEntry : folder.listFiles()) {
		        if (fileEntry.isDirectory()) {
		            listFilesForFolder(fileEntry);
		        } else {
		            System.out.println(fileEntry.getName());
		        }
		    } */
		public static void main(String[] args){
			numDirect("C:\\Users\\fz3\\workspace");
			
		}
		
		 public static String listFolders(String directoryName){
			 File directory = new File(directoryName);
		        //get all the files from a directory
		        File[] fList = directory.listFiles();
		        
		        for (File file : fList){
		        	
		            if (file.isDirectory()){
		            	 dirContent= file.getName();
		              
		   			 } 
		               // dirArray[i]= dirContent;
		                //System.out.println(dirContent);
		                 }
		        System.out.println(dirContent);
		        return dirContent;
		            	 }
		            
		        
		        //System.out.println(dirArray);
               // System.out.println(dirContent);
		        //return dirContent;
		    
		public static void arrayIt(File file, int num){
			int i = 0;
			 String[] dirArray= new String[num];
				 dirArray[i++]= file.getName();
				 System.out.println(dirArray[i]); 
			 } 
		 
		 public static void numDirect(String directoryName) {
		 File dir = new File(directoryName);
		 numOfSubfolders = 0;
		 File listDir[] = dir.listFiles();
		 for (int i = 0; i < listDir.length; i++) {
		     if (listDir[i].isDirectory()) {
		             numOfSubfolders++;
		         }
		 String[] dirArray= new String[numOfSubfolders];
		 for (int j = 0; j < dirArray.length; i++){ 
		 listFolders(directoryName);
		 }
		 System.out.println("No of dir " + numOfSubfolders);
		 }
		 }
		 }
		    
	
		
		
		    
		//listFilesForFolder(folder);}
