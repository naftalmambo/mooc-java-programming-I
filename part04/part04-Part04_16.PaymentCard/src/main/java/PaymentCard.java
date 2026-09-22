public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;

    }

    public void eatAffordably() {
        if (this.balance >= 2.60) {

            this.balance = this.balance - 2.60;

        }
    }

    public void eatHeartily() {
        if (this.balance >= 4.60) {

            this.balance = this.balance - 4.60;

        }
    }

    public void addMoney(double amount) {
        // 1. Master Security Shield: Only allow positive deposit amounts in
        if (amount > 0) {

            // 2. Ceiling Check: If adding the money stays under or hits the 150 limit
            if (this.balance + amount <= 150) {
                this.balance = this.balance + amount; // Perform normal addition
            } else {
                this.balance = 150; // Clamp the balance exactly to the 150 cap
            }

        }
        // Negative amounts fall out here automatically, changing absolutely nothing!
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";

    }

}
