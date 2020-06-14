package com.anhtuan.store.controller.admin;

import com.anhtuan.store.commons.constants.EndPointConst;
import com.anhtuan.store.commons.constants.ModelViewConst;
import com.anhtuan.store.commons.constants.ViewHtmlConst;
import com.anhtuan.store.controller.BaseController;
import com.anhtuan.store.dto.request.CategorySearchDto;
import com.anhtuan.store.dto.request.ProductAddEditDto;
import com.anhtuan.store.dto.request.ProductSearchRqDto;
import com.anhtuan.store.service.CategoryService;
import com.anhtuan.store.service.DiscountService;
import com.anhtuan.store.service.ProductService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequestMapping("/admin/products")
public class AdminProductController extends BaseController {
    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private DiscountService discountService;

    @GetMapping
    public String products(Model model, @ModelAttribute(ModelViewConst.Product.SEARCH_DTO) ProductSearchRqDto searchRqDto) {
        model.addAttribute(ModelViewConst.Product.PRODUCT_PAGEABLE, productService.getAll(searchRqDto));
        model.addAttribute(ModelViewConst.Product.SEARCH_DTO, new ProductSearchRqDto());
        return ViewHtmlConst.Products.ADMIN_LIST;
    }

    @GetMapping("/add")
    public String showCreateProductPage(Model model) {

        model.addAttribute(ModelViewConst.Product.PRODUCT_ADD_EDIT_DTO, new ProductAddEditDto());
        model.addAttribute(ModelViewConst.Product.CATEGORY_LIST, categoryService.getAll(new CategorySearchDto()));
        model.addAttribute(ModelViewConst.Product.DISCOUNT_LIST, discountService.getAll());

        return ViewHtmlConst.Products.ADMIN_CREATE;
    }

    @SneakyThrows
    @PostMapping("/add")
    public String submitCreate(Model model,
                               @ModelAttribute(ModelViewConst.Product.PRODUCT_ADD_EDIT_DTO) ProductAddEditDto productAddEditDto,BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            model.addAttribute(ModelViewConst.Product.PRODUCT_ADD_EDIT_DTO, productAddEditDto);
            model.addAttribute(ModelViewConst.Product.CATEGORY_LIST, categoryService.getAll(new CategorySearchDto()));
            model.addAttribute(ModelViewConst.Product.DISCOUNT_LIST, discountService.getAll());
            return ViewHtmlConst.Products.ADMIN_CREATE;
        }
        productService.createProduct(productAddEditDto);

        return redirect(EndPointConst.Products.ADMIN_LIST);
    }
}
