package com.example.demo.models;


import lombok.Data;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;

@Data
@Entity
public class ImagesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(columnDefinition = "LONGBLOB")
    private byte[] imageBytes;
    @JsonIgnore
    private Long userId;
    @JsonIgnore
    private Long postId;



}
