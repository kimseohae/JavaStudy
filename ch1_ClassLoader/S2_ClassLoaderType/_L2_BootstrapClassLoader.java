package ch1_ClassLoader.S2_ClassLoaderType;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.SecureClassLoader;

import sun.applet.AppletClassLoader;


public class _L2_BootstrapClassLoader {
	public static void main(String[] args) throws MalformedURLException, InstantiationException, IllegalAccessException {

		// 1. 최초 시스템에서 로드 되는 bootStrapClassLoader
		// 최초 실행 시 로드 되며 자바의 기본 클래스를 불러와 JVM을 실행 시킬 때 사용한다.
		// 따라서 부트 스트랩 클래스 로더의 PATH는 JDK가 있는 경로라고 봐도 무방하겠다.
		// 그래서 부트스트랩 클래스 로더의 경우 자바의 환경 변수를 대응 하여 사용 할 수 있다.
		// 명시적으로 경로를 지정 하지 않을 경우 /jre/lib/*.jar로 부터 class파일을 읽어 온다.
		String bootStrapClassLoader = System.getProperty("sun.boot.class.path");
		System.out.println(bootStrapClassLoader);
		
	}
}
class urlClassLoading{
	
}