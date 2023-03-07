package com.example.employeemgmtsys.model;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.util.Collection;

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
    @Column(name = "password")
    private String password;

    //one user can have multiple roles
    //user sangaii role in retrive garnu parne vayaraw eager rakhya

    @Column(name = "role")
    private String role;

}
