class CommandLine {
	public static void main(String args[]) {
		for(int i = 0; i < args.length; i++)
			System.out.println("args[" + i + "] : " + args[i]);
	}
}

/*
OUTPUT: 
C:\Users\Swati\swati>javac CommandLine.java

C:\Users\Swati\swati>java CommandLine This is a Java Demo Program
args[0] : This
args[1] : is
args[2] : a
args[3] : Java
args[4] : Demo
args[5] : Program

*/
