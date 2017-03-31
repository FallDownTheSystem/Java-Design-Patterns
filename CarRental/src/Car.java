/**
 *
 * @author Jere Kaplas
 */
package carrental;

public class Car {
    
    private int id;
    private String marque; 
    private String model;
    private String mfYear;
  
    public Car(int cId, String cMarque, String cModel, String cMfYear) {
        this.id = cId;
        this.marque = cMarque;
        this.model = cModel;
        this.mfYear = cMfYear;
    }
    public String toString() {
        return "Id: " + this.id + ", Brand: " + this.marque + ", Model: " + this.model + ", Manifacturing year: " + this.mfYear;
    }
}
