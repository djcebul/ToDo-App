package pl.lihscebula.todo.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
@Table(name = "tasks")
public class Task{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Task's description must be not empty")
    private String description;
    private  boolean done;
    private LocalDateTime deadline;

    @Embedded
    private Audit audit = new Audit();
    @ManyToOne()
    @JoinColumn(name = "task_group_id")
    private TaskGroups group;

    public Task() {
    }

    public int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public LocalDateTime getDeadLine() {
        return deadline;
    }

    public void setDeadLine(LocalDateTime deadLine) {
        this.deadline = deadLine;
    }

    public void updateFrom(final Task source) {
        description = source.description;
        done = source.done;
        deadline = source.deadline;
        group = source.group;
    }

    TaskGroups getGroup() {
        return group;
    }
}
