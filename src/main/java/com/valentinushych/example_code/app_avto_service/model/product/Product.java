package com.valentinushych.example_code.app_avto_service.model.product;

public class Product {
    private String typeProduct;
    private String priseProduct;

    public Product(String typeProduct, String priseProduct) {
        this.typeProduct = typeProduct;
        this.priseProduct = priseProduct;
    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public String getPriseProduct() {
        return priseProduct;
    }
}
