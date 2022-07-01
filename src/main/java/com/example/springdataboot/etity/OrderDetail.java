package com.example.springdataboot.etity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "oder_details")
public class OrderDetail {
    @EmbeddedId
    private OrderDetailid orderDetailid;
    @ManyToOne
    @JoinColumn(name = "order_id" ,insertable = false,updatable = false)
    private Order order;
    @ManyToOne
    @JoinColumn(name = "product_id" ,insertable = false,updatable = false)
    private  Product product;
    private int quantity;
    private double unitPrice;
}
