package ch1_ClassLoader.S2_ClassLoaderType;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class _L1_UrlClassLoader {
	public static void main(String[] args) {
	// 0. 올바른 경로를 찾게 도와 주는 네비게이터 URLClassLoader
			// URL을 기준으로 (file:/ ftp:/ http:/ 등 )class를 로드 해 올 수 있다.
			
			try {
				// 1. file을 통한 classLoad
				String urlPath = "file:/C:/Users/user/Desktop/eclipse-jee-mars-2-win32-x86_64/workspace/JavaStudy/ch1_ClassLoader.S2_ClassLoaderType.urlClassLoading";
				
				// 2. http통신을 통한 classLoad
				// URL[] url = { new URL("http","http://www.java2s.com","/Code/Jar/h/Downloadhttpfluent10sourcesjar.htm")};
				
				// 3. ftp를 통한 classLoad
				// URL("ftp", "id:password@www.localhost:8080:", "/")

				URL[] url = {new URL(urlPath)};
				
				// URL을 통하여 클래스를 불러 온다.
				URLClassLoader urlClassLoader = new URLClassLoader(url);
				
			} catch (MalformedURLException e) { // 잘못된 URL을 파싱 할 때 나는 에러를 발생 한다.
				e.printStackTrace();
			}
	}
}
