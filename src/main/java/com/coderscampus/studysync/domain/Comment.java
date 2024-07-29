package com.coderscampus.studysync.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    private StudyGroup studyGroup;

    private Boolean isFlagged;
}
