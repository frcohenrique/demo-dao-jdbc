package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== TESTE 1: department findById ====");
		Department dep = departmentDao.findById(2);
		System.out.println(dep);
		
		sc.close();

		System.out.println("==== TESTE 2: department insert ====");
		Department newDep = new Department(null, "Moveis");
		departmentDao.insert(newDep);
		System.out.println("Inserted! New id = " + newDep.getId());
		
		System.out.println("==== TESTE 3: department update ====");
		dep.setName("Games");
		dep.setId(6);
		departmentDao.update(dep);
		System.out.println("Update completed! ");
		
		System.out.println("==== TESTE 4: department delete ====");
		departmentDao.deleteById(9);
		System.out.println("Row deleted! ");
	}

}
