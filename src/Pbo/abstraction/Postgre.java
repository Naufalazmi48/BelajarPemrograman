/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pbo.abstraction;

/**
 *
 * @author MATRIX COMPUTER
 */
public class Postgre implements Databases{
 @Override
    public void connect() {
        System.out.println("Connect database Postgre");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnect database Postgre");
    }

    @Override
    public void insertData() {
        System.out.println("Insert data to database Postgre");
    }

    @Override
    public void readAllData() {
        System.out.println("Read all data to database Postgre");
    }

    @Override
    public void updateData() {
        System.out.println("Update data in database Postgre");
    }

    @Override
    public void deleteData() {
        System.out.println("Delete data From database Postgre");
    }

    @Override
    public void searchData() {
        System.out.println("Search Data in database Postgre");
    }
}
