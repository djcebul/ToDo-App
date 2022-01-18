package pl.lihscebula.todo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
interface SqlTaskRepository extends JpaRepository<Task, Integer>, TaskRepository{

    @Override
    boolean existsByDoneIsFalseAndGroup_Id(Integer groupId);

//    @Override
//    @RestResource(exported = false)
//    void deleteById(Integer integer);
//
//    @Override
//    @RestResource(exported = false)
//    void delete(Task entity);

//    @RestResource(path="done", rel="done")
//    List<Task> findByDone(@Param("state") boolean done);
}
