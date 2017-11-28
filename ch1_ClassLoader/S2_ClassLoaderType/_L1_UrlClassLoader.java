package ch1_ClassLoader.S2_ClassLoaderType;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class _L1_UrlClassLoader {
	public static void main(String[] args) {
	// 0. �ùٸ� ��θ� ã�� ���� �ִ� �׺������ URLClassLoader
			// URL�� �������� (file:/ ftp:/ http:/ �� )class�� �ε� �� �� �� �ִ�.
			
			try {
				// 1. file�� ���� classLoad
				String urlPath = "file:/C:/Users/user/Desktop/eclipse-jee-mars-2-win32-x86_64/workspace/JavaStudy/ch1_ClassLoader.S2_ClassLoaderType.urlClassLoading";
				
				// 2. http����� ���� classLoad
				// URL[] url = { new URL("http","http://www.java2s.com","/Code/Jar/h/Downloadhttpfluent10sourcesjar.htm")};
				
				// 3. ftp�� ���� classLoad
				// URL("ftp", "id:password@www.localhost:8080:", "/")

				URL[] url = {new URL(urlPath)};
				
				// URL�� ���Ͽ� Ŭ������ �ҷ� �´�.
				URLClassLoader urlClassLoader = new URLClassLoader(url);
				
			} catch (MalformedURLException e) { // �߸��� URL�� �Ľ� �� �� ���� ������ �߻� �Ѵ�.
				e.printStackTrace();
			}
	}
}
