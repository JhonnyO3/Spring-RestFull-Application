package com.example.demo.student;


import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "T_ST_STUDENT")

public class Student {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_student_seq")
    @SequenceGenerator(name = "id_student_seq", sequenceName = "id_student_seq", allocationSize = 1)

    private Long id;
    @Column(name = "NOME", nullable = false, unique = true, length = 255)
    private String nome;
    @Column(name = "EMAIL", nullable = false, unique = true, length = 255)

    private String email;
    @Transient
    @Column(name = "IDADE", nullable =true, unique = true, length = 255)

    private Integer idade;
    @Column(name = "DT_NASCIMENTO", nullable = false, unique = true, length = 255)

    private LocalDate dtNasc;

    public Student() {
    }

    public Student(Long id, String nome, String email , LocalDate dtNasc) {
        this.id = id;
        this.nome = nome;
        this.email = email;

        this.dtNasc = dtNasc;
    }

    public Student(String nome, String email, LocalDate dtNasc) {
        this.nome = nome;
        this.email = email;

        this.dtNasc = dtNasc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return Period.between(this.dtNasc, LocalDate.now()).getYears();
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public LocalDate getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(LocalDate dtNasc) {
        this.dtNasc = dtNasc;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", idade=" + idade +
                ", dtNasc=" + dtNasc +
                '}';
    }
}
