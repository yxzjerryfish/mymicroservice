package fish.dataapi.servedata;

import fish.dataapi.dao.EmployeesDAO;
import fish.service.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeesController {
    @Autowired
    EmployeesDAO employeesDAO;

    @GetMapping("/getAll")
    public List<Employees> getAllEmploy(){
        return employeesDAO.getEmployees();
    }
}
