package org.example.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    @Column(unique = true, nullable = false)
    private String phone;

    @Column(unique = true)
    private String email;

    private int age;

    @CreationTimestamp
    private Date createdOn;

    @UpdateTimestamp
    private Date updatedOn;
}
