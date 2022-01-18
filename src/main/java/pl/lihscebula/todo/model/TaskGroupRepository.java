package pl.lihscebula.todo.model;

import java.util.List;
import java.util.Optional;

public interface TaskGroupRepository {
    List<TaskGroups> findAll(); //odczyt
    Optional<TaskGroups> findById(Integer id); //odczyt pojedynczego
    TaskGroups save(TaskGroups entity); //zapis
}
