package org.example.codelab;

import java.time.Period;
import java.util.Scanner;
import java.time.LocalDate;


public class Codelab {
    public static void main(String[] args) {
        String namaKamu;
        String lakiAtauPerempuan;


        Scanner objInput = new Scanner(System.in);

        System.out.print("Nama : ");
        namaKamu = objInput.nextLine();

        System.out.print("Jenis Kelamin (L/P) : ");
        lakiAtauPerempuan = objInput.nextLine();

        System.out.print("Tanggal Lahir (yyyy-mm-dd) : ");
        String tanggallahir = objInput.next();

        LocalDate tanggal = LocalDate.parse(tanggallahir);
        LocalDate hariIni = LocalDate.now();
        Period agePeriod = Period.between(tanggal, hariIni);
        int tahun = agePeriod.getYears();
        int bulan = agePeriod.getMonths();

        System.out.println("Nama : " + namaKamu);
        System.out.println("Jenis Kelamin : " + lakiAtauPerempuan);
        System.out.println("Umur Anda : " + tahun + " tahun " + bulan + "bulan");
    }
}