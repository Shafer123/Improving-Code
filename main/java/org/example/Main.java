package org.example;

import java.awt.*;
import java.util.Collections;
public class Main {
    public static <culture> void main(String[] args) {

        Menu menu = new Menu();

        menu.disableMenu();


        Recipe recipe = new recipe("Miso", "Lunch", "Japanese",
                Collections.singletonList((("Tofu, egg, broth"))), "tofu");
        culture culture = new Culture("American");


    }



}