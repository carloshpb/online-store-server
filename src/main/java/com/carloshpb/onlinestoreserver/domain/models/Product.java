package com.carloshpb.onlinestoreserver.domain.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull
    @Column(name = "description", nullable = false)
    private String description;

    @NotNull
    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @NotNull
    @Column(name = "stock_quantity", nullable = false)
    private int stockQuantity;

    @Column(name = "created_at")
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createdDate;

    @Column(name = "last_mofidied_at")
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime lastModifiedDate;

    @OneToMany
    @JoinColumn(name = "category_id")
    private List<Category> categories;


    public Product() {
    }

    public Product(Long id, String name, String description, BigDecimal price, int stockQuantity, LocalDateTime createdDate, LocalDateTime lastModifiedDate, List<Category> categories) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.categories = categories;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return this.stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public LocalDateTime getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public List<Category> getCategories() {
        return this.categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Product id(Long id) {
        setId(id);
        return this;
    }

    public Product name(String name) {
        setName(name);
        return this;
    }

    public Product description(String description) {
        setDescription(description);
        return this;
    }

    public Product price(BigDecimal price) {
        setPrice(price);
        return this;
    }

    public Product stockQuantity(int stockQuantity) {
        setStockQuantity(stockQuantity);
        return this;
    }

    public Product createdDate(LocalDateTime createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public Product lastModifiedDate(LocalDateTime lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    public Product categories(List<Category> categories) {
        setCategories(categories);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Product)) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(name, product.name) && Objects.equals(description, product.description) && Objects.equals(price, product.price) && stockQuantity == product.stockQuantity && Objects.equals(createdDate, product.createdDate) && Objects.equals(lastModifiedDate, product.lastModifiedDate) && Objects.equals(categories, product.categories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, price, stockQuantity, createdDate, lastModifiedDate, categories);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            ", price='" + getPrice() + "'" +
            ", stockQuantity='" + getStockQuantity() + "'" +
            ", createdDate='" + getCreatedDate() + "'" +
            ", lastModifiedDate='" + getLastModifiedDate() + "'" +
            ", categories='" + getCategories() + "'" +
            "}";
    }
     
}
