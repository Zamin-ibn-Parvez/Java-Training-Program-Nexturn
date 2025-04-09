package AccountRestrictionsUsingSealed;



public non-sealed  class ClassOne implements One {

	public void methodOne() {
		System.out.println("This is from sealed interface");
	}
	
	public static void main(String[] args) {
		ClassOne one = new ClassOne();
		one.methodOne();
	}
}


