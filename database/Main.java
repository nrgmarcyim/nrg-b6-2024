import com.sun.source.util.Trees;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static private String url="jdbc:mysql://localhost:3306/nrgtvi";
    static private String username ="root";
    static private String password ="root";
    static private String Db_trees = "select * from 'trees'";
    static Connection con;

    static void testCon(){
        try {
            con = DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    static void menu(){
        System.out.println("Menu: \n1 - New Tree\n2 - Update Tree\n3 - Delete Tree\n4 - Exit");
        Scanner input1 = new Scanner(System.in);
        switch (Integer.parseInt(input1.next())){
            case 1: addTree(); break;
            case 2: updateTree(); break;
            case 3: deleteTree(); break;
            case 4:
                System.exit(0) ; break;
            default:
                System.out.println("invalid input");

                break;
        }
    }

    private static void deleteTree() {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Tree ID to delete: ");
        int id = input1.nextInt();
        try {
            String trees = "select * from trees where id ="+id;
            Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet allTrees= statement.executeQuery(trees);
            allTrees.absolute(1);
            allTrees.deleteRow();

        }
        catch (SQLException e){
            System.out.println(e);
        }
        showAllTrees();
        menu();

    }

    private static void updateTree() {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Tree ID to update: ");
        int id = input1.nextInt();
        System.out.println("Enter Tree name: ");
        String name = input1.next();
        System.out.println("Enter Tree age: ");
        int  age = input1.nextInt();
        System.out.println("Enter Tree address: ");
        String address=input1.nextLine();
        System.out.println("Enter Tree owner: ");
        String  owner=input1.nextLine();
        try {
            String trees = "select * from trees where id ="+id;
            Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet allTrees= statement.executeQuery(trees);
            allTrees.absolute(1);
            allTrees.updateString(2,name);
            allTrees.updateInt(3,age);
            allTrees.updateString(4,address);
            allTrees.updateString(5,owner);
            allTrees.updateRow();

        }
        catch (SQLException e){
            System.out.println(e);
        }
        showAllTrees();
        menu();
    }

    private static void addTree() {

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Tree name: ");
        String name = input1.nextLine();
        System.out.println("Enter Tree age: ");
        int  age = input1.nextInt();
        System.out.println("Enter Tree address: ");
        String address=input1.nextLine();
        System.out.println("Enter Tree owner: ");
        String  owner=input1.nextLine();

        try {
            String trees = "select * from trees";
            Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet allTrees= statement.executeQuery(trees);
            allTrees.moveToInsertRow();
            allTrees.updateString(2,name);
            allTrees.updateInt(3,age);
            allTrees.updateString(4,address);
            allTrees.updateString(5,owner);
            allTrees.insertRow();


        }
        catch (SQLException e) {
            System.out.println(e);
        }
        showAllTrees();
        menu();

    }

    public static void main(String[] args) {
        testCon();
        showAllTrees();
        menu();
    }

    private static void showAllTrees() {
        List<Tree> tree = new ArrayList<Tree>();
        try{
            String trees = "select * from trees";
            Statement statement = con.createStatement();
            ResultSet allTrees= statement.executeQuery(trees);
            while (allTrees.next()){
                tree.add(new Tree(allTrees.getInt(1),allTrees.getString(2),allTrees.getInt(3),allTrees.getString(4),allTrees.getString(5)));
            }

        }
        catch (SQLException e){
            System.out.println(e);

        }
        System.out.println(tree);
    }
}
