package com.anhtuan.store.commons.constants;

public interface ViewHtmlConst {
    String ERROR = "error";

    interface Users {
        String SIGN_UP_SIGN_IN = "login";
    }

    interface Products {
        String LIST = "/products/list";
        String DETAIL = "products/detail";
    }

    interface Carts {
        String LIST = "/cart/list";
        String REDIRECT_CARTS = "redirect:/carts";
    }

    interface Checkout {
        String CHECKOUT = "/checkout/checkout";
    }
}
