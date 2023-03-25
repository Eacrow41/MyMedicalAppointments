/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mymedicalappointments;
import model.Doctor;
import java.util.Date;
import model.AppointmentDoctor;
import model.ISchedulable;
import model.Patient;
import model.User;
import static ui.UIMenu.*;

/**
 *
 * @author etc-1
 */
public class Main {
    public static void main(String[] args) {
      
            
        showMenu();
        /*
        //Se llama al metodo constructor ()
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Alejandro Rodriguez";
        myDoctor.showName();
        System.out.println(Doctor.id);
        
        Doctor.id++;
        
        Doctor myDoctorAnn = new Doctor();
        myDoctor.showId();
        System.out.println(Doctor.id);
        */
        //Albergar codigo que es statico se llama directamente para no instanciarlo
        //showMenu();
        
        /*Doctor myDoctor = new Doctor("Anahi Salgado", "Pediatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);
        */
        /*
        Doctor myDoctor = new Doctor("Anahi Salgado", "Pediatria");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        for (Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
        
        User user = new Doctor("Anahi", "ana@mail.com");
        user.showDataUser();
        
        User userPa = new Patient("Anahi", "ana@mail.com");
        userPa.showDataUser();
        User user1 = new User("Anahi", "ana@mail.com"){
            @Override
            public void showDataUser(){
                System.out.println("Doctor\n");
                System.out.println("Hospital: Cruz Verde");
                System.out.println("Departamento: Geriatria");
            }
        };
        
        user1.showDataUser();
        */
        
        /*
        Patient patient = new Patient("Alejandra", "alejandra@gmail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());
        
        patient.setPhoneNumber("1234567");
        System.out.println(patient.getPhoneNumber());
        */
    }
   
}
