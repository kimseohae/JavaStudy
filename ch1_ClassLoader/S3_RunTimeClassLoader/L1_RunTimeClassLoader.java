package ch1_ClassLoader.S3_RunTimeClassLoader;

public class L1_RunTimeClassLoader {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		// Ŭ���� ���� �ÿ� ���� Ŭ���� �ε�
		// Ŭ������ ������ �ֱ� ������ Ŭ������ �ε� ���� �ʴ´�
		ClassLoader myClassLoader = new ClassLoader() {};
		Class<?> firstRef = myClassLoader.loadClass("ch1_ClassLoader.S3_RunTimeClassLoader.Cclass");
		Cclass C = (Cclass) firstRef.newInstance();
		C.show();
		Class<?> secondRef = myClassLoader.loadClass("ch1_ClassLoader.S3_RunTimeClassLoader.Cclass");
		Cclass C2 = (Cclass) secondRef.newInstance();
		C2.show();
		System.out.println("�ε� �� Ŭ������ ���ϼ� Ȯ�� : "+(firstRef == secondRef));
		
		// ��� ���迡 �ִ� Ŭ���� �ε� AŬ������ ��ӹ��� BŬ���� ���� �ε�
		// ��� ������ �ִ� Ŭ�������� �������� �ε� �ȴ�.
		ClassLoader myClassLoader2 = new ClassLoader() {};
		Class<?> childClass = myClassLoader2.loadClass("ch1_ClassLoader.S3_RunTimeClassLoader.Bclass");
		Bclass bc =(Bclass)childClass.newInstance();
		bc.show();
		Class<?> parentClass = myClassLoader2.loadClass("ch1_ClassLoader.S3_RunTimeClassLoader.Aclass");
		System.out.println("�������� �ε� Ŭ������ ���ϼ� Ȯ�� : " +(childClass.getSuperclass() == parentClass));
		
		// ClassLoader�� Ʈ�� ���� Ȯ��
		// SystemClassLoader
		//		|
		//		+-- myClassLoader
		//		|
		//		+-- myClassLoader2
		//
		System.out.println("SystemClassLoader(appClassLoader) : "+ClassLoader.getSystemClassLoader());
		System.out.println("myClassLoader(myClassLoader) : "+myClassLoader.getClass());
		System.out.println("sys == my1 : "+(ClassLoader.getSystemClassLoader() == myClassLoader.getParent()));
		System.out.println("sys == my2 : "+(ClassLoader.getSystemClassLoader() == myClassLoader2.getParent()));
	}
}

class Aclass {
	static{
		// class ���� Ȯ���� ���� ���� ���� ����
		System.out.println("Aclass Deployed");
	}
	public void show(){
		System.out.println("Aclass Run");
	}
}
class Bclass extends Aclass{
	static{
		// class ���� Ȯ���� ���� ���� ���� ����
		System.out.println("Bclass Deployed");
	}
	public void show(){
		System.out.println("Bclass Run");
	}
}
class Cclass {
	static{
		// class ���� Ȯ���� ���� ���� ���� ����
		System.out.println("Cclass Deployed");
	}
	public void show(){
		System.out.println("Cclass Run");
	}
}
class Dclass {
	static{
		// class ���� Ȯ���� ���� ���� ���� ����
		System.out.println("Dclass Deployed");
	}
	public void show(){
		System.out.println("Dclass Run");
	}
}