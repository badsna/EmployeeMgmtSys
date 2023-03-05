package com.example.employeemgmtsys.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Data
@Entity //JPA enable garnu parxa
@Table(name = "userdtls")
public class UserDtls {
    //attribute ko name uta form ko name sanga match hunu parxa
    @Id
    @SequenceGenerator(name="userdtls_sequence",
    sequenceName = "userdtls_sequence",
    allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "userdtls_sequence"
    )
    @Column(name = "id")
    private Integer id;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "email")
    private String email;
    @Column(name = "address")
    private String address;
    @Column(name = "qulaification")
    private String qualification;
}
