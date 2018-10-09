package lv.tsi.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<Record> recordList = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter command ('Help' for help):");
            String cmd = scanner.next();
            switch (cmd) {
                case "cp":
                    create();
                    break;
                case "ct":
                    ct();
                    break;
                case "exit":
                    return;
                case "list":
                    list();
                    break;
                case "delete":
                    delete();
                    break;
                case "find":
                    find();
                    break;
                case "help":
                    help();
                    break;
                case "rem":
                    createReminder();
                    break;
                default:
                    System.out.println("It isn'n a command");
            }
        }
    }

    private static void createReminder() {
        System.out.println("Enter reminder text");
        String text = askString();
        System.out.println("Enter reminder date");
        String date = askString();
        System.out.println("Enter reminder time");
        String time = askString();

        var reminder = new Reminder();
        reminder.setText(text);
        reminder.setDate(date);
        reminder.setTime(time);

        System.out.println(reminder);
        recordList.add(reminder);

    }

    private static void find() {
        System.out.println("Find what?");
        String str = askString();
        for (Record r : recordList) {
            if (r.hasSubstring(str)) {
                System.out.println(r);
            }
        }


    }

    private static void ct() {

        Note note = new Note();
        note.askQuestions();
        recordList.add(note);
        System.out.println(note);
    }

    private static void help() {
        System.out.println("Menu:\n" +
                "create - enter new recordList\n" +
                "list - show  list\n" +
                "delete - remove \n" +
                "exit - close program\n" +
                "rem - enter reminder\n" +
                "help - command list");


    }

    private static void delete() {
        System.out.println("Enter ID");
        int id = scanner.nextInt();
        for (int i = 0; i < recordList.size(); i++) {
            Record p = recordList.get(i);
            if (id == p.getId()) {
                recordList.remove(i);
                break;
            }
//
//            for (Person p:recordList){
//                if (id==p.getId()){                       //not optimal
//                    recordList.remove(p);
//                    break;
//                }
        }
    }


    public static void create() {

        Person r = new Person();
        r.askQuestions();
        recordList.add(r);
        System.out.println(r);


    }

    public static String askString() {

        var result = new ArrayList<String>();
        var word = scanner.next();
        if (word.startsWith("\"")) {
            do {
                result.add(word);
                if (word.endsWith("\"")) {
                    String join = String.join(" ", result);
                    return join.substring(1, join.length() - 1);
                }
                word = scanner.next();
            } while (true);
        } else {
            return word;
        }

    }

    private static void list() {

        for (Record r : recordList) {
            System.out.println(r);
        }


    }
}
