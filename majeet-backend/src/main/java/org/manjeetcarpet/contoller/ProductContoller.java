package org.manjeetcarpet.contoller;

import java.util.List;

import org.manjeetcarpet.modelVO.product.Product;
import org.manjeetcarpet.service.ProductOperationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/rest/product")
@Api(tags = "Product Endpoints")
@Validated
public class ProductContoller {

    private static final Logger logger = LoggerFactory.getLogger(ProductContoller.class);

    private final ProductOperationService productOperationService;

    public ProductContoller(ProductOperationService productOperationService) {
        this.productOperationService = productOperationService;
        Assert.notNull(productOperationService, "ProductOperationService must not be null."); 
        // TODO - Check of Optional to avoid nulls
    }

    @GetMapping("/showall")
    @ApiOperation("Get all Products avaliable")
    public synchronized String getAllProducts(){
        logger.info("Hitting endpoint /showall");
        List<Product> productList = productOperationService.getAllProducts();
        return productList.toString();
    }

    @GetMapping("/show/{attribute}/{target}")
    @ApiOperation("Get all Filtered Products, @Params(Arrtibute - String,Target - String)") 
    public synchronized String getAllProducts(@PathVariable String attribute, @PathVariable String target){
        //productOperationService.getfilteredProducts(attribute, target);
        return "Hello Bhai 2 !!!";
    }
}
