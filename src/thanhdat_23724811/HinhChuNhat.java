package thanhdat_23724811;

import java.util.Scanner;

    public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;
    public double getChieuDai() {
        return chieuDai;
    }
    public void setChieuDai(double d) {
        if (d>0) {
            this.chieuDai = d;
        }else {
            System.out.println("Loi");

        }
    }
    public double getChieuRong() {
        return chieuRong;
    }
    public void setChieuRong(double r) {
        if (r<=0) {
            System.out.println("Loi");

        } else {
            this.chieuRong = r;
        }


    }
    public HinhChuNhat() {}
    public HinhChuNhat(double d, double r) {
        if (d>0) {
            this.chieuDai = d;
        }else {
            System.out.println("Loi");

        }
        if (r<=0) {
            System.out.println("Loi");

        } else {
            this.chieuRong = r;
        }
    }
    public double getChuVi() {
        return (getChieuDai()+getChieuRong())*2;
    }
    public double getDienTich( ) {
        return getChieuDai() * getChieuRong();

    }
    public String toString() {
        System.out.println("%10s, ");

        return super.toString();
    }
    public static void main(String[] args) {
        HinhChuNhat h1 = new HinhChuNhat();
        h1.setChieuDai(7);
        h1.setChieuRong(2);
        System.out.println("Ket qua");
        System.out.println("Chieu dai la: "+h1.getChieuDai());
        System.out.println("Chieu rong la: "+h1.getChieuRong());
        System.out.println("Chu vi la: "+h1.getChuVi());
        System.out.println("Dien tich la: "+h1.getDienTich());

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu ban phim:");
        System.out.println("Nhap chieu dai:");
        double d = sc.nextDouble();
        h1.setChieuDai(d);

        System.out.println("Nhap chieu rong:");
        double r = sc.nextDouble();
        h1.setChieuRong(r);
        System.out.println("Ket qua nhap mem");
        System.out.println("Chieu dai la: "+h1.getChieuDai());
        System.out.println("Chieu rong la: "+h1.getChieuRong());
        System.out.println("Chu vi la: "+h1.getChuVi());
        System.out.println("Dien tich la: "+h1.getDienTich());

    }
}