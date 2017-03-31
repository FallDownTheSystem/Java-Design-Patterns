/**
 *
 * @author Jere Kaplas
 */
package carrental;

public class Customer {
    
    private int id;
    private String name;
    private String address;
    private String number;
    
    public Customer(int cId, String cName, String cAddress, String cNumber) {
        this.id = cId;
        this.name = cName;
        this.address = cAddress;
        this.number = cNumber;
    }
    public String toString() {
        return "Id: " + this.id + ", Name: " + this.name + ", Address: " + this.address + ", Number: " + this.number;
    } 
}
