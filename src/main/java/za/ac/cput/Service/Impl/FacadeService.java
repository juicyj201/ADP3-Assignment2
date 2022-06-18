package za.ac.cput.Service.Impl;

import za.ac.cput.Domain.Entities.City;
import za.ac.cput.Domain.Entities.Employee;
import za.ac.cput.Domain.Entities.Student;

import java.util.List;

public class FacadeService {
    public static String getEmployeeNameByEmail(String employeeEmail){
        EmployeeServiceImpl service = new EmployeeServiceImpl();
        return service.getEmployeeNameByEmail(employeeEmail);
    }

    public static List<Student> getStudentLastNamesByCountryId(String countryId){
        StudentServiceImpl service = new StudentServiceImpl();
        return service.studentLastNameByCountryId(countryId);
    }

    public static String getEmployeeNameByCity(String cityId){
        EmployeeAddressServiceImpl service = new EmployeeAddressServiceImpl();
        return service.getEmployeeNameByCity(cityId);
    }

    public static List<City> getCitiesByCountryId(String countryId){
        CityServiceImpl service = new CityServiceImpl();
        return service.getCitiesByCountryId(countryId);
    }
}
