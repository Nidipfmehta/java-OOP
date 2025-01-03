package generics;
/**
 *
 * Create a Generic LinkedList
 * with the below operations
 * - insert(index, T data) -> throw proper Exceptions
 * - remove(index) -> throw proper Exception
 * - remove(T data) -> throw proper exception
 * - reverse the LinkedList
 * - print(): prints the linkedList
 * Employee class -> getInHandSalary() -> default 10% tax, void leavePolicy(10 days)
 * Lawyer inherits Employee -> getInHandSalary() -> default 10% tax, but Lawyer takes 5% refund, leavePolicy(2 day
 * less )
 * Lawyer Manager inherits Lawyer -> getInHandSalary() -> default 10% tax, but Lawyer takes 5% refund,he/she gets an
 * extra bonus, bonus varies for each of the LMs  leavePolicy(2
 * day
 *  * less )
 * Engineer inherits Employee -> getInHandSalary() -> default 10% tax, 5% extra tax,  leavePolicy(10 day extra )
 * Engineering Manager -> Engineer -> getInHandSalary() -> he/she gets an extra bonus, bonus varies for each of the EMs
 */

/**
 *
 * pratham -> EM(Engineering Manager) linkedList
 * nidip-> Lawyer Manager -> linkedlist
 *
 */
public class Main {
    public static void main(String[] args) {
        GenericLinkedList<LawyerManager> l1List = new GenericLinkedList<>();
        l1List.insert(0, new LawyerManager("Nidip", 1000000, 10000));
        l1List.insert(0,new LawyerManager("Pratham", 100000, 1000));
        l1List.printLinkedList();
    }
}
