package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    static void main() {

        Department obj = new Department(1, "Books");
        Seller seller = new Seller(21, "Boberto", "boberto@gmail.com", new Date(), 3000.0, obj);

        IO.print(seller);
    }
}
