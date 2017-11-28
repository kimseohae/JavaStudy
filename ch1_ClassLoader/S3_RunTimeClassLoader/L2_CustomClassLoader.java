package ch1_ClassLoader.S3_RunTimeClassLoader;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;

public class L2_CustomClassLoader extends ClassLoader{
	
	private byte[] loadClassFromJarFile(String className) throws IOException{
		String fullName = "C:/Users/user/Desktop/Java/Sample.jar";
		File f = new File(fullName);
		int size = (int) f.length();
		byte[] buffer = new byte[size];
		DataInputStream dis = new DataInputStream(new FileInputStream(f));
		dis.readFully(buffer);
		return buffer;
		
	}

	@Override
	protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
		try {
			byte[] bt = loadClassFromJarFile("");
			for(byte b : bt){
				System.out.print((char)b);
			}
			Class c = defineClass("sampleClass",bt, 0, bt.length);
			System.out.println(c);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return Class.class;//super.loadClass(name, resolve);
	}
	public static void main(String[] args) throws ClassNotFoundException {
		L2_CustomClassLoader myloader = new L2_CustomClassLoader();
		myloader.loadClass("",false);
	}
}
