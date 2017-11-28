package ch1_ClassLoader.S2_ClassLoaderType;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.SecureClassLoader;

import sun.applet.AppletClassLoader;

public class _L6_SecureClassLoader {
	public static void main(String[] args) throws MalformedURLException {
		// 5. 클래스 로더의 보안 정책을 정의하기 위한 즉 보안을 위하여 정의된 클래스 로더 이다
		// 하지만 URLClassLoader가 이 클래스 로더를 상속받아 사용 하기 때문에 URLClassLoader의 확장성을 위하여 사용 되기도 한다.
		String urlPath = "file:/C:/Users/user/Desktop/eclipse-jee-mars-2-win32-x86_64/workspace/JavaStudy/ch1_ClassLoader.S2_ClassLoaderType.urlClassLoading";
		URL url[] = {new URL(urlPath)};
		URLClassLoader appletLoader =  AppletClassLoader.newInstance(url);
		
		SecureClassLoader secureClassLoader = new URLClassLoader(url);
	}
}
