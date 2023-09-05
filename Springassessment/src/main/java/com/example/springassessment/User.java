package com.example.springassessment;

import jakarta.persistence.*;

public class User {
     @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long uid;
        private String uname;
        private String uemail;
        private String gender;
        private int age;
        private String country;
    }

