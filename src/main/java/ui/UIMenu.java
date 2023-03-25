/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.util.ArrayList;
import java.util.Scanner;
import model.Doctor;
import model.Patient;

/**
 *
 * @author etc-1
 */
public class UIMenu {
    
    public final static String[] MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"}; 
    public static Doctor doctorLogged;
    public static Patient patientLogged;
    
    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    authUser(1);
                    response = 0;
                    break;
                case 2:
                    response = 0;
                    //showPatientMenu();
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }
    
    private static void authUser(int userType){
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Matrinez", "alejandro@mail.com"));
        doctors.add(new Doctor("Karen Sosa", "karen@mail.com"));
        doctors.add(new Doctor("Rocio Gomez", "rocio@mail.com"));
        
        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Anahi Salgado", "anahi@mail.com"));
        patients.add(new Patient("Roberto Rogriguez", "roberto@mail.com"));
        patients.add(new Patient("Carlos Sanchez", "carlos@mail.com"));
        
        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if(userType == 1){
                for (Doctor d: doctors){
                    if(d.getEmail().equals(email)){
                        emailCorrect = true;
                        doctorLogged = d;
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }
            
            if(userType == 2){
                for (Patient p: patients){
                    if(p.getEmail().equals(email)){
                        emailCorrect = true;
                        patientLogged = p;
                        UIPatientMenu.showPatientMenu();
                    }
                }
            }
        }
        while(!emailCorrect);
    }

    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for(int i = 0; i < 4 ; i++ ){
                        System.out.println(i + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
}
