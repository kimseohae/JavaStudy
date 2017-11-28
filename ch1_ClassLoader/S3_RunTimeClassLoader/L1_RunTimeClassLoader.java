package ch1_ClassLoader.S3_RunTimeClassLoader;

public class L1_RunTimeClassLoader {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		// 클래스 참조 시에 최초 클래스 로드
		// 클래스의 참조가 있기 전에는 클래스는 로드 되지 않는다
		ClassLoader myClassLoader = new ClassLoader() {};
		Class<?> firstRef = myClassLoader.loadClass("ch1_ClassLoader.S3_RunTimeClassLoader.Cclass");
		Cclass C = (Cclass) firstRef.newInstance();
		C.show();
		Class<?> secondRef = myClassLoader.loadClass("ch1_ClassLoader.S3_RunTimeClassLoader.Cclass");
		Cclass C2 = (Cclass) secondRef.newInstance();
		C2.show();
		System.out.println("로딩 된 클래스의 동일성 확인 : "+(firstRef == secondRef));
		
		// 상속 관계에 있는 클래스 로드 A클래스를 상속받은 B클래스 동적 로드
		// 상속 관계의 있는 클래스들이 동적으로 로드 된다.
		ClassLoader myClassLoader2 = new ClassLoader() {};
		Class<?> childClass = myClassLoader2.loadClass("ch1_ClassLoader.S3_RunTimeClassLoader.Bclass");
		Bclass bc =(Bclass)childClass.newInstance();
		bc.show();
		Class<?> parentClass = myClassLoader2.loadClass("ch1_ClassLoader.S3_RunTimeClassLoader.Aclass");
		System.out.println("연쇄적인 로딩 클래스의 동일성 확인 : " +(childClass.getSuperclass() == parentClass));
		
		// ClassLoader의 트리 구조 확인
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
		// class 적재 확인을 위한 최초 실행 영역
		System.out.println("Aclass Deployed");
	}
	public void show(){
		System.out.println("Aclass Run");
	}
}
class Bclass extends Aclass{
	static{
		// class 적재 확인을 위한 최초 실행 영역
		System.out.println("Bclass Deployed");
	}
	public void show(){
		System.out.println("Bclass Run");
	}
}
class Cclass {
	static{
		// class 적재 확인을 위한 최초 실행 영역
		System.out.println("Cclass Deployed");
	}
	public void show(){
		System.out.println("Cclass Run");
	}
}
class Dclass {
	static{
		// class 적재 확인을 위한 최초 실행 영역
		System.out.println("Dclass Deployed");
	}
	public void show(){
		System.out.println("Dclass Run");
	}
}