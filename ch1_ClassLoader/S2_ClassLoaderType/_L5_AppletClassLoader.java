package ch1_ClassLoader.S2_ClassLoaderType;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.SecureClassLoader;

import sun.applet.AppletClassLoader;

public class _L5_AppletClassLoader {
	public static void main(String[] args) throws MalformedURLException {
		// 4. 웹 페이지에서 동적으로 클래스를 로딩 하는 appletClassLoader
		// 애플릿 클래스 로더는 이전 웹 브라우저가 독립적이지 않을 때 웹 브라우저에서 클래스를 로드 할 때 사용 하였다.
		// 이 클래스 로더는 extClassLoader와 동일 하게 URLClassLoader를 상속받아 사용 하기 때문에
		// ( file:,ftp:,http: )주소로 부터 독립적으로 클래스를 로딩 가능 하다.
		// 현재는 웹 브라우저만의 classLoader를 사용 하기도 하기 때문에 브라우저마다 다른 동작을 보여 줄 수 있다.
		String urlPath = "file:/C:/Users/user/Desktop/eclipse-jee-mars-2-win32-x86_64/workspace/JavaStudy/ch1_ClassLoader.S2_ClassLoaderType.urlClassLoading";
		URL url[] = {new URL(urlPath)};
		URLClassLoader appletLoader =  AppletClassLoader.newInstance(url);
	}
}
