package Lesson6;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CreditCard {

    String NumberBankAccount;
    double AmountInBankAccount;





    public CreditCard(double sum, ArrayList<String> availableBankNumbers) {

        this.AmountInBankAccount = sum;
        this.NumberBankAccount = availableBankNumbers.get(0);
        availableBankNumbers.remove(0);


    }

    void setMoney(double money) {

        this.AmountInBankAccount += money;
        System.out.println("На ваш счёт добавлена " + money + "Сумма");
    }

    void setWithdrawalMoney(double money) {

        this.AmountInBankAccount -= money;
        System.out.println("С вашего счёта снято " + money + "рублей");
    }

    void infoOfBankAccount() {
        System.out.println(this.AmountInBankAccount);
        System.out.println(this.NumberBankAccount);
    }

    double getMoney() {
        return this.AmountInBankAccount;
    }


    public static void main(String[] args) {

        ArrayList<String> availableBankNumbers = new ArrayList<>(Arrays.asList("1", "2", "3", "4"));

        Scanner in = new Scanner(System.in);

        System.out.println("Введите начальную сумму для 3-х карточек: \n");

        CreditCard Denis = new CreditCard(in.nextDouble(), availableBankNumbers);
        CreditCard Dima = new CreditCard(in.nextDouble(), availableBankNumbers);
        CreditCard Anya = new CreditCard(in.nextDouble(), availableBankNumbers);

        System.out.println("Введите сумму на которую хотите пополнить карточку");
        Denis.setMoney(in.nextDouble());

        System.out.println("Введите сумму на которую хотите пополнить карточку");
        Dima.setMoney(in.nextDouble());

        System.out.println("Введите сумму которую хотите снять с карточки: \n");
        Anya.setWithdrawalMoney(in.nextDouble());

        System.out.println("\nНомер счёта и сумма: \n");
        Denis.infoOfBankAccount();

        System.out.println("\nНомер счёта и сумма: \n");
        Dima.infoOfBankAccount();

        System.out.println("\nНомер счёта и сумма: \n");
        Anya.infoOfBankAccount();


    }


}

