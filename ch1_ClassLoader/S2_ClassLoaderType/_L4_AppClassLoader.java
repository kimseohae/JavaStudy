package ch1_ClassLoader.S2_ClassLoaderType;

public class _L4_AppClassLoader {
	public static void main(String[] args) {
		// 3. 애플리케이션 실행 단계의 클래스를 로딩 하는 appClassLoader
		// 어플리케이션 클래스 로드이며 해당 어플리케이션의 path에 클래스를 로드 하는 클래스 로더 이다.
		// 다시 말하면 classPath를 기준으로 사용 되는 어플리케이션 클래스들을 로드 할 때 사용 되는 클래스 로더이다.
		String ClassPath = System.getProperty("java.class.path");
		System.out.println(ClassPath);
		System.out.println(ClassLoader.getSystemClassLoader());
	}
}
