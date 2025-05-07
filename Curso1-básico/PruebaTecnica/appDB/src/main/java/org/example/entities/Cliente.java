package org.example.entities;

import jakarta.persistence.*;

import java.util.Date;


public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false,length = 300)
    private String nombre;

    @Column
    private String apellidos;



    @Column
    private String sexo;

    @Column
    private String ciudad;

    @Column
    private Date fechaNacimiento;

    @Column
    private String telefono;

    @Column(name ="email")
    private String correoElectronico;

    public Cliente() {
    }

    public Cliente(Integer id, String nombre, String apellidos, String sexo, String ciudad, Date fechaNacimiento, String telefono, String correoElectronico) {

        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.ciudad = ciudad;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }



    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "nombre: '" + nombre + '\'' +
                ", apellidos: '" + apellidos + '\'' +
                ", sexo: '" + sexo + '\'' +
                ", ciudad: '" + ciudad + '\'' +
                ", fechaNacimiento: " + fechaNacimiento +
                ", telefono: '" + telefono + '\'' +
                ", correoElectronico: '" + correoElectronico + '\'' +
                '}';
    }
}