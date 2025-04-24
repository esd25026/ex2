public class Main
{
    public static void main(String[] args)
    {
        TicketMachine machine = new TicketMachine(70);
        
        machine.showPrice();
        System.out.println("Money entered for issuing a ticket (balance): " + machine.getBalance());
        machine.printTicket();

        machine.insertMoney(20);
        System.out.println("Total amount of money inserted: " + machine.getBalance());
        machine.insertMoney(20);
        System.out.println("Total amount of money inserted: " + machine.getBalance());
        machine.insertMoney(20);
        System.out.println("Total amount of money inserted: " + machine.getBalance());
        machine.insertMoney(20);
        System.out.println("Total amount of money inserted: " + machine.getBalance());
        
        machine.printTicket();
        int resta = machine.refundBalance();
        if ( resta > 0)
            System.out.println("Take the change: " + resta + " cents");
            
        System.out.println("Emptying the machine... Total amount of money collected: " + machine.emptyMachine() + " cents");
        
        /* Η παρακάτω κλήση για την εμφάνιση του συνόλου των χρημάτων που υπάρχουν
         * στη μηχανή μετά το άδειασμά της δεν ζητήθηκε στην εκφώνηση
         */
        System.out.println("Total amount of money in the ticket machine: " + machine.emptyMachine());
    }
}
