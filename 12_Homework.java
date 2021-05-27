public class Main {

    public static void main(String[] args) {
	String strJava = "I like Java!!!";

	boolean analyzeStr1 = strJava.contains("Java");
        System.out.println("Строка содержит 'Java': " + analyzeStr1);

        boolean analyzeStr2 = strJava.startsWith("I like");
        System.out.println("Строка начинается с 'I like': " + analyzeStr2);

        boolean analyzeStr3 = strJava.endsWith("!!!");
        System.out.println("Строка заканчивается '!!!': " + analyzeStr3);

        if (analyzeStr1 && analyzeStr2 && analyzeStr3) {
            System.out.println(strJava.toUpperCase());
        }

        String strJavaReplace = strJava.replace('a', 'o');
        String result = strJavaReplace.substring(7, 11);
        System.out.println(result);
    }
}
