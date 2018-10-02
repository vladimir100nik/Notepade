package lv.tsi.java;

public  abstract class Record {

    private static int count = 0;
    private int id;

    public Record() {
        count++;
        id = count;
    }

    public abstract  boolean hasSubstring(String str);


    public int getId() {
        return id;
    }
}