package lv.tsi.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.sun.tools.attach.VirtualMachine.list;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<Person> person = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter command ('Help' for help):");
            String cmd = scanner.next();
            switch (cmd) {
                case "create":
                    create();
                    break;
                case "exit":
                    return;
                case "list":
                    list();
                    break;
                case "delete":
                    delete();
                    break;
                case "help":
                    help();
                    break;
                default:
                    System.out.println("It isn'n a command");
            }
        }
    }

    private static void help() {
        System.out.println("Menu:\n" +
                "create - enter new person\n" +
                "list - show person list\n" +
                "delete - remove person\n" +
                "exit - close program\n" +
                "help - command list");


    }

    private static void delete() {
        System.out.println("Enter ID");
        int id = scanner.nextInt();
        for (int i = 0; i < person.size(); i++) {
            Person p = person.get(i);
            if (id == p.getId()) {
                person.remove(i);
                break;
            }
//
//            for (Person p:person){
//                if (id==p.getId()){                       //not optimal
//                    person.remove(p);
//                    break;
//                }
        }
    }


    private static void create() {


        System.out.println("Enter name");
        String name = askString();

        System.out.println("Enter surname");
        String surname = askString();

        System.out.println("Enter phone");
        String phone = askString();
        System.out.println("Enter email");
        String email = askString();
        Person r = new Person();
        r.setName(name);
        r.setSurname(surname);
        r.setPhone(phone);
        r.setEmail(email);

        person.add(r);
        System.out.println(r);


    }

    private static String askString() {

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

        for (Person r : person) {
            System.out.println(r);
        }


    }
}
