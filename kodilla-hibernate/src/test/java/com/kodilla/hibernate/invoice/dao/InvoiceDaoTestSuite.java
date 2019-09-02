package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product bike1 = new Product("Bike 1");
        Product bike2 = new Product("Bike 2");
        Product bike3 = new Product("Bike 3");

        Item breaks = new Item (bike1, new BigDecimal(100), 3, new BigDecimal(300));
        Item wheels = new Item(bike2, new BigDecimal(50), 2,new BigDecimal(70));
        Item bicycleSaddle = new Item(bike3, new BigDecimal(45),1, new BigDecimal(40));

        Invoice invoice1 = new Invoice("2019/08/07");
        Invoice invoice2 = new Invoice("2019/08/08");
        Invoice invoice3 = new Invoice("2019/09/01");

        bicycleSaddle.setProduct(bike1);
        breaks.setProduct(bike1);
        wheels.setProduct(bike1);
        wheels.setProduct(bike2);
        wheels.setProduct(bike3);
        breaks.setProduct(bike3);

        invoice1.getItems().add(breaks);
        invoice1.getItems().add(bicycleSaddle);
        invoice1.getItems().add(wheels);
        invoice2.getItems().add(wheels);
        invoice2.getItems().add(breaks);
        invoice3.getItems().add(breaks);

        //When
        productDao.save(bike1);
        int bike1Id = bike1.getId();
        productDao.save(bike2);
        int bike2Id = bike2.getId();
        productDao.save(bike3);

        int bike3Id = bike3.getId();
        itemDao.save(bicycleSaddle);
        int bicycleSaddleId = bicycleSaddle.getId();
        itemDao.save(breaks);
        int breaksId = breaks.getId();
        itemDao.save(wheels);
        int wheelId = wheels.getId();

        invoiceDao.save(invoice1);
        int invoice1Id = invoice1.getId();
        invoiceDao.save(invoice2);
        int invoice2Id = invoice2.getId();
        invoiceDao.save(invoice3);
        int invoice3Id = invoice3.getId();

        //Than
        Assert.assertNotEquals(0,invoice1Id);
        Assert.assertNotEquals(0, invoice2Id);
        Assert.assertNotEquals(0,invoice3Id);

        //CleanUp
        productDao.deleteById(bike1Id);
        productDao.deleteById(bike2Id);
        productDao.deleteById(bike3Id);
        invoiceDao.deleteById(invoice1Id);
        invoiceDao.deleteById(invoice2Id);
        invoiceDao.deleteById(invoice3Id);
    }
}
