package decorator.pattern;

public class BasicText implements Text {
    private String content;

    public BasicText(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}

