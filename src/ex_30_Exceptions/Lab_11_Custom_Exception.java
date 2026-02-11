package ex_30_Exceptions;

public class Lab_11_Custom_Exception {
    public static void main(String[] args) throws CurrencyMismatchException {
        Bank sbi = new Bank(1000, "INR");
        Bank icici1 = new Bank(2000, "INR");

        Integer TotalAmount = sbi.add(icici1);
        System.out.println("Total Amount : " + TotalAmount);

        Bank StandardCharted = new Bank(3000, "USD");
        Integer TotalAmount1 = sbi.add(StandardCharted);
        System.out.println("Total Amount34");

    }
}

class CurrencyMismatchException extends Exception {
    public CurrencyMismatchException(String msg) {
    super(msg);
    }
}

class Bank{
    private Integer amount;
    private String currency;

    public Bank(Integer amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer add(Bank bankName) throws CurrencyMismatchException {
        if(bankName.currency.equals("INR")){
            return bankName.amount + this.amount;
        }else {
            throw new CurrencyMismatchException("Currency doesn't match");
        }

    }

}