package pl.kubal.portfolio;

import org.springframework.data.repository.CrudRepository;
import pl.kubal.portfolio.models.Project;

import java.util.List;

/**
 * Created by Jim on 2017-06-10.
 */
public interface ProjectRepository extends CrudRepository<Project, Integer> {
    List<Project> findAll();
}
