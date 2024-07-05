package com.workintech.s18d1.util;


import com.workintech.s18d1.entity.BreadType;
import com.workintech.s18d1.exceptions.BurgerException;
import org.springframework.http.HttpStatus;

public class BurgerValidation {
    public static void checkId(Long id) {
        if (id < 0) {
            throw new BurgerException("ERROR: Id < 0  " + id, HttpStatus.BAD_REQUEST);
        }
    }

    public static void checkPrice(Double price) {
        if (price < 0) {
            throw new BurgerException("ERROR: Price < 0 " + price, HttpStatus.BAD_REQUEST);
        }
    }

    public static void checkBreadType(BreadType breadType) {
        if (breadType != BreadType.WRAP && breadType != BreadType.BURGER && breadType != BreadType.DOUBLE) {
            throw new BurgerException("Unknown Bread Type: " + breadType, HttpStatus.BAD_REQUEST);
        }
    }
}

