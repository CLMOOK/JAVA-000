package week1;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Files;

/**
 * 
 * @author Administrator
 *
 */

public class MyClassLoader extends ClassLoader {
	
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		
		byte[] NewBytesArray = null;
		byte[] bytes = null;
		try {
			bytes = Files.readAllBytes(new File(this.getClass().getResource(name).getPath()).toPath());
			NewBytesArray = new byte[bytes.length];
			
			for(int i=0; i < bytes.length; i++) {
				NewBytesArray[i] = (byte) (255 - bytes[i]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return defineClass("Hello", NewBytesArray, 0, NewBytesArray.length);
	}

	public static void main(String[] args) {
		try {
			Class nc = new MyClassLoader().findClass("Hello.xlass");
			Object o = nc.newInstance();
			Method m = nc.getDeclaredMethod("hello", null);
			m.invoke(o, null);
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
