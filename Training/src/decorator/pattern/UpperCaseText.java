package decorator.pattern;

public class UpperCaseText extends TextDecorator {
    public UpperCaseText(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getContent() {
        return decoratedText.getContent().toUpperCase();
    }
}

