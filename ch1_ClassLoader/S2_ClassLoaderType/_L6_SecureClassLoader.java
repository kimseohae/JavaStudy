package ch1_ClassLoader.S2_ClassLoaderType;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.SecureClassLoader;

import sun.applet.AppletClassLoader;

public class _L6_SecureClassLoader {
	public static void main(String[] args) throws MalformedURLException {
		// 5. Ŭ���� �δ��� ���� ��å�� �����ϱ� ���� �� ������ ���Ͽ� ���ǵ� Ŭ���� �δ� �̴�
		// ������ URLClassLoader�� �� Ŭ���� �δ��� ��ӹ޾� ��� �ϱ� ������ URLClassLoader�� Ȯ�强�� ���Ͽ� ��� �Ǳ⵵ �Ѵ�.
		String urlPath = "file:/C:/Users/user/Desktop/eclipse-jee-mars-2-win32-x86_64/workspace/JavaStudy/ch1_ClassLoader.S2_ClassLoaderType.urlClassLoading";
		URL url[] = {new URL(urlPath)};
		URLClassLoader appletLoader =  AppletClassLoader.newInstance(url);
		
		SecureClassLoader secureClassLoader = new URLClassLoader(url);
	}
}
