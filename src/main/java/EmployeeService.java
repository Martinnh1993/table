import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeService {

    //dependency injection to use UserRepo class
    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }
}
