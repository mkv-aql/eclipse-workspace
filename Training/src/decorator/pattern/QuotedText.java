package decorator.pattern;

public class QuotedText extends TextDecorator {
    public QuotedText(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getContent() {
        return "\"" + decoratedText.getContent() + "\"";
    }
}

