package com.kda.bankomat;

/**
 * Создать класс, описывающий банкомат.
 * Банкомат задается тремя свойствами:
 * - количеством купюр номиналом 20, 50 и 100.
 * Сделать методы для добавления денег в банкомат.
 * Сделать метод, снимающий деньги: он принимает сумму денег, а возвращает булево значение - успешность выполнения операции.
 * При снятии денег метод должен распечатывать каким количеством купюр какого номинала выдаётся сумма.
 * Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 */
public class Bankomat {

    private int twenty;
    private int fifty;
    private int oneHundred;

    public Bankomat(int twenty, int fifty, int oneHundred) {
        this.twenty = twenty;
        this.fifty = fifty;
        this.oneHundred = oneHundred;
    }

    public void setMoney(int twenty, int fifty, int oneHundred) {
        this.twenty += twenty;
        this.fifty += fifty;
        this.oneHundred += oneHundred;
    }

    public boolean cashWithdrawal(int summ) {
        if (summ > (twenty * 20) + (fifty * 50) + (oneHundred * 100)) {
            return false;
        } else {
            System.out.println("Было выданно купюр, номиналом 100 - " + summ / 100 + ", номиналом 50 - " + summ % 100 / 50 + ", номиналом 20 - " + summ % 100 % 50 / 20);
            return true;
        }
    }

}
