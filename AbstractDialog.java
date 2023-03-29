package Task2;

public abstract  class AbstractDialog implements Dialog {
    abstract Button getButton();

    public void render() {
        Button button = getButton();
        button.render();
    }
}