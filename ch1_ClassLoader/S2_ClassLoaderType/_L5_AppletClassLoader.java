package ch1_ClassLoader.S2_ClassLoaderType;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.SecureClassLoader;

import sun.applet.AppletClassLoader;

public class _L5_AppletClassLoader {
	public static void main(String[] args) throws MalformedURLException {
		// 4. �� ���������� �������� Ŭ������ �ε� �ϴ� appletClassLoader
		// ���ø� Ŭ���� �δ��� ���� �� �������� ���������� ���� �� �� ���������� Ŭ������ �ε� �� �� ��� �Ͽ���.
		// �� Ŭ���� �δ��� extClassLoader�� ���� �ϰ� URLClassLoader�� ��ӹ޾� ��� �ϱ� ������
		// ( file:,ftp:,http: )�ּҷ� ���� ���������� Ŭ������ �ε� ���� �ϴ�.
		// ����� �� ���������� classLoader�� ��� �ϱ⵵ �ϱ� ������ ���������� �ٸ� ������ ���� �� �� �ִ�.
		String urlPath = "file:/C:/Users/user/Desktop/eclipse-jee-mars-2-win32-x86_64/workspace/JavaStudy/ch1_ClassLoader.S2_ClassLoaderType.urlClassLoading";
		URL url[] = {new URL(urlPath)};
		URLClassLoader appletLoader =  AppletClassLoader.newInstance(url);
	}
}
