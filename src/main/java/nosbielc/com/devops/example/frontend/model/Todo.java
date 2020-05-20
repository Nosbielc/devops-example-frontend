package nosbielc.com.devops.example.frontend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.StringJoiner;

/**
 * @author Cleibson Gomes (https://github.com/Nosbielc) ON 19/05/2020
 * @project devops-example-frontend
 */
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Todo {

    private Long id;
    private String task;
    @DateTimeFormat(pattern="dd/MM/yyyy")
    private LocalDate dueDate;

    @Override
    public String toString() {
        return new StringJoiner(", ", Todo.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("task='" + task + "'")
                .add("dueDate=" + dueDate)
                .toString();
    }
}
