package database;
public class Tree {
    int id;
    String name;
    int  age;

    String address;
    String  owner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Tree( int id,String name, int age, String address, String owner) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.address = address;
        this.owner = owner;
    }
    public static void main(String[] args) {
        System.out.println("treeeee!!");
    }
}
