package Coding;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Emma-is-a-data-engineer";
		String[] substrings=str1.split("-");
		
		for(String substring : substrings) {
			System.out.println(substring);
		}
	}

}

//public static void main(String args[])
//{
//    String str = "geekss@for@geekss";
//    String[] arrOfStr = str.split("s", 0);
//
//    for (String a : arrOfStr)
//        System.out.println(a);
//}
//}



//public static void main(String args[])
//{
//    // Custom input string
//    String str = "geekss@for@geekss";
//    String[] arrOfStr = str.split("@", 2);
//
//    for (String a : arrOfStr)
//        System.out.println(a);
//}
//}


//public static void main(String args[])
//{
//    String str = "geekss@for@geekss";
//    String[] arrOfStr = str.split("@", 5);
//
//    for (String a : arrOfStr)
//        System.out.println(a);
//}
//}


//public static void main(String args[])
//{
//    String str = "geekss@for@geekss";
//    String[] arrOfStr = str.split("@", -2);
//
//    for (String a : arrOfStr)
//        System.out.println(a);
//}
//}

//public class GFG {
//    public static void main(String args[])
//    {
//        String str = "geekss@for@geekss";
//        String[] arrOfStr = str.split("s", 5);
// 
//        for (String a : arrOfStr)
//            System.out.println(a);
//    }
//}



//public class GFG {
//    public static void main(String args[])
//    {
//        String str
//            = "GeeksforGeeks:A Computer Science Portal";
//        String[] arrOfStr = str.split(":");
// 
//        for (String a : arrOfStr)
//            System.out.println(a);
//    }
//}



//public class GFG {
//    public static void main(String args[])
//    {
//        String str = "GeeksforGeeksforStudents";
//        String[] arrOfStr = str.split("for");
// 
//        for (String a : arrOfStr)
//            System.out.println(a);
//    }
//}


//public static void main(String args[])
//{
//    String str = "Geeks.for.Geeks";
//    String[] arrOfStr
//        = str.split("[.]"); // str.split("."); will give
//                            // no output...
//
//    for (String a : arrOfStr)
//        System.out.println(a);
//}
//}

//public static void main(String args[])
//{
//    String str = "word1, word2 word3@word4?word5.word6";
//    String[] arrOfStr = str.split("[, ?.@]+");
//
//    for (String a : arrOfStr)
//        System.out.println(a);
//}
//}



