package in.ashokit.controller;
import in.ashokit.exception.ResourceNotFoundException;
import in.ashokit.model.Product;
import in.ashokit.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Tag(name = "Products",description = "Product REST API endpoints")

@RestController
public class ProductRestController {
    private ProductService service;

    public  ProductRestController(ProductService service){
        this.service=service;
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Product> storeProduct(@RequestBody Product product){
        Product productFromService = service.saveProduct(product);
        return new ResponseEntity<>(productFromService, HttpStatus.CREATED);

    }
    @Operation(summary = "GET PRODUCT BY ID",
    description = "You can get the details of a product by id ")

    @ApiResponses({
            @ApiResponse(responseCode = "200",
                    description = "This server has successfully returned the response"),
            @ApiResponse(responseCode = "404",
            description = "The request url is not valid")
    })



    @GetMapping(value = "/product/{id}")
    public ResponseEntity<Product> getProductById(@Parameter(description ="The id of a product to fetch the details" )
                                                      @PathVariable String id){
        Product productFromService = service.fetchId(id);
        if (productFromService!=null){
            return new ResponseEntity<>(productFromService,HttpStatus.OK);
        }else {
            throw new ResourceNotFoundException("Product with id: "+ id + "doesn't exist");
        }
    }

    @PutMapping(value = "/update")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product){
        Product productAfterUpdate = service.updateProduct(product);
        return new ResponseEntity<>(productAfterUpdate,HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable String id){
        service.deleteProduct(id);
        return  new ResponseEntity<>("Product is Deleted",HttpStatus.OK);
    }

    @GetMapping(value = "/products")
    public ResponseEntity<List<Product>>getAllProducts(){
        List<Product> products = service.fetchAllProducts();
        return new ResponseEntity<>(products,HttpStatus.OK);
    }

}
