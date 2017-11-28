package ch1_ClassLoader.S1_WhatIsClassLoader;

/**
 * 클래스 로더는 자바 클래스를 자바 가상머신(JVM)으로 적재 하는 자바 런타임 환경중 하나 이다.
 * 일반 적으로 생각 하는 클래스 파일을 JVM의 메모리 공간에 올림으로 써 JVM에서 클래스 파일을 사용 할 수 있는 것이다.
 * 클래스 로더는 해당 클래스 요청시 JVM에 적재 되지 않았을 경우 최초 한번 실행되며 이 클래스 로더 덕분에
 * 개발자는 파일 시스템에 관하여 알 필요가 없어 효율적인 개발이 가능하다.
 */
public class L1_ImClassLoader {
	public static void main(String[] args) {
		/**
		 * 에러에 관해서는 한번만 짚어 보고 넘어 갈 예정이다.
		 */
		ClassLoader loader = new ClassLoader() {};
		try {
			
			// 1. ClassLoader를 사용하여 자바의 가상머신에 Class목적 파일 즉 소스 파일을 올린다.
			// <?>는 타입을 알수 없기 떄문에 작성한 것이다. 
			// 히든 카드는 추후에 다룰 예정이다. 제네릭 포함
			Class<?> cls = loader.loadClass("ch1_ClassLoader.S1_WhatIsClassLoader.Me");
			
			try {
				
				// 2. 올려진 Class를 사용하여 인스턴스를 생성시킨다. 즉 객체를 반환한다.
				Object o = cls.newInstance();
				// 3. Me 타입으로 다운 케스팅 하여 사용한다.
				Me me = ((Me)o);
				me.show();
				
			} catch (InstantiationException e) {// class를 찾을 수 없는 경우 즉 load 되지 않은 클래스를 사용할 경우 InstantiationException 에러가 발생한다.
				e.printStackTrace();
			} catch (IllegalAccessException e) {// classLoader로 Lock을 걸 경우 IllegalAccessException 에러가 발생한다.
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {// loadClass 메서드를 실행 시 해당 클래스가 없을 경우 ClassNotFound이벤트를 발생한다.
			e.printStackTrace();
		}
	}
}
class Me{
	public void show(){
		System.out.println("Meu Meu ~ ");
	}
}
