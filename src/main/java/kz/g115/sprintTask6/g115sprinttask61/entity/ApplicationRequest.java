package kz.g115.sprintTask6.g115sprinttask61.entity;

import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ApplicationRequest")
public class ApplicationRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private String courseName;
    private String commentary;
    private String phone;
    private boolean handled;

}
