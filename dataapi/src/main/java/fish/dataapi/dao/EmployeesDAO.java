package fish.dataapi.dao;

import fish.service.model.Employees;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeesDAO {

    @Select("select * from employees")
    List<Employees> getEmployees();
}
