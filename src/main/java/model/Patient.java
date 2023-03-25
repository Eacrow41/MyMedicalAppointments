/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author etc-1
 */
public class Patient  extends User {
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurse = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date, time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurse() {
        return appointmentNurse;
    }

    public void setAppointmentNurse(ArrayList<AppointmentNurse> appointmentNurse) {
        this.appointmentNurse = appointmentNurse;
    }
    
    // Constructor
    public Patient(String name, String email) {
        super(name, email);
    }
    
    public void setWeight(double weight){
        this.weight = weight;
    }
    
    public String getWeight(){
        return this.weight + "Kg.";
    }    
    
    public String getHeight(){
        return height + "Mts.";
    }  
    
    public void setHeight(double height){
        this.height = height ;
    }
        
    public int getId(){
        return id;
    }  
    
    public void setId(int id){
        this.id = id;
    }
       
    public String getBirthday(){
        return birthday;
    }  
    
    public void setBirthday(String birthday){
        this.birthday = birthday;
    }
    
    public String getBlood(){
        return blood;
    }
    
    public void setBlood(String blood){
        this.blood = blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial completo");
    }
}
