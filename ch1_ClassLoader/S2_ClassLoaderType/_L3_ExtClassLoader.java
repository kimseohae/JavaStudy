package ch1_ClassLoader.S2_ClassLoaderType;

public class _L3_ExtClassLoader {
	public static void main(String[] args) {
		// 2. �ڹ� Ȯ�� ���̺귯���� �����ϴ� extClassLoader
		// extClassLoader�� URLClassLoader�� ��� �޾� ��� �ȴ�.(�� �ܺ��� ���̺귯���� �ҷ� �� �� �ִ� ȯ���� �����)
		// ��������� ��θ� ���� ���� ���� ��� /jre/lib/ext/*.jar�� ���� class������ �о� �´�.
		String extClassLoader = System.getProperty("java.ext.dirs");
		System.out.println(extClassLoader);
	}
}
