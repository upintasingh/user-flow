package org.com.userwithjpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Profile extends BaseModel{
    private String address;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
