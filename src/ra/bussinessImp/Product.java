package ra.bussinessImp;

import ra.bussiness.IProduct;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Product  implements IProduct, Comparable<Product> {
    private int productId;
    private String productName;
    private String title;
    private String description;
    private float importPrice;
    private float exportPrice;
    private float interest;
    private boolean productStatus;

    public Product() {
    }

    public Product(int productId, String productName, String title, String description, float importPrice, float exportPrice, float interest, boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.title = title;
        this.description = description;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = interest;
        this.productStatus = productStatus;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public void inputData() {
        Scanner sc=new Scanner(System.in);

        // Nhap Id san pham:
        System.out.println("Nhap Id san pham");
        this.productId = sc.nextInt();


        //Nhap ten san pham:
        sc.nextLine();
        System.out.println("Nhap ten san pham:");
        this.productName=sc.nextLine();


        //Nhap tieu de cho san pham:
        System.out.println("Nhap tieu de gioi thieu san pham:");
        this.title=sc.nextLine();
//        sc.nextLine();

        //Nhap mo ta san pham:
        System.out.println("Nhap mo ta cho san pham:");
        this.description=sc.nextLine();
//        sc.nextLine();

        //Nhap gia nhap vao:
        System.out.println("Nhap gia nhap vao cua san pham ($):");
        this.importPrice=sc.nextFloat();
//        sc.next();

        //Nhap gia xuat ra:
        System.out.println("Nhap gia xuat ra cua san pham ($):");
        this.exportPrice=sc.nextFloat();
//        sc.next();

        //Nhap tinh trang san pham:
        System.out.println("Nhap trang thai san pham (true/false):");
        this.productStatus=sc.nextBoolean();

        //Tinh loi nhuan:
        this.interest = this.exportPrice-this.importPrice;

    }

    @Override
    public void displayData() {
        System.out.println("Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", importPrice=" + importPrice +
                ", exportPrice=" + exportPrice +
                ", interest=" + interest +
                ", productStatus=" + productStatus +
                '}');
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", importPrice=" + importPrice +
                ", exportPrice=" + exportPrice +
                ", interest=" + interest +
                ", productStatus=" + productStatus +
                '}';
    }

    @Override
    public int compareTo(Product product) {
        return (int) (this.interest-product.interest);
    }
}
