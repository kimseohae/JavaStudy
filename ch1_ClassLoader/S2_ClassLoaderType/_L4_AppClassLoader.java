package ch1_ClassLoader.S2_ClassLoaderType;

public class _L4_AppClassLoader {
	public static void main(String[] args) {
		// 3. ���ø����̼� ���� �ܰ��� Ŭ������ �ε� �ϴ� appClassLoader
		// ���ø����̼� Ŭ���� �ε��̸� �ش� ���ø����̼��� path�� Ŭ������ �ε� �ϴ� Ŭ���� �δ� �̴�.
		// �ٽ� ���ϸ� classPath�� �������� ��� �Ǵ� ���ø����̼� Ŭ�������� �ε� �� �� ��� �Ǵ� Ŭ���� �δ��̴�.
		String ClassPath = System.getProperty("java.class.path");
		System.out.println(ClassPath);
		System.out.println(ClassLoader.getSystemClassLoader());
	}
}
