package com.example.springdataboot.etity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class OrderDetailid implements Serializable {
    @Column(name = "oder_id")
    private long orderId;
    @Column(name = "product_id")
    private  long productId;
}
