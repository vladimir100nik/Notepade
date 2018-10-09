package lv.tsi.java;

public class Person extends Record {                //extends- наследует с Record
    private String name;
    private String surname;
    private String phone;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean hasSubstring(String str) {
        return name.contains(str)
                || surname.contains(str)
                || phone.contains(str)
                || email.contains(str);

    }

    @Override
    public void askQuestions() {
        System.out.println("Enter name");
        name = Main.askString();

        System.out.println("Enter surname");
        surname = Main.askString();

        System.out.println("Enter phone");
        phone = Main.askString();

        System.out.println("Enter email");
        email = Main.askString();
    }
}
