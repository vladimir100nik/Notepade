package lv.tsi.java;

public class Note extends Record {

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private String text;

    {
    }


    @Override
    public String toString() {
        return "Note{" +
                "id" + getId() + "," +
                "text='" + text + '\'' +
                '}';
    }

    @Override
    public boolean hasSubstring(String str) {
        return text.contains(str);
    }
}