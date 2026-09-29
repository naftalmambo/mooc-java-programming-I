
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;

        Money newMoney = new Money(newEuros, newCents);
        return newMoney;

    }

    public boolean lessThan(Money compared) {
        int thisMoney = (this.euros * 100) + this.cents;
        int comparedMoney = (compared.euros * 100) + compared.cents;

        if (thisMoney < comparedMoney) {
            return true;

        }
        return false;
    }

    public Money minus(Money decreser) {
        int ownMoney = (this.euros * 100) + this.cents;
        int decreserMoney = (decreser.euros * 100) + decreser.cents;

        int differenceMoney = ownMoney - decreserMoney;
        if (differenceMoney < 0) {
            return new Money(0, 0);

        } else {
            int finalEuros = differenceMoney / 100;
            int finalCents = differenceMoney % 100;
            return new Money(finalEuros, finalCents);

        }

    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
