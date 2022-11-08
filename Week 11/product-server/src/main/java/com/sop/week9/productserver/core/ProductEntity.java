package com.sop.week9.productserver.core;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name= "product")
@Data
public class ProductEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -4412122122222961810L;
    @Id
    @Column(unique = true)
    private String productId;
    private String title;
    private BigDecimal price;
    private Integer quantity;
}
