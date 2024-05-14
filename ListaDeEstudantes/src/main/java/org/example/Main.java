/*Fazer um programa que pega o nome, gênero, idade, pontuação de cada estudante;
Calcule a média de cada aluno, dizendo se foi aprovado ou não;
Diga qual foi a maior e menor pontuação por gênero, juntamente com o nome do aluno que tirou respectivas notas;
Mostrar na tela a lista dos alunos;*/
package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner enter = new Scanner(System.in);


        ArrayList<Student>listOfStudents = new ArrayList<>();
        String answer ;
        Student worstMaleStudent = null;
        Student topFemaleStudent = null;
        Student topMaleStudent  = null;
        Student worstFemaleStudent = null;

        do {
            Student student = new Student();
            System.out.print("Type the name of students: ");
            student.setNome(enter.nextLine());

            System.out.print("Type the gender (male/female): ");
            student.setGender(enter.nextLine());

            System.out.print("Type the age: ");
            student.setAge(enter.nextInt());


            System.out.print("Type the pontuation: ");
            student.setPontuation(enter.nextDouble());
            enter.nextLine();
            if (student.getPontuation()>=6) System.out.println("Approved");
            if (student.getPontuation()<6) System.out.println("Disapproved");

            if (student.getGender().equalsIgnoreCase("male")){
                if (topMaleStudent == null || student.getPontuation()> topMaleStudent.getPontuation()){
                    topMaleStudent = student;
                }
                if (worstMaleStudent == null || student.getPontuation() < worstMaleStudent.getPontuation()) {
                    worstMaleStudent = student;
                }
                if (worstFemaleStudent == null || student.getPontuation() < worstFemaleStudent.getPontuation()){
                    worstFemaleStudent = student;
                }
            }
            if (student.getGender().equalsIgnoreCase("female")) {
                if (topFemaleStudent == null || student.getPontuation()> topFemaleStudent.getPontuation()) {
                    topFemaleStudent = student;
                }
            }
            listOfStudents.add(student);

            System.out.print("Do you want to continue? ");
            answer = enter.nextLine();
        } while(!"no".equalsIgnoreCase(answer));

       if (topMaleStudent != null)
           System.out.println("The highest pontuation among men was: " + topMaleStudent.getNome()
                   + "with a score of: " + topMaleStudent.getPontuation() );
       if (topFemaleStudent != null)
           System.out.println("The highest pontuation among women was: " + topFemaleStudent.getNome()
                   + "with a score of: " + topFemaleStudent.getPontuation() );
       if (worstMaleStudent != null)
           System.out.println("The worst pontuation among men was: " + worstMaleStudent.getNome()
                    + "with a score of: " + worstMaleStudent.getPontuation() );
       if (worstFemaleStudent != null)
           System.out.println("The worst pontuation among women was: " + worstFemaleStudent.getNome()
                    + "with a score of: " + worstFemaleStudent.getPontuation() );


        System.out.println("The list of students: " + listOfStudents);
        enter.close();




    }
}



