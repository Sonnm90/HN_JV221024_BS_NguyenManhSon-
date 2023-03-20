package ra.run;

import ra.bussinessImp.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    static int size;
    static List<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        boolean cont = true;
        int choice;
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("****************JAVA-HACKATHON-05-BASIC-MENU***************\n" +
                    "1. Nhập số sản phẩm và nhập thông tin sản phẩm \n" +
                    "2. Hiển thị thông tin các sản phẩm \n" +
                    "3. Sắp xếp sản phẩm theo lợi nhuận tăng dần \n" +
                    "4. Xóa sản phẩm theo mã sản phẩm \n" +
                    "5. Tìm kiếm sản phẩm theo tên sản phẩm \n" +
                    "6. Thay đổi trạng thái của sản phẩm theo mã sản phẩm \n" +
                    "7. Thoát ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhap so luong san pham");
                    size = sc.nextInt();
//                   products= new Product[size];
                    for (int i = 0; i < size; i++) {
                        System.out.println("Nhap thong tin san pham thu" + (i + 1) + " :");
                        products.add(new Product());
                        products.get(i).inputData();
                    }
                    break;
                case 2:
                    for (int i = 0; i < products.size(); i++) {

                        products.get(i).displayData();
                    }
                    break;
                case 3:
                    System.out.println("Mang truoc khi sap xep tang dan loi nhuan: "+products);
                    Collections.sort(products);
                    System.out.println("Mang sau khi sap xep tang dan loi nhuan: "+products);
                    break;
                case 4:
                    System.out.println("Nhap ma san pham can xoa:");
                    int removeId= sc.nextInt();
                    System.out.println("Mang truoc khi xoa: "+products);
                    for (int i = 0; i < products.size(); i++) {
                       if(products.get(i).getProductId()==removeId){
                           products.remove(i);
                       }
                    }
                    System.out.println("Mang sau khi xoa: "+products);
                    break;
                case 5:
                    sc.nextLine();
                    System.out.println("Nhap ten san pham can tim kiem:");
                    String findProductName= sc.nextLine();
                    for (int i = 0; i < products.size(); i++) {
                        if(products.get(i).getProductName().contains(findProductName)){
                            products.get(i).displayData();
                        }
                    }
                    break;
                case 6:
                    System.out.println("Nhap ma san pham can thay doi trang thai:");
                    int changeStatus= sc.nextInt();
                    for (int i = 0; i < products.size(); i++) {
                        if(products.get(i).getProductId()==changeStatus){
                            System.out.println("san pham truoc khi thay doi trang thai");
                            products.get(i).displayData();
                           boolean check= products.get(i).isProductStatus();
                           if (check){
                               products.get(i).setProductStatus(false);
                           } else
                               products.get(i).setProductStatus(true);
                            System.out.println("san pham sau khi thay doi trang thai");
                            products.get(i).displayData();
                        }
                    }
                    break;
                case 7:
                    cont = false;
            }


        } while (cont);
    }
}
