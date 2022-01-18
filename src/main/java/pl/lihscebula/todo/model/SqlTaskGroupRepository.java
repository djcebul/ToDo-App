package pl.lihscebula.todo.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SqlTaskGroupRepository extends JpaRepository<TaskGroups, Integer>, TaskGroupRepository {

}
