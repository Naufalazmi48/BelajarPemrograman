/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pbo.abstraction;
public class MainClass {
    public static void main(String[] args) {
        Databases database = new Sql();
        create(database);
    }
    
    private static void create(Databases database) {
        database.connect();
        database.insertData();
        database.disconnect();
    }
    
    private static void read(Databases database) {
        database.connect();
        database.readAllData();
        database.disconnect();
    }
    
    private static void update(Databases database) {
        database.connect();
        database.updateData();
        database.disconnect();
    }
    
    private static void delete(Databases database) {
        database.connect();
        database.deleteData();
        database.disconnect();
    }
}