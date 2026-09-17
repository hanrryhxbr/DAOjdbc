package application;

import model.entities.Department;

public class Program {
    static void main() {

        Department obj = new Department(1, "Books");
        IO.print(obj);
    }
}
