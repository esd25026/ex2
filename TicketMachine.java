public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    private int tickets;

    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine(int ticketCost)
    {
        price = ticketCost;
        balance = 0;
        total = 0;
        tickets = 0;
    }
    
    public TicketMachine()
    {
        price = 100;  
        balance = 0;
        total = 0;
        tickets = 0;
    }

    public void setPrice(int newPrice)
    {
        price = newPrice;
    }

    public int getTickets()
    {
        return tickets;
    }

    public void addTicket()
    {
        tickets = tickets +1;   // tickets++;
    }

    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }
    
    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }
    /**
     * Receive an amount of money in cents from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) {
            balance += amount;
        }
        else {
            System.out.println("Use a positive amount: " +
                               amount);
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        if(balance >= price) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            addTicket();
            // Update the total collected with the price.
            total += price;
            // Reduce the balance by the prince.
            balance -= price;
        }
        else {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
                    
        }
    }
    
    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }

    public void checkTickets()
    {
        if (tickets == 4000)
        {
            System.out.println("The machine is running out of ink! Please refill.");
            tickets = 0;
        }            
    }
                
    public void showPrice()
    {
        System.out.println("The price of the tickets is " + price +" cents.");
    }
    
    public int emptyMachine()
    {
        int temp = total;
        total = 0;
        return temp;
    }    
}
