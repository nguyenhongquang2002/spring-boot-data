package com.example.springdataboot;

import com.example.springdataboot.etity.*;
import com.example.springdataboot.repository.AccountRepository;
import com.example.springdataboot.repository.OderRepository;
import com.example.springdataboot.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringdatabootApplication.class})
class SpringdatabootApplicationTests {
    @Autowired
    AccountRepository accountRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    OderRepository oderRepository;

    @Test
    public void testLinhTinh(){
//        Product product1 = Product.builder()
//                .name("product 01")
//                .build();
//        Product product2 = Product.builder()
//                .name("product 02")
//                .build();
//        productRepository.save(product1);
//        productRepository.save(product2);
        List<Product> products = productRepository.findAll();
        Order order = Order.builder()
                .id(System.currentTimeMillis())
                .createdAt(LocalDateTime.now())
                .status(1)
                .build();
        HashSet<OrderDetail> orderDetails = new HashSet<>();
        for (Product product :
                products) {
            OrderDetail orderDetail = OrderDetail.builder()
                    .orderDetailid(OrderDetailid.builder()
                    .orderId(order.getId())
                    .productId(product.getId())
                    .build())
                    .order(order)
                    .product(product)
                    .quantity(10)
                    .unitPrice(0)
                    .build();
            orderDetails.add(orderDetail);
        }
        order.setOrderDetails(orderDetails);
        oderRepository.save(order);
        System.out.println("Hello");
    }
}
