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
            System.out.println("Enter command");
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
                default:
                    System.out.println("It isn'n a command");
            }
        }
    }

    private static void delete() {
        System.out.println("Enter ID");
        int  = scanner.nextInt();
        for (int i = 0; i < person.size(); i++) {

        }


    }

    private static void create() {


        System.out.println("Enter name");
        String name = scanner.next();

        System.out.println("Enter surname");
        String surname = scanner.next();

        System.out.println("Enter phone");
        String phone = scanner.next();

        Person r = new Person();
        r.setName(name);
        r.setSurname(surname);
        r.setPhone(phone);
        person.add(r);
        System.out.println(r);


    }

    private static void list() {

        for (Person r : person) {
            System.out.println(r);
        }


    }
}
