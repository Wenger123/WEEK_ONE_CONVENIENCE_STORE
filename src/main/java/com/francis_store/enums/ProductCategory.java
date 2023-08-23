package com.francis_store.enums;

public enum ProductCategory {
    ALCOHOLIC_DRINKS("Alcoholic drinks"),
    NON_ALCOHOLIC_DRINKS("Non Alcoholic Drinks"),
    COSMETICS("Cosmetics"),
    BEVERAGES("Beverages"),
    SEAFOODS("Sea Foods"),
    BAKERIES("Bakeries");

    private final String categoryName;

    ProductCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "categoryName='" + categoryName + '\'' +
                '}';
    }
}
