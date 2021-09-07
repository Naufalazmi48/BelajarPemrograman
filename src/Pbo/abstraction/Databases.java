package Pbo.abstraction;

public interface Databases {
    public void connect();
    public void disconnect();
    public void insertData();
    public void readAllData();
    public void updateData();
    public void deleteData();
    public void searchData();
}

//abstract class Databases {
//    abstract public void connect();
//    abstract public void disconnect();
//    abstract public void insertData();
//    abstract public void readAllData();
//    abstract public void updateData();
//    abstract public void deleteData();
//    abstract public void searchData();
//}