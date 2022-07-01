package com.example.springdataboot.etity;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToOne(cascade = CascadeType.ALL)  //chú Ý All hoặc các trường hợp khác
    @JoinColumn(name = "identityCardId")
    private IdentityCard identityCard;
}
