package Pbo.abstraction;
public class Sql implements Databases{

    @Override
    public void connect() {
        System.out.println("Connect database SQL");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnect database SQL");
    }

    @Override
    public void insertData() {
        System.out.println("Insert data to database SQL");
    }

    @Override
    public void readAllData() {
        System.out.println("Read all data to database SQL");
    }

    @Override
    public void updateData() {
        System.out.println("Update data in database SQL");
    }

    @Override
    public void deleteData() {
        System.out.println("Delete data From database SQL");
    }

    @Override
    public void searchData() {
        System.out.println("Search Data in database SQL");
    }
    
}
