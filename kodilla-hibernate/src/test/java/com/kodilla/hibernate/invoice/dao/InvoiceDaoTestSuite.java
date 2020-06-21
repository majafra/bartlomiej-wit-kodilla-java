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

import javax.transaction.Transactional;
import java.math.BigDecimal;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Invoice invoice1 = new Invoice("101");

        Product car = new Product("Car");
        Product scooter = new Product("Scooter");
        Product skateBoard = new Product("SkateBoard");

        Item item1 = new Item(car,new BigDecimal(99), 10, new BigDecimal(999));
        Item item2 = new Item(car,new BigDecimal(100), 10, new BigDecimal(1000));
        Item item3 = new Item(scooter, new BigDecimal(50), 10, new BigDecimal(500));
        Item item4 = new Item(skateBoard,new BigDecimal(20), 10, new BigDecimal(200));

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);
        invoice1.getItems().add(item4);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);
        item4.setInvoice(invoice1);

        //When
        productDao.save(car);
        productDao.save(scooter);
        productDao.save(skateBoard);
        invoiceDao.save(invoice1);
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        itemDao.save(item4);

        int idCar = car.getId();
        int idScooter = car.getId();
        int idSkateBoard = car.getId();
        int idItem1 = item1.getId();
        int idItem2 = item2.getId();
        int idItem3 = item1.getId();
        int idItem4 = item1.getId();
        int idInvoice = invoice1.getId();
        //Then
        Assert.assertNotEquals(0, idCar);
        Assert.assertNotEquals(0, idScooter);
        Assert.assertNotEquals(0, idSkateBoard);
        Assert.assertNotEquals(0, idItem1);
        Assert.assertNotEquals(0, idItem2);
        Assert.assertNotEquals(0, idItem3);
        Assert.assertNotEquals(0, idItem4);
        Assert.assertNotEquals(0, idInvoice);

        //CleanUp

        itemDao.delete(item1);
        itemDao.delete(item2);
        itemDao.delete(item3);
        itemDao.delete(item4);

        invoiceDao.delete(invoice1);

        productDao.delete(car);
        productDao.delete(scooter);
        productDao.delete(skateBoard);
    }
}
