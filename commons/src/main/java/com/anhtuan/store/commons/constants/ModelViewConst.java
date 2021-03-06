package com.anhtuan.store.commons.constants;

public interface ModelViewConst {
    String DISPLAY_DATETIME_FORMAT = "displayDatetimeFormat";
    String DISPLAY_DATE_FORMAT = "displayDateFormat";
    String JS_DISPLAY_DATETIME_FORMAT = "jsDisplayDatetimeFormat";
    String JS_DISPLAY_DATE_FORMAT = "jsDisplayDateFormat";
    String LOGIN_FACEBOOK_URL = "loginFacebookUrl";

    interface User {
        String USER_REGISTER_DTO = "userRegisterDto";
        String USER_PROFILE_DTO = "userProfileDto";
    }

    interface Product {
        String PRODUCT_PAGEABLE = "products";
        String SEARCH_DTO = "searchDto";
        String PRODUCT_DETAIL = "productDetail";
        String PRODUCT_ADD_EDIT_DTO = "productDto";
        String CATEGORY_LIST = "categories";
        String DISCOUNT_LIST = "discounts";
    }

    interface Carts {
        String TOPPING = "toppingRq";
        String LIST = "items";
    }

    interface Sizes {
        String LIST = "sizes";
    }

    interface checkouts {
        String USER_INFO = "userInfo";
        String CART_INFO = "cartInfo";
        String TOTAL_CART = "totalCart";
        String ORDER_INFO = "orderInfo";

    }

    interface Reviews {
        String REVIEW_INFO = "reviewInfo";
    }

    interface Password {
        String PASSWORD_FORGOT_DTO ="passwordForgotDto";
        String PASSWORD_RESET_DTO ="passwordResetDto";
    }

    interface Category {
        String CATEGORY_PAGEABLE = "categories";
        String CATEGORY_SEARCH = "categorySearchDto";
        String CATEGORY_DTO = "categoryDto";
        String CATEGORY_LIST_HEADER = "headerCategories";
    }

    interface Order {
        String LIST = "orders";
        String REDIRECT = "orderRqDto";
    }

    interface Discount {
        String LIST = "discounts";
        String DISCOUNT_SEARCH_DTO = "discountSearchDto";
    }
}
