package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.ArrayList;
import java.util.List;

public class Program {
    static void main() {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        IO.println("===== TEST 1: seller findById =====");
        Seller seller = sellerDao.findById(3);
        IO.println(seller);

        IO.println("\n===== TEST 2: seller findByDepartment =====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        list.forEach(IO::println);

        IO.println("\n===== TEST 3: seller findAll =====");
        list = sellerDao.findAll();
        list.forEach(IO::println);
    }
}
