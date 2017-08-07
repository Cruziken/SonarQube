package sonarqube;

import java.io.File;

public class DirectoryScanner {
	private static File folder = new File("C:\\Users\\Titanium\\workspace");
	public static void listFilesForFolder(final File folder) {
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	            listFilesForFolder(fileEntry);
	        } else {
	            System.out.println(fileEntry.getName());
	        }
	    }
	}
	    public static void main(String args[]){
	listFilesForFolder(folder);}
}


