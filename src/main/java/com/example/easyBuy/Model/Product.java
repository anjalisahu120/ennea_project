package com.example.easyBuy.Model;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Entity
public class Product {

    @Id
    private String code;
    private String name;
    private String batch;
    private Integer stock;
    private Integer deal;
    private Integer free;
    private Integer mrp;
    private Integer rate;
    private Date exp;
    private String company;
    private String supplier;

    public Product() {
    }

    public Product(String code, String name, String batch, Integer stock, Integer deal, Integer free, Integer mrp, Integer rate, Date exp, String company, String supplier) {
        this.code = code;
        this.name = name;
        this.batch = batch;
        this.stock = stock;
        this.deal = deal;
        this.free = free;
        this.mrp = mrp;
        this.rate = rate;
        this.exp = exp;
        this.company = company;
        this.supplier = supplier;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getBatch() {
        return batch;
    }

    public Integer getStock() {
        return stock;
    }

    public Integer getDeal() {
        return deal;
    }

    public Integer getFree() {
        return free;
    }

    public Integer getMrp() {
        return mrp;
    }

    public Integer getRate() {
        return rate;
    }

    public Date getExp() {
        return exp;
    }

    public String getCompany() {
        return company;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setDeal(Integer deal) {
        this.deal = deal;
    }

    public void setFree(Integer free) {
        this.free = free;
    }

    public void setMrp(Integer mrp) {
        this.mrp = mrp;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public void setExp(Date exp) {
        this.exp = exp;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(code, product.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", batch='" + batch + '\'' +
                ", stock=" + stock +
                ", deal=" + deal +
                ", free=" + free +
                ", mrp=" + mrp +
                ", rate=" + rate +
                ", exp=" + exp +
                ", company='" + company + '\'' +
                ", supplier='" + supplier + '\'' +
                '}';
    }
}
