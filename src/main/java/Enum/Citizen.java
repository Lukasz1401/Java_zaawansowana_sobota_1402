package Enum;

public class Citizen {

    private String name;
    private String surname;
    private long pesel;
    private Sex sex;
    public Citizen(String name, String surname, long pesel, Sex sex) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this. sex = sex;
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

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel=" + pesel +
                ", sex=" + sex +
                '}';
    }
}
