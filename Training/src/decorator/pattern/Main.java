package decorator.pattern;

public class Main {
    public static void main(String[] args) {
        Text basicText = new BasicText("Hello, world!");
        Text upperCaseText = new UpperCaseText(basicText);
        Text quotedAndUpperCaseText = new QuotedText(upperCaseText);

        System.out.println(basicText.getContent()); // Outputs: Hello, world!
        System.out.println(upperCaseText.getContent()); // Outputs: HELLO, WORLD!
        System.out.println(quotedAndUpperCaseText.getContent()); // Outputs: "HELLO, WORLD!"
    }
}

