package com.intelect.sales;

public class Transaction {
    public double getPrice() {
        return price;
    }

    private double price;

    public Transaction() {
    }

    private double tax = 1.2;

    private double dealPrice() {
        return price * tax;
    }

    private void printCheck(double price) {
        String form = String.format("%.2f", price);
        System.out.println("price: USD " + form);
    }

    public void printCheck() {
        double totalPrice = tax * price;
        System.out.println("Order price: USD " + price);
        System.out.println("Total price: USD " + totalPrice);
    }

    class TransactionItem {

        public Transaction getTransaction() {
           return Transaction.this;
        }

        private double price;
        private static String name;

        public TransactionItem(double price, String name) {
            if (name == null || name.trim().isEmpty() ) {
                this.name = "Default";
                }else {
                  this.name = name.trim();
            }
            if (price > 0){
                this.price = price;
            }else {
                this.price = 0;
            }
            Transaction.this.price += this.price;
        }
        public  void printInfo(){
            System.out.printf("Item: %s, ", name);
            getTransaction().printCheck(price);
        }

    }
}
