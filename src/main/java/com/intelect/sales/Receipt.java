package com.intelect.sales;

import java.util.Arrays;

public class Receipt {
    public static void printReceipt(ProductInfo[] productInfos){
        Transaction transaction = new Transaction();
        for (ProductInfo item : productInfos){
            Transaction.TransactionItem transactionItem = transaction.new TransactionItem(item.price, item.name);
            transactionItem.printInfo();
        }
        transaction.printCheck();
    }
    public static void printTransactionInfo(Transaction.TransactionItem transactionItem){
        Transaction transaction = transactionItem.getTransaction();
        transaction.printCheck();
    }
}
