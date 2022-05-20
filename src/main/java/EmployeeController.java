import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //display list of employees
    @GetMapping("/employee")
    public String viewEmployeePage(Model model){
        model.addAttribute("listOfEmployees",employeeService.getAllEmployees());
        return "index";
    }
}
