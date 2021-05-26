package com.bluff.celebrytalk.domain.user;

import com.bluff.celebrytalk.domain.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "user_status")
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserStatus extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "user_status_id")
    private Long id;
}
