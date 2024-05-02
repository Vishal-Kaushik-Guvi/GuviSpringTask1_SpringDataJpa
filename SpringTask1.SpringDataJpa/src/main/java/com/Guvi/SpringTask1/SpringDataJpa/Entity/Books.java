package com.Guvi.SpringTask1.SpringDataJpa.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Books {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int bookId;

private String username;
private String bookname;
private String bookfeedback;
}
