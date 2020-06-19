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
    ProductDao productDao;
    ItemDao itemDao;
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Invoice invoice1 = new Invoice("101");

        Product car = new Product("Car");
        Item item1 = new Item(car,new BigDecimal(99), 10, new BigDecimal(999));
        Item item2 = new Item(car,new BigDecimal(100), 10, new BigDecimal(1000));
        Item item3 = new Item(new Product("Scooter"), new BigDecimal(50), 10, new BigDecimal(500));
        Item item4 = new Item(new Product("SkateBoard"),new BigDecimal(20), 10, new BigDecimal(200));

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);
        invoice1.getItems().add(item4);

        //When
//        productDao.save();
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        itemDao.save(item4);

        invoiceDao.save(invoice1);

        int idItem1 = item1.getId();
        int idItem2 = item2.getId();
        int idItem3 = item1.getId();
        int idItem4 = item1.getId();

        int idInvoice = invoice1.getId();


        //Then
        Assert.assertNotEquals(0, idItem1);
        Assert.assertNotEquals(0, idItem2);
        Assert.assertNotEquals(0, idItem3);
        Assert.assertNotEquals(0, idItem4);
        Assert.assertNotEquals(0, idInvoice);

        //CleanUp
        itemDao.deleteById(idItem1);
        itemDao.deleteById(idItem2);
        itemDao.deleteById(idItem3);
        itemDao.deleteById(idItem4);

        invoiceDao.deleteById(idInvoice);
    }
}
