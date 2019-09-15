package solutions.techcircle.InnerOutterClassAbstract;

import solutions.techcircle.InnerOutterClassAbstract.OuterClass.innerClass;

public class innerOuterMain {
	
	
	
	public static void main(String[] args) {
		
		OuterClass outer = new OuterClass();
		OuterClass.innerClass innerC = outer.new innerClass();
		System.out.println(innerC.myInnerMethod());
		
	}

}
 