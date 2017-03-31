/**
 *
 * @author Jere Kaplas
 */
package carrental;

import java.util.Date;

public class Rental {

    private Customer customer;
    private Car car;
    private Date startDate;
    private Date endDate;

    public Rental(Customer renter, Car rentalCar, Date start, Date end) {
        this.car = rentalCar;
        this.customer = renter;
        this.startDate = start;
        this.endDate = end;
    }
    public String toString() {
        return "Customer info: " + this.customer + "\nCar details: " + this.car + "\nStart date: " + this.startDate + ", End date: " + this.endDate;
    } 
}
