/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory list = new ChangeHistory();

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);

        super.addToWarehouse(initialBalance);

        list.add(initialBalance);
    }

    public String history() {
        return list.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.list.add(super.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        if (super.getBalance() < amount) {
            this.list.add(super.getBalance());
            return super.getBalance();
        }
        super.takeFromWarehouse(amount);
        this.list.add(super.getBalance());

        return super.getBalance();
    }

    public void printAnalysis() {

        System.out.println("Product: " + this.getName());

        System.out.println("History: " + list.toString());

        System.out.println("Largest amount of product: " + list.maxValue());

        System.out.println("Smallest amount of product:" + list.minValue());

        System.out.println("Average: " + list.average());

    }
}
