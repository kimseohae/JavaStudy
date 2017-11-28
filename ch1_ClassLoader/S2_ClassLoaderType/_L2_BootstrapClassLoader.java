package ch1_ClassLoader.S2_ClassLoaderType;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.SecureClassLoader;

import sun.applet.AppletClassLoader;


public class _L2_BootstrapClassLoader {
	public static void main(String[] args) throws MalformedURLException, InstantiationException, IllegalAccessException {

		// 1. ���� �ý��ۿ��� �ε� �Ǵ� bootStrapClassLoader
		// ���� ���� �� �ε� �Ǹ� �ڹ��� �⺻ Ŭ������ �ҷ��� JVM�� ���� ��ų �� ����Ѵ�.
		// ���� ��Ʈ ��Ʈ�� Ŭ���� �δ��� PATH�� JDK�� �ִ� ��ζ�� ���� �����ϰڴ�.
		// �׷��� ��Ʈ��Ʈ�� Ŭ���� �δ��� ��� �ڹ��� ȯ�� ������ ���� �Ͽ� ��� �� �� �ִ�.
		// ��������� ��θ� ���� ���� ���� ��� /jre/lib/*.jar�� ���� class������ �о� �´�.
		String bootStrapClassLoader = System.getProperty("sun.boot.class.path");
		System.out.println(bootStrapClassLoader);
		
	}
}
class urlClassLoading{
	
}