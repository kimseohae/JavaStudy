package ch1_ClassLoader.S2_ClassLoaderType;

public class _L3_ExtClassLoader {
	public static void main(String[] args) {
		// 2. 자바 확장 라이브러리를 지원하는 extClassLoader
		// extClassLoader는 URLClassLoader를 상속 받아 사용 된다.(즉 외부의 라이브러리를 불러 올 수 있는 환경을 지녔다)
		// 명시적으로 경로를 지정 하지 않을 경우 /jre/lib/ext/*.jar로 부터 class파일을 읽어 온다.
		String extClassLoader = System.getProperty("java.ext.dirs");
		System.out.println(extClassLoader);
	}
}
