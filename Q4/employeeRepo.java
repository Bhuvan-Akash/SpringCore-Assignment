package Q4;
import org.springframework.data.repository.CrudRepository;
@Repository
public interface employeeRepo extends CrudRepository<employee, String> {

}
