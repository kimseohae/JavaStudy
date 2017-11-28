package ch1_ClassLoader.S1_WhatIsClassLoader;

/**
 * Ŭ���� �δ��� �ڹ� Ŭ������ �ڹ� ����ӽ�(JVM)���� ���� �ϴ� �ڹ� ��Ÿ�� ȯ���� �ϳ� �̴�.
 * �Ϲ� ������ ���� �ϴ� Ŭ���� ������ JVM�� �޸� ������ �ø����� �� JVM���� Ŭ���� ������ ��� �� �� �ִ� ���̴�.
 * Ŭ���� �δ��� �ش� Ŭ���� ��û�� JVM�� ���� ���� �ʾ��� ��� ���� �ѹ� ����Ǹ� �� Ŭ���� �δ� ���п�
 * �����ڴ� ���� �ý��ۿ� ���Ͽ� �� �ʿ䰡 ���� ȿ������ ������ �����ϴ�.
 */
public class L1_ImClassLoader {
	public static void main(String[] args) {
		/**
		 * ������ ���ؼ��� �ѹ��� ¤�� ���� �Ѿ� �� �����̴�.
		 */
		ClassLoader loader = new ClassLoader() {};
		try {
			
			// 1. ClassLoader�� ����Ͽ� �ڹ��� ����ӽſ� Class���� ���� �� �ҽ� ������ �ø���.
			// <?>�� Ÿ���� �˼� ���� ������ �ۼ��� ���̴�. 
			// ���� ī��� ���Ŀ� �ٷ� �����̴�. ���׸� ����
			Class<?> cls = loader.loadClass("ch1_ClassLoader.S1_WhatIsClassLoader.Me");
			
			try {
				
				// 2. �÷��� Class�� ����Ͽ� �ν��Ͻ��� ������Ų��. �� ��ü�� ��ȯ�Ѵ�.
				Object o = cls.newInstance();
				// 3. Me Ÿ������ �ٿ� �ɽ��� �Ͽ� ����Ѵ�.
				Me me = ((Me)o);
				me.show();
				
			} catch (InstantiationException e) {// class�� ã�� �� ���� ��� �� load ���� ���� Ŭ������ ����� ��� InstantiationException ������ �߻��Ѵ�.
				e.printStackTrace();
			} catch (IllegalAccessException e) {// classLoader�� Lock�� �� ��� IllegalAccessException ������ �߻��Ѵ�.
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {// loadClass �޼��带 ���� �� �ش� Ŭ������ ���� ��� ClassNotFound�̺�Ʈ�� �߻��Ѵ�.
			e.printStackTrace();
		}
	}
}
class Me{
	public void show(){
		System.out.println("Meu Meu ~ ");
	}
}
